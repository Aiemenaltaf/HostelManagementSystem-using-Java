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
public class AssignDutyData {
    
    private String EmpName;
    private String CNIC;
    private String PhoneNo;
    private String Duty;
    
    public AssignDutyData(String EmpName, String CNIC, String PhoneNo, String Duty)
    {    
        this.EmpName = EmpName;
        this.CNIC = CNIC;
        this.PhoneNo = PhoneNo;
        this.Duty = Duty;
    }    
    
     public String getEmpName()
    {
      return EmpName;   
    }
    
    public String getCNIC()
    {
      return CNIC;   
    }
     
    public String getPhoneNo()
    {
      return PhoneNo;   
    }
    public String getDuty()
    {
      return Duty;   
    }

    
}
