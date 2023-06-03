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
public class EmployeePayment {
    private String Employee_Name;
    private String Employee_No;
    private String Employee_CNIC;
    private String Employee_Designation;
    private String Employee_Payment;
    
    public EmployeePayment(String Employee_Name, String Employee_No, String Employee_CNIC,
                           String Employee_Designation, String Employee_Payment )
    {
        this.Employee_Name = Employee_Name;
        this.Employee_No = Employee_No;
        this.Employee_CNIC = Employee_CNIC;
        this.Employee_Designation = Employee_Designation;
        this.Employee_Payment = Employee_Payment;
    }
     
     public String getEmployee_Name()
     {
         return Employee_Name;
     }
   
    public String getEmployeeeNumber()
     {
         return Employee_No;
     }
    
    public String getEmployeeCNIC()
     {
         return Employee_CNIC;
     }
    
    public String getEmployeeDesignation()
     {
         return Employee_Designation;
     }
    
    public String getEmployeePayment()
     {
         return Employee_Payment;
     }
    
   
}
