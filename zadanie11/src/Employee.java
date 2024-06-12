public class Employee extends User{
    private int id;
    static int idCounter =1;

    public Employee(String fName, String lName) {
        super(fName, lName);
        this.id = idCounter;
        idCounter++;
    }
}
