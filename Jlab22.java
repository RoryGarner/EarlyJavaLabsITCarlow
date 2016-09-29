
class Jlab22

// Student Name : 		Rory Garner
// Student Id Number : 	
// Date :				17/9/14
			

{
    public static void main(String[] args)
    {   	
    	int result1 ;
    	int result2 ;
    	int result3 ;
    	double sum ;
    	double average ;
    	
    	//inputs
    	System.out.print("Please enter your first result - "); 
    	result1 =  EasyIn.getInt() ; 
    	System.out.print("Please enter your second result - ");
    	result2 =  EasyIn.getInt() ;  
    	System.out.print("Please enter your third result - "); 
       	result3 =  EasyIn.getInt() ;
       	
       	//calculations
       	sum = result1+result2+result3 ; 
       	average = sum/3;
       	
       	
   		System.out.println("The Average is = - "+ average ); 
   		if (average >=70)
    		{	
    			System.out.println("Distinction "+ average);
			}	
		else if (average >=63)
			{	
    			System.out.println("Merit1 "+ average);
			}
		else if (average >=55)
			{	
    			System.out.println("Merit2 " + average);
    		}	
   		else if (average >=40)
			{	
    			System.out.println("Pass " + average);
    		}	
   		else if (average <=40)
			{	
    			System.out.println("Fail " + average);
 			}
 

	


    }
}

