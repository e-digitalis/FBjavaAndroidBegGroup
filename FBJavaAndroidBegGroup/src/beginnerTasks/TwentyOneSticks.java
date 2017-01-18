
package beginnerTasks;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author User
 */

public class TwentyOneSticks {
    
    public String Player1;
    public String Player2;
    
    public int sticks = 21;
    public int random;
    public static int gameCounter = 0;
    
    Scanner myScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        TwentyOneSticks ts21 = new TwentyOneSticks();
        ts21.playGame();
        // ts21.testRandom();
    }
    
    public void testRandom(){
        for (int counter = 0; counter <11; counter++){
        int test = createRandom();
        System.out.println(test);
        }
    }
    
    public void playGame(){
        System.out.println("Number of sticks at beginning of game: " + sticks);
        
        if (gameCounter%2 == 0){
                    
        while (sticks >0){
        //    ask();
            int minus = createRandom();
            sticks -= minus;
            gameCounter ++;
            System.out.println("Game rep: "+ gameCounter + " Number of sticks remaining: " + sticks);
        }
        } else {
                    
        while (sticks >0){
            ask();
            int minus = createRandom();
            sticks -= minus;
            gameCounter ++;
            System.out.println("Game rep: "+ gameCounter + " Number of sticks remaining: " + sticks);
        }
        }
    }
    
    /*
    The modulus operator, %, will give you the remainder after 
    dividing by a number. So n % 2 == 0 will be true if n is even 
    and false if n is odd. Every even number is divisible by two, 
    regardless of if it's a decimal (but the decimal, if present, 
    must also be even).
    */
    
public int ask(){
    System.out.println("How many sticks do you want to take?");
    int answer = myScanner.nextInt();
    return answer;
}

public int createRandom(){

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    random = ThreadLocalRandom.current().nextInt(1, 3);
    return random;
    }
}
