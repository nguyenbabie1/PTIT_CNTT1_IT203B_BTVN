package sessoin1.Bai1;

import java.util.Scanner;

public class Degister {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         try{
             System.out.println("enter your year of bith:");
             String input = sc.nextLine();

             int year = Integer.parseInt(input);
             int age = 2026 - year;

             System.out.println("your age is:"+ age);
         }catch(NumberFormatException e) {
             System.out.println("Eror:You must enter your year of bith in number.");

        }finally{
             sc.close();
         }
    }
}
