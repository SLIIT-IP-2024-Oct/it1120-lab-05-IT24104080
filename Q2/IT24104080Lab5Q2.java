import java.util.Scanner;

public class IT24104080Lab5Q2{
  public static void main(String[] args){

    Scanner member = new Scanner(System.in);

	System.out.print("Enter the number of new members introduced:");
	int num=member.nextInt();

	if(num>=5){
		System.out.println("Prize is a : Headphone");
	}else if(num==4){
			System.out.println("Prize is a : Travelling Chair");
		 }else if(num==3){
				System.out.println("Prize is a : Bag");
			}else if(num==2){
					System.out.println("Prize is a : Umbrella");
				}else if(num==1){
						System.out.println("Prize is a : Pen");
					}else if(num==0){
						System.out.println("No Prize");
						}else

	System.out.println("Input must be a number 0 or greater");
	
 }
}