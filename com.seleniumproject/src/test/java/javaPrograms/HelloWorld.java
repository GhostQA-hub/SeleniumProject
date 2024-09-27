package javaPrograms;

import java.util.HashMap;
import java.util.Map;

class HelloWorld {
    public static void main(String[] args) {
       
       String input = "Programming";
       findDuplicateCharacters(input);
    }
    
    public static void findDuplicateCharacters(String str){
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        char [] charArray = str.toCharArray();
        
        for(char c: charArray)
        {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
                charCountMap.put(c,1);
            }
        }
        System.out.println("Duplicate Characters: ");
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() >1){
                System.out.println(entry.getKey()+ " : " + entry.getValue());
            }
        }
    }
    }
    
