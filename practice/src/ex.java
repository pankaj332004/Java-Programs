import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class ex {
    public static void main(String[] args) {
        try{
           URL url= new URL("http://www.javatpoint.com/java-tutorial");
//            System.out.println("Protocol : "+url.getProtocol());
//            System.out.println("host : "+url.getHost());
//            System.out.println("File : "+url.getFile());
//            System.out.println("Port No. : "+url.getPort());

            // read the query
            URLConnection urlconnection = url.openConnection();
            InputStream is = urlconnection.getInputStream() ;
            int i;
            while((i= is.read())!=-1){
                System.out.println((char)i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
