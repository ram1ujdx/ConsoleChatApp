import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        for(;;){
        Socket socket = ss.accept(); 
        InputStream inputStream = socket.getInputStream();
 
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);


         Message msg = (Message) objectInputStream.readObject();
        System.out.println("Message from: " + msg.getUserName());
        System.out.println(">>>> "+msg.getText());
    
        }
    }
}
