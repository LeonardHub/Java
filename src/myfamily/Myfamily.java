package myfamily;

import java.awt.Color;
import java.util.LinkedList;
public class Myfamily {
    
    String isano(Umuntu me,Umuntu undi) {
        if (me.equals(undi)) {
            return "Uwo ninjye";
        } else if (me.father != null && me.father.equals(undi)) {
            return "ni Papa";
        } else if (me.mother != null && me.mother.equals(undi)) {
            return "ni Mama";
        }
        else if(me.father==undi.father&&me.mother==undi.mother&&me.Dateofbirth!=undi.Dateofbirth){
            if(undi.gender=="MALE"){
                return "ni Brother";
            }else{
                return "ni Sister";
            }
        }
        else if(me.Dateofbirth!=null&&(me.father==undi.father&&me.mother==undi.mother&&me.Dateofbirth==undi.Dateofbirth)){
            if(undi.gender=="MALE")
        {
            return "Ni impanga y'umuhungu";    
        }
        else{
            return "Ni Impanga y'umukobwa";
        }}
           else if (me.mother != null && (me.father.mother ==undi || me.mother.mother==undi)) {
            return "ni Nyogokuru";
            
        }
            else if (me.father != null && (me.father.mother ==undi || me.father.father==undi)) {
            return "ni Sogokuru";
            
        }
            
            else if (me.father != null && me.father.father ==undi.father) {
                if(undi.gender=="FEMALE"){
                   return "ni Tante";
                }else{
                   return "ni Tonto";
                }
            
        }
            
            
            else if ((undi.father!=null&&undi.mother!=null)&&me.father.father==undi.father||me.mother.mother==undi.mother) {
                if(undi.gender=="FEMALE"){
                   return "ni Cousine";
                }else{
                   return "ni Cousin";
                }
            
        }
            
            else{
            return "ntasano";
        }
}
    
public static void main(String[] arghs) {
Umuntu grandfather = new Umuntu("Jotham", "Habimana", "", "119820011", 
        "1/1/1962", "Ruhango", Color.pink, "MALE", 78, 179, 
        "0785294603", "MARRIED", "Middle", "O+", 35
        , null, "DDDD", null, null);

Umuntu grandmother = new Umuntu("Adele", "MUKAKARARA", "", "1198500", 
       "1/1/1962", "Ruhango", Color.pink, "Female", 60, 160, 
        "44444", "MARRIED", "RICH", "A+", 40
        , null, "adbh", null, null);

Umuntu father = new Umuntu("Jonadab", "HABIMANA", "", "1322", 
        "1/1/1962", "RUHANGO", Color.pink, "MALE", 80, 186, 
        "44444", "MARRIED", "RICH", "A+", 40
        , null, "adbh",grandfather, grandmother);
Umuntu mother = new Umuntu("Lucie", "Kamugisha", "", "22222", 
        "1/1/1962", "RUHANGO", Color.white, "FEMALE", 70, 175, 
        "1365455555", "MARRIED", "RICH", "B+", 50
        , null, "adbh", null, null);

Umuntu uncle= new Umuntu("Timothe", "Rukundo", "", "22222", 
        "1/1/1962", "RUHANGO", Color.white, "MALE", 70, 175, 
        "1365455555", "MARRIED", "RICH", "B+", 50
        , null, "adbh",grandfather, grandmother);

Umuntu aunt = new Umuntu("Yunisi", "Umutoni", "", "22222", 
        "1/1/1962", "RUHANGO", Color.white, "FEMALE", 70, 175, 
        "1365455555", "MARRIED", "RICH", "B+", 50
        , null, "adbh", grandfather, grandmother);

Umuntu me = new Umuntu("Leonard", "HABIMANA", "","33333", 
        "1998", "KIGALI", Color.white, "MALE", 175, 45, 
        "1365455555", "MARRIED", "RICH", "O-", 100, null, "adbh", father, mother); 

Umuntu twin = new Umuntu("Leo", "ABIMANA", "","33333","1998", "KIGALI", Color.white, "MALE", 175, 45, 
        "1365455555", "MARRIED", "RICH", "O+", 100, null, "adbh", father, mother); 



 LinkedList<Umuntu> family=new LinkedList <>();

 
 family.add(grandfather);
 family.add(grandmother);
 family.add(father);
 family.add(mother);
 family.add(uncle);
 family.add(aunt);
 family.add(twin);
 
 
    System.out.println(" "+me);
    Myfamily obj=new Myfamily();
    System.out.println(me.firstName+" "+obj.isano(me,me));
    //Output: Ninjye
    
        System.out.println(father.firstName+" "+obj.isano(me,father));
    //Output: ni Papa
 
    
            System.out.println(grandmother.firstName+" "+obj.isano(me,grandmother));
    //Output: ni Nyogokuru
            System.out.println(grandfather.firstName+" "+obj.isano(me,grandfather));
    //Output: ni Sogokuru
            System.out.println(twin.firstName+" "+obj.isano(me,twin));
            
    

}} 