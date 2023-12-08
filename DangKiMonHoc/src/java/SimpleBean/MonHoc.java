/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleBean;

/**
 *
 * @author student
 */
public class MonHoc {
    String id;
    String name;
   public MonHoc(String id){
       this.id = id;
       //this.name = "Lay tu CSDL";
       if(id.compareTo("CT173")==0) 
           this.name="Lap trinh huong doi tuong";
   }
   public String getID(){
       return this.id;
   }
   public String getName(){
       return this.name;
   }
}
