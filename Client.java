import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws IOException {
       
       

      
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your name : ");
       String name=in.readLine();
       String msg="";
       Message message=new Message(name, "hello");
       for(;;){
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        
        OutputStream outputStream = socket.getOutputStream();
        
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
       // System.out.println("Sending messages....");
        System.out.println("Enter a mesaage: ");
        msg=in.readLine();
        message.setText(msg);
        objectOutputStream.writeObject(message);
       

        System.out.println("Closing chat.....bye..");
        socket.close();
       }
    
    }
}

