
class Jlab24

// Student Name : 		Rory Garner
// Student Id Number : 	C00193506
// Date :				17/9/14

{
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	
    	
    	System.out.println("Please enter the first number - "); 
    	number1 =  EasyIn.getInt() ; 
    	System.out.println("Please enter the second - "); 
    	number2 =  EasyIn.getInt() ; 

		if (number1 % number2 == 0)
			{
				System.out.println("The number is divisable - ");
    		}
    	else
    		{
				System.out.println("The number not is divisable - ");
    		}


    }
}

