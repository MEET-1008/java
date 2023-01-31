import java.util.*;

class p9_string_function {
    public static void main (String args[]){
        String first = "indus";

        // replace function i string 
        System.out.println(first.replace('m','M'));
        
        // string lowercase to uppercass
        System.out.println(first.toUpperCase());
        System.out.println(first.toCharArray());

        // find the string length 
        System.out.println("first string length is :- "+first.length());

        // string concat 
        System.out.println("university ".concat(first));
    }
}
