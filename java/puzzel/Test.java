
import java.util.ArrayList;
import java.util.Random;
import java.util.*;  
public class Test {
    
    public static void main(String[] args) {
    PuzzleJava asd=new PuzzleJava();

    
        asd.getTenRolls();
        char x= asd.getRandomLetter();
        ArrayList<Integer> randomRolls = asd.getTenRolls();
        System.out.println(randomRolls);

        System.out.println(x);

        String pass=asd.generatePassword();
        System.out.println("this is a random passward of 8 chars"+pass);



        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter number of password ");  
        int a= sc.nextInt(); 
        String newpass=asd.getNewPasswordSet(a);
        System.out.println(newpass);
    }
   
}


