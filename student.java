/**
 * student
 */
public class student {
    

    private int rollnumber;
    private String name;
    private int fees;
    public student(int rollnumber, String name, int fees) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.fees = fees;
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    @Override
    public String toString() {
        return "student [rollnumber=" + rollnumber + ", name=" + name + ", fees=" + fees + "]";
    }
    
}