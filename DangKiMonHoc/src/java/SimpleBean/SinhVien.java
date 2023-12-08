package SimpleBean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class SinhVien {
    String name;
    String ID;
    String username;
    String password;
    public SinhVien(){
        name = "Pham Van A";
        ID= "1980055";
        username = "user1";
        password = "pass1";
    }
    public boolean check(String u, String p){
        boolean kq=false;
        kq = (u.compareTo(username)==0);
        kq = kq&&(p.compareTo(password)==0);
        return kq;
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
}
