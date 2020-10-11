// CSC-151-O1
// Sterling Clark 
// 10/8/20
package abtechapp;


public class ABTechApp {

    public static void main(String[] args) {
//        System.out.println(Abtech.getTuitionCost(false, 18));

          Student test = new Student("Sterling", "Clark", 2021);
          Student test2 = new Student("Peter", "Parker", 2023);
          System.out.println(test2.getStudent());
          System.out.print("Next Student: ");
          System.out.println();
          System.out.println(test.getStudent());
    }
    
}
