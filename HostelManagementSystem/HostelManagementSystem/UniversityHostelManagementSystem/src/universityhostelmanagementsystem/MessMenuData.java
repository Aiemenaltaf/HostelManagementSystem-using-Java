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
public class MessMenuData {
    private String Days;
    private String Breakfast;
    private String Lunch;
    private String TeaTime;
    private String Dinner;
    
    public MessMenuData(String Days, String Breakfast, String Lunch, String TeaTime, String Dinner)
    {    
        this.Days = Days;
        this.Breakfast = Breakfast;
        this.Lunch = Lunch;
        this.TeaTime = TeaTime;
        this.Dinner = Dinner;
    }    
    
     public String getDayName()
    {
      return Days;   
    }
    
    public String getBreakfastMenu()
    {
      return Breakfast;   
    }
     
    public String getLunchMenu()
    {
      return Lunch;   
    }
    public String getTeatime()
    {
      return TeaTime;   
    }
    public String getDinnerMenu()
    {
      return Dinner;   
    }

    
}
