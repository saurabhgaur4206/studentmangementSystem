import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        service service=new service();
        
        while (true) {
            
        
        System.out.println("choose 1 for insert ");
        System.out.println("choose 2 for remove");
        System.out.println("choose 3 for update");
        System.out.println("choose 4 for searching");
        System.out.println("choose 5 for show the data");
        System.out.println("choose 6 for exit ");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        switch (a) {
            case 1:
            System.out.println("enter your data");
            service.add();
                
                break;
            case 2:
            System.out.println("which data you want to remove");
            service.remove();
                
                break;
            case 3:
            System.out.println("enter your data to updated");
            service.update();
                
                break;
            case 4:
            System.out.println("for searching");
            service.serch();
                
                break;
            case 6:
            service.exit();
                System.out.println("you are exited");
                
                break;
            case 5:
                System.out.println("this is your data");
                service.show();
            default:
            System.out.println("you choose worng key");
                break;
        }
        }
    }
    
}
