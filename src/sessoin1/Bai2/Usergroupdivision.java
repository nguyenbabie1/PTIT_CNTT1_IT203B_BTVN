package sessoin1.Bai2;

import java.util.Scanner;

public class Usergroupdivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of names:");
        int totalUsers = sc.nextInt();
        System.out.println("Enter number of groups");
        int numberofgroups = sc.nextInt();

        try{
            int userPerGroups = totalUsers/ numberofgroups;
            System.out.println("Each group has:"+ userPerGroups + " -users");

        }catch(ArithmeticException e){
            System.out.println("Cant not devide by 0 !");
        }
        sc.close();
    }
}
