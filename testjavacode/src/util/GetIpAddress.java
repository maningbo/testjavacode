package util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * GetIpAddress.java Description:
 * 获取本机ip地址，尚存在问题
 * 参考链接：http://zhidao.baidu.com/link?url=UusmjJfi5NpREjJO_8d7WLwfeu5ujI-ODFJbnEFF4SvoDUzH5XyN8VlU-g20KJMnxYlgalBIVnExGTbhfvcrJa
 * CreateDate: 2016年1月27日 上午11:18:38
 * @author 马宁波
 */
public class GetIpAddress {
	public static void main(String[] args) throws SocketException {
		System.out.println(GetIpAddress.getRealIp());
	}

	public static String getRealIp() throws SocketException {
		String localip = null;// 本地IP，如果没有配置外网IP则返回它
		String netip = null;// 外网IP

		Enumeration<NetworkInterface> netInterfaces = NetworkInterface
				.getNetworkInterfaces();
		InetAddress ip = null;
		boolean finded = false;// 是否找到外网IP
		while (netInterfaces.hasMoreElements() && !finded) {
			NetworkInterface ni = netInterfaces.nextElement();
			Enumeration<InetAddress> address = ni.getInetAddresses();
			while (address.hasMoreElements()) {
				ip = address.nextElement();
				if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress()
						&& ip.getHostAddress().indexOf(":") == -1) {// 外网IP
					netip = ip.getHostAddress();
					finded = true;
					break;
				} else if (ip.isSiteLocalAddress() && !ip.isLoopbackAddress()
						&& ip.getHostAddress().indexOf(":") == -1) {// 内网IP
					localip = ip.getHostAddress();
				}
			}
		}

		if (netip != null && !"".equals(netip)) {
			return netip;
		} else {
			return localip;
		}
	}
}
