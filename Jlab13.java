
class Jlab13

// Student Name : 		Rory Garner
// Student Id Number : 	C00193506
// Date :				17/9/14
// Purpose : 			Get the average of three numbers

{
    public static void main(String[] args)
    {
		double num1;
		double num2;
		double num3;
		double sum;
		double prod;
		double aver;// declaring varibles
		   	
    	System.out.println("Please enter the first number - "); 
    	num1 =  EasyIn.getDouble() ;
    	System.out.println("Please enter the second number -");
    	num2 = EasyIn.getDouble();
    	System.out.println("Please enter the third number -");//asking for input and collecting it
    	num3 = EasyIn.getDouble();
    	
    	sum = num1+num2+num3;	   
    	prod = num1*num2*num3; //preforming calculations
    	aver = sum/3;
    	
    	System.out.println("The sum is - "+ sum);
    	System.out.println("The product is -" + prod);
    	System.out.println("The average is -" + aver);//output

    }
}

