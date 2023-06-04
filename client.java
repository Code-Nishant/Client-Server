import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args)throws Exception {
        Socket s= new Socket("192.168.1.8", 777);
        InputStream obj= s.getInputStream();

        BufferedReader br=new BufferedReader(new InputStreamReader(obj));
        String str;
        while ((str=br.readLine())!=null) {
            System.out.println("from server= "+str);
        }
        br.close();
        s.close();
    }
}
