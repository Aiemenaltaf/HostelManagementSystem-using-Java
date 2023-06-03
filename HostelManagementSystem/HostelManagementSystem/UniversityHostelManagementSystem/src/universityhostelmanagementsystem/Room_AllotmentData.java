/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityhostelmanagementsystem;

/**
 *
 * @author Altaf Hussain
 */
public class Room_AllotmentData {
    private String stdName;
    private String RegNo;
    private String RoomNo;
    
    
    public Room_AllotmentData(String stdName, String RegNo, String RoomNo)
    {
        this.stdName = stdName;
        this.RegNo = RegNo;
        this.RoomNo = RoomNo;
        
    }
    
    public String getStdname()
    {
        return stdName;
    }
    
    public String getRegNo()
    {
       return RegNo;
    }
       
    public String getRoomNo()
    {
        return RoomNo; 
     }
                
            
    
}