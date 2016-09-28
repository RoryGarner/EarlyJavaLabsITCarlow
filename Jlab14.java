
class Jlab14

// Student Name : 		Rory Garner
// Student Id Number :
// Date :				17/9/14
// Purpose : 			Get the average




{
    public static void main(String[] args)
    {
		double num1; 
		double num2;
		double num3;
		double csum; // current sum
		double cpro; // current prosuct
		double cave; // current average
		double sum;
		double prod;// declaring varibles
		double aver;
		
    	
    	
    	System.out.println("Please enter the first number - "); 
    	num1 =  EasyIn.getDouble() ;
    	
    	csum = num1  ;
    	cpro = num1  ; // calculates the current answer
    	cave = csum;
    	
    	
    	System.out.println("The current sum is - "+ csum);
    	System.out.println("The current product is -" + cpro);
    	System.out.println("The current average is -" + cave); // displays current answers
    	
    	
    	
    	
    	System.out.println("Please enter the second number -"); // prompts user to enter for first two numbers
    	num2 = EasyIn.getDouble();
    	
    	csum = num1 + num2 ;
    	cpro = num1 * num2 ; // calculates the current answer
    	cave = csum/2;
    	
    	
    	System.out.println("The current sum is - "+ csum);
    	System.out.println("The current product is -" + cpro);
    	System.out.println("The current average is -" + cave); // displays current answers
    	
    	
    	System.out.println("Please enter the third number -"); // prompts user to enter for third number
    	num3 = EasyIn.getDouble();
    	
    	sum = num1+num2+num3;	   
    	prod = num1*num2*num3; // calculates the final answer
    	aver = sum/3;
    	
    	System.out.println("The sum is - "+ sum);
    	System.out.println("The product is -" + prod);
    	System.out.println("The average is -" + aver); // displays final answers 

    }
}

