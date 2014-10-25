
package GUI;

import Game.Stage1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Tester{
    public static void main(String[] args) {
        Stage1 stage1 = new Stage1("Kevin");
        Scanner sc = new Scanner(System.in);
        
        stage1.printMap();
        while(true){
            String input = sc.next();
            if(input.equalsIgnoreCase("a")){
                stage1.move(0, -1);
            }else if(input.equalsIgnoreCase("d")){
                stage1.move(0,1);
            }else if(input.equalsIgnoreCase("s")){
                stage1.move(1, 0);
            }else if(input.equalsIgnoreCase("w")){
                stage1.move(-1, 0);
            }else{
                System.out.println("Wrong input");
            }
            if (stage1.isPlayerDead()){
                System.out.println("YOU LOSE!");
                break;
            }
            if (stage1.getIsFinished()){
                System.out.println("YOU WIN!");
                break;
            }
        }
        
    }
}
