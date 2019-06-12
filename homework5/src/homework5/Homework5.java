package homework5;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {
        
        System.out.println("menu (carculator)");
        System.out.println(" 1 - Addition");
        System.out.println(" 2 - Subtraction");
        System.out.println(" 3 - Multiplication");
        System.out.println(" 4 - Division ");
        System.out.println(" 5 - Remainder");       
                
                
         Scanner first = new Scanner(System.in);
          double x = first.nextInt();
          
          
            if (x==1)
            {
            System.out.println("write the first integer");
            Scanner q = new Scanner(System.in);
          double y = q.nextInt();
            System.out.println("write the seconed integer");
            Scanner w = new Scanner(System.in);
          double z = w.nextInt();
          System.out.println(y+z);
           }
            
        else if(x==2){
            System.out.println("write the first integer");
            Scanner q = new Scanner(System.in);
          double y = q.nextInt();
            System.out.println("write the seconed integer");
            Scanner w = new Scanner(System.in);
          double z = w.nextInt();
          System.out.println(y-z);
        }
        else if(x==3){
            System.out.println("write the first integer");
            Scanner q = new Scanner(System.in);
          double y = q.nextInt();
            System.out.println("write the seconed integer");
            Scanner w = new Scanner(System.in);
          double z = w.nextInt();
          System.out.println(y*z);
        }
            
        else if(x==4){
            System.out.println("write1 the first integer");
            Scanner q = new Scanner(System.in);
          double y = q.nextInt();
            System.out.println("write the seconed integer");
            Scanner w = new Scanner(System.in);
          double z = w.nextInt();
          System.out.println(y/z);
        }
        else if(x==5){
            System.out.println("write the first integer");
            Scanner q = new Scanner(System.in);
          double y = q.nextInt();
            System.out.println("write the seconed integer");
            Scanner w = new Scanner(System.in);
          double z = w.nextInt();
          System.out.println(y%z);
        }
    }
} 

