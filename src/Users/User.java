/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author carsonbrown
 */
public class User {
    
    String username, password;
    /**
     * Default constructor for a User
     * @param username The users username
     * @param password The users password
     */
    public User(String username, String password){
        this.username = username;
        this.password = getSHA256(password);
    }
    
    
    
    /**
     * Helper method that gets sha256 hash of an input
     * @param pass String to be hashed
     * @return a String consisting of the hashed password
     */
    private static String getSHA256(String pass){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] messageDigest = md.digest(pass.getBytes());
            
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            
            while(hashtext.length() < 32){
                hashtext = "0" + hashtext;
            }
            
            return hashtext;
        } catch(NoSuchAlgorithmException e){
            System.out.println("No such algorithm");
            return "";
        }
        
        
    }
}
