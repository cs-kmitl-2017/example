package th.ac.kmitl.science.comsci.example.models;

public class Buyerdescription {
    
    private int ID;

    private int GlobalID;

    private String Name;

    private int TaxPayerID;
    
    private int URLID;

    private String Email;


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getURLID() {
        return URLID;
    }

    public void setURLID(int URLID) {
        this.URLID = URLID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getTaxPayerID() {
        return TaxPayerID;
    }

    public void setTaxPayerID(int TaxPayerID) {
        this.TaxPayerID = TaxPayerID;
    }

    public int getGlobalID() {
        return GlobalID;
    }

    public void setGlobalID(int GlobalID) {
        this.GlobalID = GlobalID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}