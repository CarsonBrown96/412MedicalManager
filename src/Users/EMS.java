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
public class EMS extends User{
    
    String name;
    
    /**
     * Default constructor for EMS
     */
    public EMS(String username, String password){
        super(username, password);
    }
    
    /**
     * Constructor for EMS
     * @param name Name of EMS personel
     */
    public EMS(String name, String username, String password){
        super(username, password);
        this.name = name;
    }

    /**
     * Return the name of the EMS
     * @return String with the name of the EMS person
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the EMS
     * @param name String with the name of the EMS
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
