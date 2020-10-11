// CSC-151-O1
// Sterling Clark 
// 10/8/20
package ch07supplemental;

public class Rusty3 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the 4 car instances
        Car car1 = new Car();
        Car car2 = new Car("1987654", "Toyota", "Camry", 2013, 1000.99, 60.00, "Used", "It's a lovely car");
        Car car3 = new Car("2856412", "BMW", "530i", 2005, 5000.99, 60.00, "Used", "Used to drive to and from work daily");
        Car car4 = car1.copy();
        
        car1.setVIN("397482");
        car1.setMake("Hyundai");
        car1.setModel("Elantra GT");
        car1.setDealerCost(10000.00);
        
        
        
        car4.setModelYear(2016);
        car4.setDealerCost(15000.00);
        
        // print out display
        System.out.println("Car 1: " + car1.carSummary());
        System.out.println("Car 2: " + car2.carSummary());
        System.out.println("Car 3: " + car3.carSummary());
        System.out.println("Car 4: " + car4.carSummary());
        
        
    }
    
}
