package others;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * zhumengqi create on 17-1-18.
 */
public class ReadHostname {
    //读取Hostname返回
    private static String getHostname(){
        String hostname;
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.out.println("获取hostname异常");
            hostname = "localhost";
            e.printStackTrace();
        }
        return hostname;
    }
    public static void main(String[] args){
        System.out.println(ReadHostname.getHostname());
    }
}
