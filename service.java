import java.util.Scanner;

public class service {
    Scanner sc=new Scanner(System.in);
    data obj=new data();


    /**
     * 
     */
    public  void add() {
        System.out.println("enter student roll number");
        int rollnumber=sc.nextInt();
        System.out.println("enter  student name");
        String name=sc.next();
        System.out.println("enter student fees");
        int fees=sc.nextInt();
        System.out.println(rollnumber+ " " + name+" "+"fees");
        obj.addrecord(new student(rollnumber, name, fees));


    }

    public  void remove() {
        System.out.println("enter your number which you want to delet");
        int rollnumber1=sc.nextInt();

            obj.removelist(rollnumber1);
            
        }
        

    

    public  void update() {
        System.out.println("enter your roll number to update the data");
        int rollnumber=sc.nextInt();
        obj.updatelist(rollnumber);
    }

    public  void serch() {
        System.out.println("enter your name to serch the data in list");
        String name1=sc.next();
        obj.searchlist(name1);
    }

    public  void exit() {
        System.exit(0);
    }

    public void show() {
        obj.showlist();
    }
    
}
