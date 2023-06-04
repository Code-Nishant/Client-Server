import java.io.*;
import java.net.*;
public class server {
    
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(777);
        Socket s=ss.accept();
        System.out.println("Connection established");

        OutputStream obj= s.getOutputStream();
        PrintStream ps=new PrintStream(obj);

        String str="hey can you see me";
        ps.println(str);
        ps.println("my time is up");

        ps.close();
        ss.close();
        s.close();
    }
}