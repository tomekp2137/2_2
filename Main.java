import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) 
    {
       double pierwsza_l;  
       double druga_l;      
       Scanner wej = new Scanner(System.in);   
       
 
        System.out.println("Podaj pierwszą liczbę:"); 
       pierwsza_l = wej.nextDouble();
       System.out.println("Podaj drugą liczbę:");
       druga_l = wej.nextDouble();
      
               System.out.println( + pierwsza_l + druga_l);
            
               System.out.println( pierwsza_l - druga_l);
              
               System.out.println(pierwsza_l * druga_l);
            
               if(druga_l !=0)
               {
                 System.out.println(pierwsza_l / druga_l );
               }
               else
               {
                   System.out.println("Nie dzielimy przez zero!!!");
               }
               
       }
 
    }

