/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentation;

import Users.Client;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author carsonbrown
 */
public class MedicalRecord {
    
    private String type;
    private File f;
    private Client client;
    private LocalDateTime date;
    
    
    /**
     * Default constructor for Medical Record
     */
    public MedicalRecord(){
        this.date = LocalDateTime.now();
    }
    
    /**
     * Contructor for Medical Record
     * @param type String consisting of the Type of Medical Record
     * @param f File object that holds the medical record
     * @param client Client object that relates to the Client who has this record
     */
    public MedicalRecord(String type, File f, Client client){
        this.type = type;
        this.f = f;
        this.client = client;
        this.date = LocalDateTime.now();
    }

    /**
     * Returns the type of medical record
     * @return String with the name of Medical Record type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the Medical Record type
     * @param type String with the name of the Record Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the Medical Record
     * @return File object with the medical record
     */
    public File getF() {
        return f;
    }
    
    /**
     * Set the file for the Medical Record
     * @param f File object holding the medical record
     */
    public void setF(File f) {
        this.f = f;
    }

    /**
     * Return the Client who is on the medical record
     * @return Client object related to the medical record
     */
    public Client getClient() {
        return client;
    }

    /**
     * Set the Client on the record
     * @param client A client object related to the medical record
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
}
