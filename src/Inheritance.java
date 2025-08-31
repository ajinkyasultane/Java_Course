public class Inheritance {

    boolean islive = true;

    void eating()
    {
        System.out.println("This is a Inheritance class method");
    }


    public static  void main(String[] args)
    {
    Inheritance base = new Inheritance();
    Animals parent = new Animals();
    Dog child = new Dog();
    Cat child1  = new Cat();


    child1.meow();
    child1.animals();
    child1.eating();
    child1.islive =false;

        System.out.println();

        parent.animals();

    }

}

class Animals extends Inheritance

{
 void animals()
 {
     System.out.println("This is a Animals Class method");
 }
}
class Dog extends Animals
{
    void barking()
    {
        System.out.println("Dog is barking");
    }
    }

    class Cat extends Animals
    {void meow()
    {
        System.out.println("This is Cat class method");
    }}

