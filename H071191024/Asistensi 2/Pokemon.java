  import java.util.*;
  public class Pokemon {

    private String name;
    private String type;
    private int attackP;
    private int defense;
    private int xp;
    private int hp;
    private boolean dead;

    public Pokemon(String name, String type, int attackP , int defense){
        this.name = name;
        this.type = type;
        this.attackP = attackP;
        this.defense = defense;
        xp = 0;
        hp = 100;
    }
    public void getDamage(Pokemon enemy){
        if( defense < enemy.getAttackPower()){
            if(type == "water" && enemy.type == "electric"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else if(type == "ground" && enemy.type == "water"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else if(type == "fire" && enemy.type == "water"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else if(type == "electric" && enemy.type == "ground"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((attackP)*(20/100)));
            }else{
                enemy.hp = enemy.hp - Math.abs(enemy.defense - (attackP));
            }
        }

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setAttackPower(int attackP){
        this.attackP = attackP;
    }
    public int getAttackPower(){
        return attackP;
    }
    public void desc(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
        System.out.println("hp = " + hp);
        System.out.println("defense = " + defense);
        System.out.println("attack =" + attackP);
        System.out.println();
    }
    public boolean Dead(Pokemon enemy){
        if(enemy.hp <= 0){
            return true;
        }else{
            return false;
        }
    }
  


    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("insert pokemon1");
        System.out.println("name");
        String name = pew.next();
        System.out.println("type");
        String type = pew.next();
        System.out.println("attack");
        int attack = pew.nextInt();
        System.out.println("defense");
        int def = pew.nextInt();
        Pokemon poke1 = new Pokemon(name, type, attack, def);

        System.out.println("insert pokemon");
        System.out.println("name");
        String name2 = pew.next();
        System.out.println("type");
        String type2 = pew.next();
        System.out.println("attack");
        int attack2  = pew.nextInt();
        System.out.println("defense");
        int def2 = pew.nextInt();
        Pokemon poke2 = new Pokemon(name2, type2, attack2, def2);

        boolean p = false;
        int menu = 0;
        while(menu != 2){
            System.out.println("1. attack");
            System.out.println("2. quit");
            menu = pew.nextInt();
            if(menu == 1){
                if(p == false){
                    poke1.getDamage(poke2);
                    poke1.desc();
                    poke2.desc();
                    p = true;
                }else{
                    poke2.getDamage(poke1);
                    poke1.desc();
                    poke2.desc();
                    p = false;
                }
            }
            if(poke1.Dead(poke2) || poke2.Dead(poke1)){
                if (poke2.Dead(poke1)){
                    System.out.println(poke1.getName() + " mati ");
                    System.out.println();
                    System.out.println(poke2.getName() + "winner");
                }else{
                    System.out.println(poke2.getName() +  " mati ");
                    System.out.println();
                    System.out.println(poke2.getName() + "winner");
                }
                break;
            }

        }
    }
} 