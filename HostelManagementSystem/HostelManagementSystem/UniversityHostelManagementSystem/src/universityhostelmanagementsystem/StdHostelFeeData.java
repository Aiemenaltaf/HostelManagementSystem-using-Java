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
public class StdHostelFeeData {
    private String StdName;
    private String StdRegNo;
    private String Semester;
    private String hostelFee;
    
    public StdHostelFeeData(String StdName, String StdRegNo, String Semester, String hostelFee)
    {    
        this.StdName = StdName;
        this.StdRegNo = StdRegNo;
        this.Semester = Semester;
        this.hostelFee = hostelFee;
    }    
    
     public String getStdName()
    {
      return StdName;   
    }
    
    public String getStdRegNo()
    {
      return StdRegNo;   
    }
     
    public String getSemester()
    {
      return Semester;   
    }
    public String getFee()
    {
      return hostelFee;   
    }

    
}
