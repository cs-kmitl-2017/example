package datamanagement;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataManagement 
{

    //TaxInvoice taxInvoice = new TaxInvoice();
    
    public DataManagement()
    {
        
    }
    
    public void sendTaxInvoiceToDataBase() throws ClassNotFoundException, SQLException
    {
        String query = "";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("DATABASE URL");  
        Statement statement = (Statement) connection.createStatement();  
        ResultSet resultSet = statement.executeQuery(query);  
        while(resultSet.next())
        {  
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));  
        }  
        
    }
    
}
