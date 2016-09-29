
class Jlab2b3

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14


{
    public static void main(String[] args)
    {
    double num1;
    double num2;
    double num3;
  	
    System.out.println("Please enter your first number : "); 
    num1 =  EasyIn.getDouble() ; 
    System.out.println("Please enter your second number : "); 
    num2 =  EasyIn.getDouble() ; 
    System.out.println("Please enter your third number : "); 
    num3 =  EasyIn.getDouble() ; 
    	
        	
    	if ( num1 <= num2 && num1 <= num3 ) // comparing the 3 variables
    		{
    			System.out.println("\n\n\t The smallest number is : " + num1 );
    		}
    		
    	else if (num2 <= num1 && num2 <= num3)
    		{
    			System.out.println("\n\n\t The smallest number is : " + num2 );
    		}
    	else  
    		{
    			System.out.println("\n\n\t The smallest number is: " + num3 );
    		}
    
    	
    	

    	   	
    	
    
    	
    	 


		
	
	


    }
}

