import java.util.*;
import java.sql.*;
import java.io.IOException;
public class FlightManagementSystem{
    public static boolean sr;
    public boolean addFlight(Flight flightObj) 
    {
        try{
            
        
        DB ob= new DB();
        
        
        
        String sql="INSERT INTO flight(flightId,source,destination,noofseats,flightfare)"+"VALUES(flightobj.getFlightId(),flightobj.getSource(),flightobj.getDestination(),flightobj.getNoOfSeats(),flightobj.getFlightFare())";
        
        Connection co=ob.getConnection();
      
        
        Statement st= co.createStatement();
        int k= st.executeUpdate(sql);
        
        if(k==1)
        {
            System.out.println("Flight details added successfully");
            
            sr=true;
           // return true;
            
        }
        else
        {
            System.out.println("Addition not done");
            //return false;
            sr=false;
            
        }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return sr;
    }
}