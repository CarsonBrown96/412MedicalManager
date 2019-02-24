
import Users.Client;
import Users.Doctor;
import java.io.File;
import pkg412medicalproject.DoctorController;
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
public class DoctorControllerTests {
    
    RecordDictionary rd = new RecordDictionary();
    DoctorController dc = new DoctorController(rd);
    Doctor testDoc = new Doctor("Test", "Doctor");
    Client testClient = new Client("Client", testDoc, "Username", "Password");
    File f = new File("testFile.txt");
    
    public DoctorControllerTests(){
        System.out.println(testAddDocument(testDoc, f, "X-Ray", testClient));
        System.out.println(requestPermissionsTest(testClient, testDoc));
    }
    
    public String testAddDocument(Doctor d, File f, String type, Client testClient){
        if(!dc.addDocument(testDoc, f, type, testClient))
            return "Adding a document with the supposed correct permissions does not work";
        if(dc.addDocument(testDoc, f, type, new Client("other", new Doctor("other", "doctor"), "other", "pword")))
            return "Adding a document with incorrect permissions does not work as intended";
        return "Add Document function works as intended";
    }
    
    public String requestPermissionsTest(Client c, Doctor d){
        dc.RequestPermission(c, d);
        if(c.requestedPermissions.get(0) == d)
            return "Requesting permissions works as expected";
        return "Reqeusting permissions does not work as expected";
    }
    
    
}
