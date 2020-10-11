// CSC-151-O1
// Sterling Clark 
// 10/8/20
package ch07supplemental;


public class Rusty1 {

 
    public static void main(String[] args) {
        
//        int amountOfYears = Dealership.getYearsInBusiness();
//        String email = Dealership.COMPANY_EMAIL;
        
        System.out.println(Dealership.getCompanyBanner());
        System.out.println();
        System.out.print("We've been operating now for " + Dealership.getYearsInBusiness() + " years!"
                          + "\nTo talk to one of our sales people, send an email to " + Dealership.COMPANY_EMAIL);
        System.out.println();
                        
    }
    
}
