package udemy;

import javax.xml.bind.SchemaOutputResolver;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCountDuplicateCharactersHashMap {

    public static void main(String[] args) {
       printCountOfDuplicateCharacterUsingHashMap("aaaabbccAAdd",'a');
      //  printCountOfDuplicateCharacterUsingHashMap("##^$!%^$!^%@!$^@!kds");
     //   printCountOfDuplicateCharacterUsingHashMap("java java dddddaaaa");

        System.out.println("***********************************");
        String input = "aaaabbccAAdd";
        char search = 'a';             // Character to search is 'a'.

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }

        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }


    // Using hashmap : print count of each character in a given string.
    private static void printCountOfDuplicateCharacterUsingHashMap(String input ,char search) {
        Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.containsKey(ch)) {
                output.put(ch, output.get(ch) + 1);
            } else {
                output.put(ch, 1);
            }

        }
        int result = output.get(search);
        System.out.println(output);
        System.out.println("The Character '"+search+"' appears "+result+" times.");

    }

}