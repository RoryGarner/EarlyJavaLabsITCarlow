
class Jlab15

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14
// Purpose : 			Calculate the amout of interest on the loan and display the total repayment




{
    public static void main(String[] args)
    {
    	double ammo ;
    	double intr ;//declaring the variables
    	int year ;
    	double trep ; 
    	
    	
    	System.out.println("Please enter the ammount of your loan - "); // prompts the user
    	ammo =  EasyIn.getDouble() ; 
    	System.out.println("Please enter the interest rate in percent of your loan - "); // prompts the user
    	intr = EasyIn.getDouble () ;
    	System.out.println("Please enter the length of your loan - "); // prompts the user
    	year = EasyIn.getInt () ;
    	
    	trep = (ammo*intr /100 *year)+ammo ; //calculates the answer
    	
    
		System.out.print("The total repayment is - " + trep); // displays the final answer(total repayment)
	
	


    }
}

