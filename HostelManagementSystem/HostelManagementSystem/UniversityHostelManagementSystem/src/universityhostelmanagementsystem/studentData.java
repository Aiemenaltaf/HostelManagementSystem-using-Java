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
public class studentData {
    private String firstName;
    private String lastName;
    private String gender;
    private String CNIC;
    private String regNo;
    private String phoneNo;
    private String HomephoneNo;
    private String DOB;
    private String Address;
    
    public studentData(String firstName, String lastName, String gender, String CNIC,
            String regNo, String phoneNo, String HomephoneNo, String DOB, String Address)
    {    
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.CNIC = CNIC;
        this.regNo = regNo;
        this.phoneNo = phoneNo;
        this.HomephoneNo = HomephoneNo;
        this.DOB = DOB;
        this.Address = Address;
                
                
    }    
    
     public String getfirstName()
    {
      return firstName;   
    }
    
    public String getlastName()
    {
      return lastName;   
    }
    
    public String getgender()
    {
      return gender;   
    }
    
    public String getCNIC()
    {
      return CNIC;   
    }
    
    public String getregNo()
    {
      return regNo;   
    }
    
    public String getphoneNo()
    {
      return phoneNo;   
    }
    
    public String getHomephoneNo()
    {
      return HomephoneNo;   
    }
    
    public String getDOB()
    {
      return DOB;   
    }
    
    public String getAddress()
    {
      return Address;   
    }
}
