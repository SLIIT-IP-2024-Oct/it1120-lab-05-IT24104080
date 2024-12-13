import java.util.Scanner;
  public class IT24104080Lab6Q1 {
    public static void main(String[] args){

  Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number:");
	int num = input.nextInt();

	double Squarenum ;
	double SquareRootNum ;

	Squarenum = num*num ;
	SquareRootNum = num^(1/2) ;

	System.out.println("The square of "+ num +" is : " + Squarenum + " ");
	System.out.println("The square root of "+ num +" is : " + SquareRootNum + " ");
  }
}