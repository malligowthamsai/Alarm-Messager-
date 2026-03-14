import java.time.LocalDateTime;
import java.util.*;

public class MessageScheduler extends Thread {

    private MessagingService service;

    public MessageScheduler(MessagingService service){
        this.service = service;
    }

    public void run(){

        while(true){

            List<Message> messages = service.getMessages();

            for(Message m : messages){

                if(LocalDateTime.now().isAfter(m.getScheduleTime())){
                    System.out.println("\nNew Message Delivered!");
                    System.out.println("From: " + m.getSender());
                    System.out.println("To: " + m.getReceiver());
                    System.out.println("Message: " + m.getContent());
                }
            }

            try{
                Thread.sleep(5000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
