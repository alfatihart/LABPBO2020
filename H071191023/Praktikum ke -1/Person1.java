import java.util.Scanner;
class Person1{
    String name;
    int age;
    boolean isMale;
    boolean isFemale;
       
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }
   public int getAge(){
       return age;
     
   }
   public void setAge(int age){
       this.age = age;
    }
    public String getgender(){
        if (isMale == true) {
            return "Male";
        } else{
            return "Female";
        }
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        Person1 person1 = new Person1();
        person1.setName(name);
        person1.setAge(18);
        person1.setGender(true);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getgender());
    }
    }

