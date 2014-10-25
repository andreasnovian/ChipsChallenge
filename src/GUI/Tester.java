
package GUI;

import Game.Stage1;
import Game.Stage3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Tester{
    public static void main(String[] args) {
        Stage3 stage3 = new Stage3("Kevin");
        Scanner sc = new Scanner(System.in);
        
        stage3.printMap();
        while(true){
            String input = sc.next();
            if(input.equalsIgnoreCase("a")){
                stage3.move(0, -1);
            }else if(input.equalsIgnoreCase("d")){
                stage3.move(0,1);
            }else if(input.equalsIgnoreCase("s")){
                stage3.move(1, 0);
            }else if(input.equalsIgnoreCase("w")){
                stage3.move(-1, 0);
            }else{
                System.out.println("Wrong input");
            }
            if (stage3.isPlayerDead()){
                System.out.println("YOU LOSE!");
                break;
            }
            if (stage3.getIsFinished()){
                System.out.println("YOU WIN!");
                break;
            }
        }
        
    }
}
