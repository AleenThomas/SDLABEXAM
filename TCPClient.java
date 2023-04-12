import java.io.*;
import java.net.*;
public class TCPClient{
    public static void main(String args[]){
        try{
            Socket sk=new Socket("localhost",5555);
            BufferedReader br=new BufferedReader(new InputStreamreader(System.in));
            String line;
            do{
                line=br.readLine();
                PrintWritter pw =new PrintWritter(SK.getoutputStream(),true);
                pw.println(line);
            }while(!line.equals("exit"));
            sk.close();
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
