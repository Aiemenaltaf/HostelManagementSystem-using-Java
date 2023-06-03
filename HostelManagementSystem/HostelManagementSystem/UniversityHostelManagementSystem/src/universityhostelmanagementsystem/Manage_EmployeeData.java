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
public class Manage_EmployeeData {
    private String E_firstName;
    private String E_lastName;
    private String E_CNIC;
    private String E_phoneNo;
    private String E_gender;
    private String E_Address;
    private String E_DOB;
    
    public Manage_EmployeeData(String E_firstName, String E_lastName,  String E_CNIC,
                              String E_phoneNo,String E_gender,String E_Address, String E_DOB){
        this.E_firstName = E_firstName;
        this.E_lastName = E_lastName;
        this.E_CNIC = E_CNIC;
        this.E_phoneNo = E_phoneNo;
        this.E_gender = E_gender;
        this.E_Address = E_Address;
        this.E_DOB = E_DOB;
        
    }
    
    public String getEMPfirstName()
    {
      return E_firstName;   
    }
    
    public String getEMPlastName()
    {
      return E_lastName;   
    }
    
    public String getEMPCNIC()
    {
      return E_CNIC;   
    }
    
    public String getEMPphoneNo()
    {
      return E_phoneNo;   
    }
    
    public String getEMPgender()
    {
      return E_gender;   
    }
    
    public String getEMPAddress()
    {
      return E_Address;   
    }
    
    public String getEMPDOB()
    {
      return E_DOB;   
    }
    
    

}
