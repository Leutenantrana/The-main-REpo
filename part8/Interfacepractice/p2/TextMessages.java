package part8.Interfacepractice.p2;

public class TextMessages implements Readable {
    private String sender;
    private String message;

    public TextMessages(String sender, String message){
        this.message = message;
        this.sender = sender;
    }

    public String getSender(){
        return this.sender;
    }
    
    @Override
    public String read(){
        return this.message;
    }
}
