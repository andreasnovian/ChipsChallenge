
import Stage.Stage1;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Tester {
    public static void main(String[] args) {
        Stage1 stage1 = new Stage1("Kevin");
        stage1.printMap();
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
        }
        
    }
}
