import java.util.ArrayList;
import java.util.Scanner;

public class data {
    ArrayList<student> list=new ArrayList<student>();
    Scanner sc=new Scanner(System.in);
    

    public void addrecord(student obj) {
        System.out.println("------------------------------");
        list.add(obj);
    }


    public void showlist() {
        System.out.println("-----------------------------");
        System.out.println("-------------------------------------");
        for (student student1 : list) {
            System.out.println(student1);
            
        }
    }


    public void removelist(int rollnumber) {
        System.out.println("-------------------------");
        System.out.println("-----------------------------");
            for (student student1 : list) {
            if(rollnumber==student1.getRollnumber()){
                list.remove(student1);
                return;
            }
            
        }
    }


    public void searchlist(String name2) {
        System.out.println("----------------------------");
        System.out.println("----------------------------------");
           for (student student1 : list) {
            if (name2.equalsIgnoreCase(student1.getName())){
                
                    System.out.println(student1);
                    
                    
                

                
                
            }
            
        }
        
    }


    public void updatelist(int rollnumber) {
        System.out.println("---------------------------");
        System.out.println("------------------------------");
        
             for (student student1 : list) {
            if(rollnumber==student1.getRollnumber()){
                System.out.println("enter your new roll number");
                int newrollnumber=sc.nextInt();
                student1.setRollnumber(newrollnumber);
                System.out.println("enter new student name");
                String newname=sc.next();
                student1.setName(newname);
                System.out.println("enter new student fees");
                int newfees=sc.nextInt();
                student1.setFees(newfees);

                
            }
    }

    
    }
    

}