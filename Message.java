import java.time.LocalDateTime;

public class Message {

    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime scheduleTime;

    public Message(String sender, String receiver, String content, LocalDateTime scheduleTime){
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.scheduleTime = scheduleTime;
    }

    public String getReceiver(){
        return receiver;
    }

    public String getContent(){
        return content;
    }

    public LocalDateTime getScheduleTime(){
        return scheduleTime;
    }

    public String getSender(){
        return sender;
    }
}
