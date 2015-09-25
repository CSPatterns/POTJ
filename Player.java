import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt();
            int thorX = initialTX;
            int thorY = initialTY;
            
            String direction = "";
           // String directionY = "";
            
            if (thorX > lightX){
                direction = "W";
                thorX--;
            }
            else if (thorX <lightX){
                direction = "E";
                thorX++;
            }
            
             if (thorY > lightY){
                direction = "N";
                thorX--;;
            }
            else if (thorY < lightY){
                direction = "S";
                 thorX++;
            }
            
            //System.out.println(directionX);
            //System.out.println(directionY);
            

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(direction); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}