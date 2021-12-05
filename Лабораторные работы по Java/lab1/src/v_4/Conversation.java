package v_4;

import java.util.ArrayList;
import java.util.List;

public class Conversation {
    public Company company;
    public Client client;
    private List<Message> messages;
    public Conversation(Client client, Company company){
        this.client = client;
        this.company = company;
        client.addConversation(this);
        company.addConversation(this);
        messages = new ArrayList<>();
    }
    public void sendMessage(Message message){
        messages.add(message);
    }
    public void printAllMessanges(){
        for (Message message : messages){
            System.out.println(message.name + ": " + message.message);
        }
    }
}
