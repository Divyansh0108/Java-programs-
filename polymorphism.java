class AeroPlane2
{
    public void takeOff() 
    {
        System.out.println("AeroPlane is taking off");
    }

    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane2 extends AeroPlane2 //inheritance
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
    System.out.println("Cargoplane flies at lower height");
    }  
}


class PassengerPlane2 extends AeroPlane2 //inheritance
{
    public void takeOff() 
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}


class FighterPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
    System.out.println("FighterPlane flies at high height");
    }
}

class Airport
{
    public void poly(AeroPlane2 ref) //polymorphism
    {
        ref.takeOff(); //dynamic binding
        ref.fly(); //dynamic binding

        System.out.println("-------------------------------------");
    }
}

public class polymorphism2
{

    public static void main(String[] args) 
    {
       CargoPlane2 cp=new CargoPlane2(); //object creation
        
        PassengerPlane2 pp=new PassengerPlane2(); //object creation

        FighterPlane2 fp=new FighterPlane2(); //object creation

        Airport a=new Airport(); //object creation
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

        // cp.takeOff();
        // cp.fly();

        // pp.takeOff();
        // pp.fly();

        // fp.takeOff();
        // fp.fly();

        


    }
    
}