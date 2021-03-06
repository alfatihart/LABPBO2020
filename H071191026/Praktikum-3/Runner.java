/**
 * runner
 */
import java.util.*;
public class Runner {

    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("welcome to the battle simulator");
        System.out.println("insert player 1");
        System.out.println("name");
        String name = pew.next();
        System.out.println("role");
        String role = pew.next();
        Player player1 = new Player(name, role);
        System.out.println();
        System.out.println("insert player 2");
        System.out.println("name");
        String name2 = pew.next();
        System.out.println("role");
        String role2 = pew.next();
        Player player2 = new Player(name2, role2);

        int p1 = 0;
        int p2 = 0;
        while(true){
            if(player1.dead(player2) || player2.dead(player1)){
                if(player1.dead(player2)){
                    System.out.println(player1.getName() + " dead");
                    System.out.println();
                    System.out.println(player2.getName() + " win");
                }else{
                    System.out.println(player2.getName() + " dead");
                    System.out.println();
                    System.out.println(player1.getName() + " win");
                }
            }

            //player1
            System.out.println();
            System.out.println(player1.getName() + "turn's");
            System.out.println("1. show status");
            System.out.println("2. show items");
            System.out.println("3. attack");
            System.out.println("4. heal");
            System.out.println("5. buy items");
            System.out.println("6. sell items");
            System.out.println("7. quit");
            p1 = pew.nextInt();
            if(p1 == 1){
                player1.showStatus();
            }else if(p1 == 2){
                player1.showItems();
            }else if(p1 == 3){
                player1.attack(player2);
            }else if(p1 == 4){
                player1.healing(player1);
            }else if(p1 == 5){
                System.out.println("beli Hp potion");
                int item = pew.nextInt();
                player1.buy(player1, item);
            }else if(p1 == 6){
                System.out.println("item ke? ");
                int jual = pew.nextInt();
                player1.sell(jual);
            }else if(p1 == 7){
                return;
            }

            //player2
            System.out.println();
            System.out.println(player2.getName() + "turn's");
            System.out.println("1. show status");
            System.out.println("2. show items");
            System.out.println("3. attack");
            System.out.println("4. heal");
            System.out.println("5. buy items");
            System.out.println("6. sell items");
            System.out.println("7. quit");
            System.out.println();
            p2 = pew.nextInt();
            if(p2 == 1){
                player2.showStatus();
            }else if(p2 == 2){
                player2.showItems();
            }else if(p2 == 3){
                player2.attack(player1);
            }else if(p2 == 4){
                player1.healing(player2);
            }else if(p2 == 5){
                System.out.println("beli Hp potion");
                int item2 = pew.nextInt();
                player2.buy(player2, item2);
            }else if(p2 == 6){
                System.out.println("item ke? ");
                int jual = pew.nextInt();
                player1.sell(jual);
            }else if(p2 == 7){
                return;
            }


        }

    }
}