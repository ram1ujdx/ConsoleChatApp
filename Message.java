import java.io.Serializable;

// must implement Serializable in order to be sent
public class Message implements Serializable{
     String text;
     String userName;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Message(String userName,String text) {
        this.userName=userName;
        this.text = text;
        
    }


    

}