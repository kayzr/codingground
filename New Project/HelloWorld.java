import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
         String [] family = {"Bakang","Moshelele","Kago","Basimane"};
         int [] numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
         
         for(int w:numbers){
             if(w%2==0){
                 
                 System.out.print(w+" ,is EVEN");
             }else{
                 System.out.print(w+",is ODD");
             }
         }
     }
     
}