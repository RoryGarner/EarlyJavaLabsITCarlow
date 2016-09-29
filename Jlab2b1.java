
class Jlab2b1

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14

{
    public static void main(String[] args)
    {
    	double premiumValue;
    	int claimsMade;
    	double increase;
    	double discount;
    	double newPremium;
    	double total; // declaring the variables 

    
    	
    	
    	System.out.println("Please enter last years premium value - "); 
    	premiumValue =  EasyIn.getInt() ; 
    	System.out.println("Please enter the number of claims you made last year - "); // collecting input
    	claimsMade =  EasyIn.getInt() ; 
    	
    	increase = premiumValue * 0.05 ;
    	newPremium = (premiumValue + increase);
    	total = newPremium; 
    	discount = increase * 0.40 ; // setting their values

    	if (claimsMade ==0)
		{
			// Discount is 40%
			discount = increase * 0.40 ;
			total = newPremium - discount;
    	}
    	else if (claimsMade > 0)
    	increase = (premiumValue * (0.2 * claimsMade)) + newPremium ;
    	
    	else 
    	{
    		discount = 0 ;
    		total = newPremium ;
        		
    	}
    	
    	System.out.println("\n\n\tIncrease on last years premium is : " + increase);    	
    	System.out.println("\n\tThis years premium is : "  + newPremium );
	   	System.out.println("\n\tYour no claims discount is :" + discount);//output answers
	   	System.out.println("\n\tYour no total for this year is :" + total);
    }
}

