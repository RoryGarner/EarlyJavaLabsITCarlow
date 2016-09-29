
class Jlab2b4

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
    
        	
    	if ( num1 <= num2 && num1 <= num3 )// performing the checks on each number to finf its position/value
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
    		
        if (( num1 >= num2 && num1 <= num3 )||( num1 >= num3 && num1 <= num2)) 
    		{
    			System.out.println("\n\n\t The middle number is : " + num1 );
    		}	
    	else if ((num2 >= num1 && num2 <= num3)||(num2>= num3 && num2 <= num1))
    		{
    			System.out.println("\n\n\t The middle number is : " + num2 );
    		}
    	else  
    		{
    			System.out.println("\n\n\t The middle number is: " + num3 );
    		}
    		
    	if ( num1 >= num2 && num1 >= num3 )
    		{
    			System.out.println("\n\n\t The highest number is : " + num1 );
    		}
    		
    	else if (num2 >= num1 && num2 >= num3)
    		{
    			System.out.println("\n\n\t The highest number is : " + num2 );
    		}
    	else  
    		{
    			System.out.println("\n\n\t The highest number is: " + num3 );
    		}
        }
}

