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
public class DutyName {
    private String Duty_Name;
    private String Salary;
    
    public DutyName( String Duty_Name, String Salary)
    {
        this.Duty_Name = Duty_Name;
        this.Salary = Salary;
    }
    
    public String getDutyName()
    {
        return Duty_Name;
    }
    
    public String getSalary()
    {
        return Salary;
    }
}
