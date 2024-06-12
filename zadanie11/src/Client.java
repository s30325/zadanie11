public class Client extends User{
    static int idcounter =1 ;
    private int id;
    public Client(String fName, String lName) {
        super(fName, lName);
        this.id = idcounter;
        idcounter++;
    }
}
