
class Car
{
    public void speed(){}
}

class Maruti extends Car
{
    public void speed()
    {
        System.out.println("Maruti Speed : 60km/hr");
    }
} 

class Alto extends Car
{
    public void speed()
    {
        System.out.println("Alto Speed : 70km/hr");
    }
} 

class Brezza extends Car
{
    public void speed()
    {
        System.out.println("Brezza Speed : 80km/hr");
    }
} 

public class Polymorphism2 {
    public static void main(String[] args) {
        Brezza brezza = new Brezza();
        Alto alto = new Alto();
        Maruti maruti = new Maruti();

        maruti.speed();
        alto.speed();
        brezza.speed();
    }
}
