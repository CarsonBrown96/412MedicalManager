/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412medicalproject;

import Documentation.MedicalRecord;
import Users.Client;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author carsonbrown
 */
public class RecordDictionary {
    
    HashMap<String, ArrayList<MedicalRecord>> records;
    
    /**
     * Constructor for Medical Record Dictionary object
     */
    public RecordDictionary(){
        records = new HashMap<>();
    }
    
    public void addRecord(MedicalRecord mr){
        if(records.containsKey(mr.getClient())){
            records.get(mr.getClient()).add(mr);
        }else{
            ArrayList<MedicalRecord> recList = new ArrayList<>();
            recList.add(mr);
            records.put(mr.getClient().getName(), recList);
        }
    }
    
    public ArrayList<MedicalRecord> getRecords(Client c){
        if(records.containsKey(c))
            return records.get(c);
        return null;
    }
    
    public int DictSize(){
        int ret = 0;
        for(String key : records.keySet()){
            ret += records.get(key).size();
        }
        return ret;
    }
    
}
