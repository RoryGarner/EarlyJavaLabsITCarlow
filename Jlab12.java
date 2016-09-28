
class Jlab12

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14
// Purpose : 			Calculating the average mph and fuel consumption

{
    public static void main(String[] args)
    {
    	double distance ;
    	double hour ;
    	double gallons ;
    	double amph ;
    	double mpg ;// declaring variables
    	
    	System.out.println("Please enter the distance you have travelled in miles - "); 
    	distance =  EasyIn.getDouble() ; 
     	System.out.println("Please enter the journey time in hours - ");
     	hour = EasyIn.getDouble();
     	System.out.println("Please enter the the amount of petrol consumed in gallons - "); // asking for and collecting input from users
     	gallons = EasyIn.getDouble();
     	
     	amph = distance/hour;
     	mpg = distance/gallons;// preforming calculations
     	
		System.out.println("The average speed was -  " + amph);
		System.out.println("Miles per gallon consumed was -  " + mpg); // output

    }
}

