import java.util.Random;
import java.util.ArrayList;


public class PuzzleJava{

    public ArrayList <Integer> getTenRolls(){
        ArrayList <Integer> arr =new ArrayList <Integer>();
        Random randMachine = new Random();
    for (int i=0;i<10;i++){


            arr.add(randMachine.nextInt(21)) ;
            
        }
        return arr ;
    }


    public char getRandomLetter(){

        // String [] arr = {"a","b","c","d","e",};
        // Random rand = new Random();

        // String s=arr.rand(arr.length);

       
            Random r = new Random();
            return (char)(r.nextInt(26) + 'A');
        
        
    }
    public String generatePassword(){
        Random r = new Random();
        String st =" ";
        for (int i=0;i<8;i++){
            st+=(char)(r.nextInt(26) + 'A');
        }

        return st;
    }
    public String getNewPasswordSet(int n){
        Random r = new Random();
        String st =" ";
        for (int i=0;i<n;i++){
            st+=(char)(r.nextInt(26) + 'A');
        }

        return st;
    }
}