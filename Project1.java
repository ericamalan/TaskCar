package project1;
abstract class Car{

     private String CarName;
     private String CarType;
     private String Color;
     private int width;// width in mm
     private int length; //length in mm
     private int weight; // weight in kg
     private int SeatingCapacity; //SeatingCapacity in no
     private int engine; // engine in cc
     public void eric(){
        System.out.println("20euec504");
        System.out.println("Eric Amalan J");

     }
     public void dinesh(){
        System.out.println("19euec039");
        System.out.println("Dineshkumar.N");
     }
     
     
     Car(String CarName,String CarType,String Color,int width,int length,int weight,int SeatingCapacity,int engine){
         this.CarName = CarName;
         this.CarType = CarType;
         this.Color = Color;
         this.width = width;
         this.length = length;
         this.weight = weight;
         this.SeatingCapacity = SeatingCapacity;
         this.engine = engine;
     }
     
     public void display(){
         System.out.println("Car Name : "+this.CarName);
         System.out.println("Car Type : "+this.CarType);
         System.out.println("Color : "+this.Color);
         System.out.println("Width of the Car : "+this.width+" mm");
         System.out.println("Length of the Car : "+this.length+" mm");
         System.out.println("Weight of the Car : "+this.weight+" mm");
         System.out.println("Seating Capacity : "+this.SeatingCapacity);
         System.out.println("Engine : "+this.engine+" cc");
         System.out.println();
     }
     
     
     
     public void start(){
         System.out.println("The Car is Started");
     }
     public void stop(){
         System.out.println("The car has been stopped");
     }
     public void steerleft(){
         System.out.println("Turned Left");
     }
     public void steerright(){
         System.out.println("Turned Right");
     }
     public void brake(){
         System.out.println("Brake is enabled");
     }
     
     
     abstract public void gearUp();        
     
     abstract public void gearDown();         
     
     abstract public void accelarate();         
     
     abstract public void totalGears();
         
     
}



class CUV extends Car{
    
    CUV(String CarName,String CarType,String Color,int width,int length,int weight,int SeatingCapacity,int engine){
        super(CarName,CarType,Color,width,length,weight,SeatingCapacity,engine);
    }
    
    
    
    @Override
    public void gearUp(){
        System.out.println("Go with your top speed");
    }
    
    @Override
    public void gearDown(){
         System.out.println("Down the gear when you slow");
    }
    
    @Override
    public void accelarate(){
        System.out.println("Speed is increased by 25 km/hr");
    }
    
    @Override
    public void totalGears(){
         System.out.println("Total no of gears 8");
    }
    
}


class MUV extends Car{
    
    MUV(String CarName,String CarType,String Color,int width,int length,int weight,int SeatingCapacity,int engine){
        super(CarName,CarType,Color,width,length,weight,SeatingCapacity,engine);
    }
    
    @Override
    public void gearUp(){
        System.out.println("One gear is raised");
    }
    
    @Override
    public void gearDown(){
        System.out.println("One gear is downed");
    }
    
    @Override
    public void accelarate(){
        System.out.println("Speed is increased by 10 km/hr");
    }
    @Override
    public void totalGears(){
         System.out.println("Total no of gears 5");
    }
}

class SUV extends Car{
    
    SUV(String CarName,String CarType,String Color,int width,int length,int weight,int SeatingCapacity,int engine){
        super(CarName,CarType,Color,width,length,weight,SeatingCapacity,engine);
    }
    
    @Override
    public void gearUp(){
        System.out.println("Enjoy with high speed");
    }
    
    @Override
    public void gearDown(){
         System.out.println("Stay alert when you down");
    }
    
    @Override
    public void accelarate(){
        System.out.println("Speed is increased by 15 km/hr");
    }
    
    @Override
    public void totalGears(){
        System.out.println("Total no of gears 6");
    }
}




public class Project1 {

    
    public static void main(String[] args) {
        CUV object1 = new CUV("CUV","AudiQ8","Tango Red",1995,4986,2170,7,2995);
        object1.display();
        
        MUV object2 = new MUV("MUV","Renault Kiger","Caspian Blue",1750,3991,1012,5,999);
        object2.display();
        
        SUV object3 = new SUV("SUV","Mahindra Scorpio","Pearl White",1820,4456,1820,7,2179);
        object3.display();
        
    }
    
}
