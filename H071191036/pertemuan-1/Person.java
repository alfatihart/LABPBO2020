package pertemuan1;

class Person {
    String name;
    int age;
    boolean isMale;
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
       return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
    
    void setGender(String gender){
        if (gender == "male") {
            isMale = true ;
            
         } else {
         isMale = false;
      
 
         }
     
    }
    String getGender(){
        
      if (isMale == true){
            return "male";
        }else{
            return "female";
        }
        
    }

    
    
}
 class Main {

        public static void main(String[] args) {
            Person p = new Person();
            p.setName("bayu");
            p.setAge(18);
            p.setGender("male");
            System.out.println(p.getName());
            System.out.println(p.getAge());
            System.out.println(p.getGender());
        }

    
}