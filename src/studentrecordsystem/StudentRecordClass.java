/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecordsystem;

/**
 *
 * @author user
 */
public class StudentRecordClass {
    

  // INPUT MEMBER VARIABLES
   private String regNum;
   private String fName; 
   private String lName;
   private String gender;
   private String state;
   private String dept;


  // CREATING THE CLASS CONSTRUCTOR
      public StudentRecordClass(String regNum, String fName, String lName, String gender, String state, String dept)
    {
        this.regNum = regNum;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.state = state;
        this.dept = dept;
    }

  // CREATING THE GETTERS 
    
    public String getRegNum() {
        return regNum;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getGender() {
        return gender;
    }

    public String getState() {
        return state;
    }

    public String getDept() {
        return dept;
    }

 // CREATING THE SETTERS

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
   
   
}