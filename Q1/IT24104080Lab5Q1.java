import java.util.Scanner;

  public class IT24104080Lab5Q1 {
    public static void main(String[] args){
      Scanner number = new Scanner(System.in); 

	System.out.print("Enter the first integer:");
	int num1=number.nextInt();
	System.out.print("Enter the second integer:");
	int num2=number.nextInt();
	System.out.print("Enter the third integer:");
	int num3=number.nextInt();

	System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3 + "");

	if(num1<num2){
	  if(num1<num3){
		System.out.println("The Smallest number is: " + num1 + " ");
	  }else System.out.println("The Smallest number is: " + num3 + " ");
	}else 
		if(num2<num3){
		  System.out.println("The Smallest number is: " + num2 + " ");
		}else System.out.println("The Smallest number is: " + num3 + " ");
 	
	if(num1>num2){
	  if(num1>num3){
		System.out.println("The Largest number is: " + num1 + " ");
	  }else System.out.println("The Largest number is: " + num3 + " ");
	}else 
		if(num2>num3){
		  System.out.println("The Largest number is: " + num2 + " ");
		}else System.out.println("The Largest number is: " + num3 + " ");	
 }
}