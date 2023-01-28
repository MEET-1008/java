import java.util.*;

class p9_string_function {
    public static void main (String args[]){
        String first = "meet";

        // replace function i string 
        System.out.println(first.replace('m','M'));
        
        // string lowercase to uppercass
        System.out.println(first.toUpperCase());

        // find the string length 
        System.out.println("first string length is :- "+first.length());

        // string concat 
        System.out.println("vaghasiya ".concat(first));
    }
}