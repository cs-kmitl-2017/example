/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;

/**
 *
 * @author Z5070
 */
public class Buyer {
    private BuyerAddress Address = null;
    private Buyerdescription Description = null;
    private ArrayList <Buyer> BuyerLists = new ArrayList();
    
    public Buyer() {
        Address = new BuyerAddress();
        Description = new Buyerdescription();
    }
    
    public void findByID(int BuyerID){
        System.out.println();
    }
    
    public void setNewBuyer(int ID,
                            int GlobalID,
                            String Name,
                            int TaxPayerID,
                            int URLID,
                            String Email,
                            String PostCode,
                            String BuildingName,
                            String LineAdress,
                            String Alley,
                            String Village,
                            String Group,
                            String StreetName,
                            String CityName,
                            String CitySubDivisionName,   
                            String CountryID,
                            String CountrySubDivisionID,   
                            String BuildingNumber){
        
    }
    
}
