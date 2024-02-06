package Week5.Day1;

public class BasicOpps {
    public static void main(String[] args) {


       //int age =12;
        Dog d1 = new Dog();
        d1.name="Tommy";
        d1.bark();
        d1.walk();

        Dog d2 = new Dog();
        d2.name="Leo";
        d2.walk();


    }
}

class Dog{  //factory
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){

        System.out.println(name+" is barking");
    }


}

class Cat{

}

