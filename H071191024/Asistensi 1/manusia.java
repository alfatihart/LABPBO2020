import java.util.Scanner;
class manusia 
{
    public static void main(String[] args) {
        Scanner rv = new Scanner (System.in);
            karakter person1 = new karakter();
            person1.name = rv.nextLine();
            person1.age = rv.nextInt();
            person1.ismale = rv.nextBoolean();

            System.out.println("nama \t\t : "  + person1.getname());
            System.out.println("umur\t\t : " + person1.getAge());
            System.out.println("jenis kelamin \t : "+ person1.getGender());
            rv.close();

    }
}