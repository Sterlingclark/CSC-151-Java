// CSC-151-O1
// Sterling Clark 
// 10/8/20
package ch07supplemental;


import java.util.Calendar;

public class Dealership {

	// public static final class variables

	public static final int YEAR_STARTED = 1995;
	public static final String COMPANY_NAME = "The Rusty Lemon";
	public static final String COMPANY_URL = "www.TheRustyLemon.com";
	public static final String COMPANY_ADDRESS = 
				"123 Rustbelt Road, Somewhere, SomeState, 12345";
	public static final String COMPANY_SLOGAN = 
						"Many parts of our cars run great!";
	public static final double STANDARD_MARKUP = 0.50;
        public static final String COMPANY_EMAIL = "contact@therustylemon.com";
	

	// public static methods

	public static String getCompanyBanner () {
		return COMPANY_NAME + "\n(Selling rusty lemons since " + 
			YEAR_STARTED + ")\n" + COMPANY_ADDRESS + "\n" +
			COMPANY_URL + "\n" + COMPANY_SLOGAN + "\n";
	}

	public static double getRetailPrice (double dealerCost, double cleaningCost) {
		double markup = dealerCost * STANDARD_MARKUP;
		return dealerCost + cleaningCost + markup;
	}
        
        public static int getYearsInBusiness() {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int yearsInBusiness = currentYear - YEAR_STARTED;
            return yearsInBusiness;
        }
}	
