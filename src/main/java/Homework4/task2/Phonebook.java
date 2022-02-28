package Homework4.task2;

/*
@author Petrova Olya
 */

import java.util.HashMap;

public class Phonebook {
    private HashMap<String, String> myHashMap = new HashMap<>();
    //private String fullName;

    public void add(String phone, String fullName) {
        myHashMap.put(phone, fullName);
    }

    public String getPhoneByName(String fullName) {
        if (myHashMap.containsValue(fullName)) {
            String result = "Phone numbers: ";
            for (String key : myHashMap.keySet()) {
                if (myHashMap.get(key).equals(fullName))
                    result += key + "; ";
            }
            return result;

        } else return "номер не найден";
    }
}

