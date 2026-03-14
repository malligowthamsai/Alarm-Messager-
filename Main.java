import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MessagingService service = new MessagingService();

        MessageScheduler scheduler = new MessageScheduler(service);
        scheduler.start();

        while(true){

            System.out.println("\n1.Register");
            System.out.println("2.Login");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

                System.out.print("Username: ");
                String u = sc.nextLine();

                System.out.print("Password: ");
                String p = sc.nextLine();

                service.registerUser(u,p);

                System.out.println("User Registered");

            }

            else if(choice == 2){

                System.out.print("Username: ");
                String u = sc.nextLine();

                System.out.print("Password: ");
                String p = sc.nextLine();

                if(service.login(u,p)){

                    System.out.println("Login Successful");

                    System.out.print("Receiver: ");
                    String r = sc.nextLine();

                    System.out.print("Message: ");
                    String msg = sc.nextLine();

                    System.out.print("Delay seconds: ");
                    int sec = sc.nextInt();

                    LocalDateTime time = LocalDateTime.now().plusSeconds(sec);

                    Message m = new Message(u,r,msg,time);

                    service.scheduleMessage(m);

                    System.out.println("Message Scheduled");

                }
                else{
                    System.out.println("Invalid Login");
                }

            }

        }

    }
}
