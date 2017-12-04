package datamanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxInvoiceOM
{

    PreparedStatement  preparedStatement = null;
    Connection connection = null;
    private static Final String DATABASE_URL = "/*Database URL*/"; 
    private String UPDATE = "UPDATE taxInvoice_table SET PoSName = ?, PoSAmount = ?, PoSPrices = ? WHERE taxPayer_ID = ?"; //PoS : Product or Service
    private String SELECT = "SELECT PoSName, PoSAmount, PoSPrices FROM taxInvoice_table WHERE taxPayer_ID = ?";
    
    public void updateTaxInvoiceToDataBase(TaxInvoice taxInvoice, String username, String password) throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(DATABASE_URL, username, password);
        try
        {
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, taxInvoice.getPoSName());
            preparedStatement.setInt(2, taxInvoice.getPoSAmount());
            preparedStatement.setDouble(3, taxInvoice.getPoSPrices());
            preparedStatement.setInt(4, taxInvoice.getTaxPayerID());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public TaxInvoice getTaxIvoiceFromDataBase(int taxPayerID, String username, String password) throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(DATABASE_URL, username, password);
        TaxInvoice taxInvoice = new TaxInvoice();
        taxInvoice.setTaxPayerID(taxPayerID);
        try
        {
            preparedStatement = connection.prepareStatement(SELECT);
            preparedStatement.setInt(1, taxPayerID);
            ResultSet resultSet = preparedStatement.executeQuery(SELECT);  
            while(resultSet.next())
            {  
                taxInvoice.setPoSName(resultSet.getString("PoSName"));  
                taxInvoice.setPoSAmount(resultSet.getInt("PoSAmount"));       
                taxInvoice.setPoSPrices(resultSet.getDouble("PoSPrices"));
            } 
            preparedStatement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return taxInvoice;  
    }
}
