
import Documentation.MedicalRecord;
import Users.Client;
import Users.Doctor;
import java.io.File;
import pkg412medicalproject.RecordDictionary;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carsonbrown
 */
public class RecordDictionaryTests {
    
    RecordDictionary rd = new RecordDictionary();
    File f = new File("testFile.txt");
    Client testClient = new Client("Client", new Doctor("Doc", "Tor"), "uname", "pword");
    MedicalRecord mr = new MedicalRecord("Check-Up Document", f, testClient);
    
    public RecordDictionaryTests(){
        System.out.println("Test the Record Dictionary class");
        System.out.println("Adding records works: " + testAdd());
        System.out.println("Getting records from the Record Dictinary Works: " + testGet());
    }
    
    public boolean testAdd(){
        rd.addRecord(mr);
        return rd.DictSize() == 1;
    }
    
    public boolean testGet(){
        return rd.getRecords(testClient).get(0) == mr;
    }
    
}
