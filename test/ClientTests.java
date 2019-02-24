
import Users.Client;
import Users.Doctor;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carsonbrown
 */
public class ClientTests {
    final String NAME = "TestName";
    final String USERNAME = "TestUserName";
    final String PASSWORD = "TestPassword";
    final Doctor DOC = new Doctor("username", "password");
    Client testClient;
    
    public ClientTests(){
        testClient = new Client(NAME, DOC, USERNAME, PASSWORD);
    }
    
    public boolean testGetters(){
        if(!testClient.getName().equals("TestName"))
            return false;
        if(!(testClient.getDoc() == DOC))
            return false;
        return true;
    }
    
    public boolean testSetters(){
        Doctor newDoc = new Doctor("something", "else");
        
        testClient.setName("newName");
        if(!testClient.getName().equals("newName"))
            return false;
        
        testClient.setDoc(newDoc);
        if(!(testClient.getDoc() == newDoc))
            return false;
        return true;
    }
}
