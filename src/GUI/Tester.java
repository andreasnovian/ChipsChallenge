
package GUI;


import Game.Stage1;
import Game.Stage2;
import Game.Stage3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Stage1 stage1 = new Stage1("Kevin");
//        stage1.printMap();
        Stage2 stage2 = new Stage2("Kevin");
        stage2.printMap();
        while(true){ 
            String input = sc.next();
            if(input.equalsIgnoreCase("a")){
                stage2.move(0, -1);
            }else if(input.equalsIgnoreCase("d")){
                stage2.move(0,1);
            }else if(input.equalsIgnoreCase("s")){
                stage2.move(1, 0);
            }else if(input.equalsIgnoreCase("w")){
                stage2.move(-1, 0);
            }else{
                System.out.println("Wrong input");
            }
            if (stage2.isPlayerDead()){
                System.out.println("YOU LOSE!");
                break;
            }
            if (stage2.getIsFinished()){
                System.out.println("YOU WIN!");
                break;
            }
            
        }
    }
}

