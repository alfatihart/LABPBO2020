import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean ismale;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGender(boolean ismale) {
        this.ismale = ismale;

    }

    String getname() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getGender() {
        String male = "Laki - Laki ";
        String female = "perempuan ";

        if (ismale == true) {
            return male;

        } else {
            return female;
        }
    }

    public static void main(String[] args) {
        Scanner rv = new Scanner(System.in);
        Person person1 = new Person();
        person1.name = rv.nextLine();
        person1.age = rv.nextInt();
        person1.ismale = rv.nextBoolean();

        System.out.println("nama \t\t : " + person1.getname());
        System.out.println("umur\t\t : " + person1.getAge());
        System.out.println("jenis kelamin \t : " + person1.getGender());
        rv.close();

    }
}
