/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityhostelmanagementsystem;

/**
 *
 * @author uswa nasir
 */
public class Manage_Rooms {
    private String RoomNumber;
    private String RoomLocation;
    private String RoomStatus;
     
     public Manage_Rooms(String RoomNumber, String RoomLocation, String RoomStatus)
    {
        this.RoomNumber = RoomNumber;
        this.RoomLocation = RoomLocation;
        this.RoomStatus = RoomStatus;
    }
     
     public String getRoomNumber()
     {
         return RoomNumber;
     }
     
    public String getRoomLocation()
     {
         return RoomLocation;
     }
    
    public String getRoomStatus()
     {
         return RoomStatus;
     }
}
