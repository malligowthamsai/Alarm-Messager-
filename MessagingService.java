import java.util.*;

public class MessagingService {

    private List<User> users = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public void registerUser(String username, String password){
        users.add(new User(username, password));
    }

    public boolean login(String username, String password){
        for(User u : users){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public void scheduleMessage(Message message){
        messages.add(message);
    }

    public List<Message> getMessages(){
        return messages;
    }
}
