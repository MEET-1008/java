import java.util.*;

class p5_even_print_1to50 
{
    public static void main(String[] args)
    {
        for(int i = 0 ; i < 50 ; i++ ){
            if (i % 2 == 0){
                System.out.printf(  i + " ");
            }
        }
    }
}