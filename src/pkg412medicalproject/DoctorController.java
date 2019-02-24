/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412medicalproject;

import Users.Client;
import Documentation.MedicalRecord;
import Users.Doctor;
import java.io.File;

/**
 *
 * @author carsonbrown
 */
public class DoctorController {
    
    RecordDictionary rd;
    
    /**
     * Constructor for the DoctorController
     * @param rd the RecordDictionary so that the controller can access all records
     */
    public DoctorController(RecordDictionary rd){
        this.rd = rd;
    }
    
    /**
     * Method for allowing Doctors to add new documents to the system
     * @param d The doctor adding the document
     * @param f The file being added
     * @param type A string of what type of record is being added
     * @param c The client that the record pertains to
     * @return True if the Doctor is that Clients doctor, False if the they are not
     */
    public boolean addDocument(Doctor d, File f, String type, Client c){
        if(c.getDoc() == d){
            rd.addRecord(new MedicalRecord(type, f, c));
            return true;
        }
        else{
            return false;
        }
        
    }
    
    /**
     * Method for a doctor requesting viewing permissions from a Client
     * @param c The client holding the record
     * @param d The doctor requesting access
     */
    public void RequestPermission(Client c, Doctor d){
        c.addRequest(d);
    }
    
}
