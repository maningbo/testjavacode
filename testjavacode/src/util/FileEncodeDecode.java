package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * FileEncodeDecode.java Description:
 * 
 * CreateDate: 2015年12月18日 上午8:22:24
 * 
 * @author 马宁波
 */
public class FileEncodeDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		if (encryptFile("C:/Users/maningbo/Desktop/Test.log",// 需要加密的文件
				"C:/Users/maningbo/Desktop/jiami.png", // 加密后存放的文件
				"")// 加密密码，任意英文字符，可以为""
		) {
			System.out.println("加密成功！");
		} else {
			System.out.println("加密失败！");
		}

		if (decryptFile("C:/Users/maningbo/Desktop/jiami.png",// 需要解密的文件
				"C:/Users/maningbo/Desktop/Test1.log", // 解密后存放的文件
				"")// 解密密码，任意英文字符，可以为""，但必须与加密时用的密码相同才能成功解密
		) {
			System.out.println("解密成功！");
		} else {
			System.out.println("解密失败！");
		}
	}

	/**
	 * 加密文件
	 * 
	 * @param jiamiqianPath需要加密的文件
	 * @param jiamihouPath加密后存放的文件
	 * @param password加密密码，任意英文字符，可以为""
	 * @return
	 */
	public static boolean encryptFile(String jiamiqianPath,
			String jiamihouPath, String password) {
		InputStream in = null;
		OutputStream out = null;
		int key = getKey(password);
		try {
			File jiamiqianFile = new File(jiamiqianPath);
			File jiamihouFile = new File(jiamihouPath);
			in = new FileInputStream(jiamiqianFile);// 指定要读取的文件
			if (!jiamiqianFile.exists()) {
				return false;
			}
			out = new FileOutputStream(jiamihouFile);// 指定要写入的文件
			int n = 0;// 每次读取的字节长度
			byte[] bb = new byte[1024];// 存储每次读取的内容
			while ((n = in.read(bb)) != -1) {
				out.write(encode(bb, key), 0, n);// 将读取的内容，写入到输出流当中
			}
			return true;
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		} finally {
			// 关闭输入输出流
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 解密文件
	 * 
	 * @param jiamiqianPath需要解密的文件
	 * @param jiamihouPath解密后存放的文件
	 * @param password解密密码，任意英文字符，可以为""，但必须与加密时用的密码相同才能成功解密
	 * @return
	 */
	public static boolean decryptFile(String jiemiqianPath,
			String jiemihouPath, String password) {
		InputStream in = null;
		OutputStream out = null;
		int key = getKey(password);
		try {
			File jiamiqianFile = new File(jiemiqianPath);
			File jiamihouFile = new File(jiemihouPath);
			in = new FileInputStream(jiamiqianFile);// 指定要读取的文件
			if (!jiamiqianFile.exists()) {
				return false;
			}
			out = new FileOutputStream(jiamihouFile);// 指定要写入的文件
			int n = 0;// 每次读取的字节长度
			byte[] bb = new byte[1024];// 存储每次读取的内容
			while ((n = in.read(bb)) != -1) {
				out.write(decode(bb, key), 0, n);// 将读取的内容，写入到输出流当中
			}
			return true;
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		} finally {
			// 关闭输入输出流
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 根据字符串获得int类型的key
	 * 
	 * @param password
	 * @return
	 */
	private static int getKey(String password) {
		if (password != null) {
			byte[] strbyte = password.getBytes();
			int key = 0;
			for (int i = 0; i < strbyte.length; i++) {
				System.out.print(strbyte[i] + ",");
				key = key + strbyte[i];
			}
			return key + 234442;
		} else {
			Random r = new Random();
			r.setSeed(874027263);
			return r.nextInt();
		}
	}

	/**
	 * 加密byte数组
	 * 
	 * @param in
	 * @param out
	 * @param password
	 */
	private static byte[] encode(byte[] in, int password) {
		int len = in.length;
		byte[] out = new byte[len];
		int seed = password ^ 0x3f1ef5e4;
		for (int i = 0; i < len; ++i) {
			byte a = (byte) ((in[i] ^ seed) >> 3);
			// 说明①: in[i]的高5位给了a的低5位
			byte b = (byte) (((((int) in[i]) << 18) ^ seed) >> (18 - 5));
			// 说明②: in[i]的低3位给了b的高3位
			a &= 0x1f;
			// 0x1f=16+15=31=2^5-1=00011111;
			b &= 0xe0;
			// 0xe0=11100000;
			out[i] = (byte) (a | b);
			seed = (seed * 9454513 ^ seed ^ out[i]);
		}
		return out;
	}

	/**
	 * 解密byte数组
	 * 
	 * @param in
	 * @param password
	 * @return
	 */
	private static byte[] decode(byte[] in, int password) {
		int len = in.length;// encode中的out[i]是这里decode中的in[i]
		byte[] out = new byte[len];
		int seed = password ^ 0x3f1ef5e4;
		for (int i = 0; i < len; ++i) {
			byte a = (byte) (in[i] & 0x1f);
			// 还原输出结果，取in[i]的低5位
			byte b = (byte) (in[i] & 0xe0);
			// 还原输出结果，取in[i]的高3位
			a = (byte) (((a << 3) ^ seed) & 248);
			// 参照定理三B ^ A^ A = B，参照式①byte a = (byte) ((in[i] ^ seed) >>> 3)
			// 式①中的in[i]相当于B，seed相当于A，(a<<3)相当 B ^ A 故((a <<3) ^ seed)表示in[i]高5
			// 位的这5个数字，为了将这5个数字放入高5位的位置上，还需&11111000，即&248。
			// 11111000=2^7+2^6+2^5+2^4+2^3=128+64+32+16+8=248
			b = (byte) ((((((int) b) << (18 - 5)) ^ seed) >> 18) & 7);
			// 类似地，逆向式②，得到的结果将放入out[i]的低3位，故&00000111，即&7。
			// 00000111=2^0+2^1+2^2=1+2+4=7
			out[i] = (byte) (a | b);
			seed = (seed * 9454513 ^ seed ^ in[i]);
		}
		return out;
	}
}