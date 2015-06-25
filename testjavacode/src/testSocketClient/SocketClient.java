package testSocketClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *  SocketClient.java
 *  Description:
 *  
 *  CreateDate: 2015年6月25日 下午5:48:49 
 * 
 *  @author 马宁波，来自艾洪生
 */
public class SocketClient {
	public static void main(String[] args) {  
        Socket socket = null;  
        BufferedReader br = null;  
        PrintWriter pw = null;  
        try {  
            //客户端socket指定服务器的地址和端口号  
            socket = new Socket("172.16.12.61", 9090);  
            System.out.println("Socket=" + socket);  
            //同服务器原理一样  
            br = new BufferedReader(new InputStreamReader(  
                    socket.getInputStream()));  
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(  
                    socket.getOutputStream())));  
           while(true){
        	   BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
        	   System.out.println("input:");
        	   String s = strin.readLine();
        	   pw.println(s);
        	   pw.flush(); 
        	   String str = br.readLine();
        	   System.out.println("SocketServerMessage:"+str);
           }
            
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                System.out.println("close......");  
                br.close();  
                pw.close();  
                socket.close();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
}