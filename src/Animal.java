
//Inheritance also called as "is-a" relationship
//Single Inheritance
public class Animal {

    public Animal(){
        System.out.println("In Animal Class");
    }

    public Animal(int a){
      //  a=10;
        System.out.println("In Parameterized constructor");
        System.out.println("Value of a: "+a);
    }

    void eat(){
        System.out.println("All animals eat");
    }

    void sleep(){
        System.out.println("All animals sleep");
    }
}

//Dog is-a animal
class Dog extends Animal{

    public Dog(){
        super(10);
        System.out.println("In dog class");
    }
    void bark(){
        super.eat();
        System.out.println("Dogs bar");
    }
    //Overridden method
    void eat(){

        System.out.println("Dog eats meat");
    }
    public static void main(String[] args){
      Dog d=new Dog();
      d.bark();
      d.eat();
      d.sleep();

    }
}