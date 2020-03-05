import java.util.Scanner;
class Player{
    private String name;
    private int Hp;
    private int AttackPower;
    private int defense;
    private int Damage;
    private int defense2;
    private String status;
    
    public Player(String name, int attack, int defense2) {
        this.name = name;
        this.defense = defense;
        Hp = 100;
    } 
    public Player(String string, int defense2) {
        this.toString();
        this.defense2 = defense2;
    }

    // lengkapi
    public int getHp(){
        return Hp;
    }
    public void setHp(int Hp){
        this.Hp = Hp;
    }
    public int getAttackPower(){
        return 0;
    }
    public void setAttackPower(int AttackPower) {
        this.AttackPower = AttackPower;
    }
    public int getDamage(){
        return Damage;
    }
    public void getDamage(Player enemy){
        Hp = Hp - (defense - enemy.getAttackPower());
    }
    public void setDamage(){
        this.Damage = Damage;
    }
    public void getname(){
        return;
    }
    public void setname(String name){
        this.name= name;
}
   // public String getstatus() {
     //   return this.name;
    //}
    public void status() {
        System.out.println(name+ " status ");
        System.out.println("Hp = " + Hp);
        System.out.println("defense="+defense);
        System.out.println("Attack ="+AttackPower);
   }
    public int defense(){
        return AttackPower;
    }
    public void setdefense(int defense) {
        this.defense = defense;
    }
    
    }class Main{
        public static void main(String[] args) {
            Scanner mm = new Scanner(System.in);
            int defense = 15;
            int attack = 30;
            Player player1 = new Player("Mino", attack, defense);
            Player player2 = new Player("Hilda",defense);
            //lengkapi
            player1.setAttackPower(attack);
         //   player2.getAttackPower();
           // player1.getAttackPower();
            player2.setAttackPower(attack+5);
           
            player1.setname("Mino");
            player2.setname("Hilda");

            player1.setHp(95);
            player2.getHp();
            player2.setHp(100);
            player2.getHp();
            player1.setdefense(15);
            player2.setdefense(15);
            player1.getDamage(player2);
            player2.getDamage(player1);
            player1.status();
            player2.status();
        }
    }
