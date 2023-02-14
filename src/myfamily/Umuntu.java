/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfamily;

import java.awt.Color;
import java.awt.Image;

public class Umuntu {
    
 String firstName;
 String secondName;
 String middleName;
 
 String nationalId;
 
 //int age;NIYUWO MWAKA GUSA 
 String Dateofbirth;
 String placeOfBirth;
 Color skinColor;
 
 String gender;
 
 //BIRAHINDAGURIKA BUT
 double weight;
 double height;
 
 //TECHNOLOGY
 String phoneNumber;
 String maritusStatus;
 String ubudehe;
 
 //for fun
 String bloodGroup;
 double brainIQ;
 Image passportPicture;
 String ADN;
         
//FAMILY    papa/mama     
// String papaName;
// String mamaName;
//String papaID;
//String mamaID; 
 
Umuntu father;
Umuntu mother;

    public Umuntu(String firstName, String secondName, String middleName, String nationalId, 
            String Dateofbirth, String placeOfBirth, Color skinColor, String gender, double weight, 
            double height, String phoneNumber, String maritusStatus, String ubudehe, String bloodGroup, 
            double brainIQ, Image passportPicture, String ADN, Umuntu father, Umuntu mother)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.nationalId = nationalId;
        this.Dateofbirth = Dateofbirth;
        this.placeOfBirth = placeOfBirth;
        this.skinColor = skinColor;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.phoneNumber = phoneNumber;
        this.maritusStatus = maritusStatus;
        this.ubudehe = ubudehe;
        this.bloodGroup = bloodGroup;
        this.brainIQ = brainIQ;
        this.passportPicture = passportPicture;
        this.ADN = ADN;
        this.father = father;
        this.mother =mother;
    }

public String myNames()
{ 
return " "+firstName+" "+secondName+" "+middleName;
}
    
 @Override
 public String toString()
{
return " I AM "+myNames()+" born on "+Dateofbirth+" My Father is "+father.myNames()+" My Mother is "+mother.myNames();
}

 
}