package sampleproject;

public class Conversion {

	public static void main(String[] args) {
		byte c;
		byte b = 24;
        short sh = b; 
		
        System.out.println(b);
        System.out.println(sh);
        
        short sh1= 500;
        byte b1 = (byte)sh1; // type - casting
        System.out.println(sh1);
        System.out.println(b1);
        
        short sh2= 50;
        byte b2 = (byte)sh2; // type - casting
        System.out.println(sh2);
        System.out.println(b2);
	}

}

// Datatype variableName; -> declaring a variable  example :- int f=234; String f= "name"; 
// Datatype variableName = 43 -> Declaring a variable and assigning the values