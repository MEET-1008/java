import java.util.*;

class p09_string_function {
    public static void main (String args[]){
        String first = "indus";

        // replace function i string 
        System.out.println(first.replace('i','I'));
        
        // string lowercase to uppercass
        System.out.println(first.toUpperCase());

        // find the string length 
        System.out.println("first string length is :- "+first.length());

        // string concat 
        System.out.println("university ".concat(first));
    }
}
