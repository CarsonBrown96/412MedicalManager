/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.ArrayList;

/**
 *
 * @author carsonbrown
 */
public class Client extends User{
    
    private String name;
    private Doctor doc;
    public ArrayList<Doctor> requestedPermissions = new ArrayList<Doctor>();
    
    /**
     * Constructor for a Client
     * @param name The name of the client
     * @param doctor A doctor object that is the doctor for this Client
     */
    public Client(String name, Doctor doctor, String username, String password){
        super(username, password);
        this.name = name;
        this.doc = doctor;
    }
    
    /**
     * Getter for the name of the client
     * @return Clients name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name attribute of the Client
     * @param name Desired new name for the Client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Client's Doctor
     * @return The clients Doctor
     */
    public Doctor getDoc() {
        return doc;
    }

    /**
     * Sets the clients Doctor
     * @param doc Doctor object to be set as new Doctor
     */
    public void setDoc(Doctor doc) {
        this.doc = doc;
    }
    
    /**
     * Adds a doctor to the list of Doctors who had requested access to the clients records
     * @param d The doctor requesting access
     */
    public void addRequest(Doctor d){
        requestedPermissions.add(d);
    }
}
