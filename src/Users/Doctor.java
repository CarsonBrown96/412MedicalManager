/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author carsonbrown
 */
public class Doctor extends User{
    
    String name;
    
    public Doctor(String username, String password){
        super(username, password);
    }
    
    public Doctor(String name, String username, String password){
        super(username, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
