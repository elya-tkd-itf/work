package v_4;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public String name;
    public List<Conversation> conversations;
    public Client(String name){
        this.name = name;
        conversations = new ArrayList<>();
    }
    public void addConversation(Conversation conversation){
        conversations.add(conversation);
    }
    public void sendMessage(int numConv, String message){
        conversations.get(numConv).sendMessage(new Message(message, name));
    }
}
