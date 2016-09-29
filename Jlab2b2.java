
class Jlab2b2

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14

{
    public static void main(String[] args)
    {
    double moneyInput;
    double tax1;
    double tax2;
    double total;
    
    	
    	System.out.println("Please enter you bill total : "); 
    	moneyInput =  EasyIn.getDouble() ; 
    	
    tax1 = moneyInput * 0.12;
    tax2 = (moneyInput - 500) * 0.18; // calculating the tax rates 
    total = tax1 + tax2;
    	
    	if ( moneyInput <=500 )
    		{
    			System.out.println("\n\n\t Your tax bill is : " + tax1 );
    		}
    		
    	else if ( moneyInput>500)
    		{
    			System.out.println("\n\n\t Your tax bill is : " + total );
    		}
    
    	
    	

    	   	
    	
    
    	
    	 


		
	
	


    }
}

