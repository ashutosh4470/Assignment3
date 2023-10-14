
class Animal
{
    public void makeSound()
    {
        System.out.println("Animal making noice");
    }
}

class Dog extends Animal
{   
    @Override
    public void makeSound()
    {
        System.out.println("Bho.......Bho.......");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Meaw........Meaw......");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
    }
}
