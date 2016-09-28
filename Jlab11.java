class Jlab11

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14
// Purpose : 			convert inch value to cm

{
    public static void main(String[] args)
    {
    	double inch ;  
    	double cent ; 	// declaring th variables
    	
    	System.out.println("Please input your value in inches - ");// prompting the user 
    	inch =  EasyIn.getDouble() ; // easy in to the value from the keyboard
    	cent = inch * 2.54 ;// calculation
    	System.out.println("The answer is - " + cent);// outputing the answer

    }
}

