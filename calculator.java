import java.util.Scanner;
class  calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int operator ,n1,n2;
		while(true){
		System.out.println(" 1-addition\n 2- subtraction\n 3-multiplication\n 4-division\n 5-exponentiation\n 6-quit.");
        System.out.println("please select operator");
		operator =sc.nextInt();
     
		if (operator == 6)
		{
			System.out.println("Calculator is exiting. Goodbye!");
		}

		System.out.println("enter the firstNumber");
		n1=sc.nextInt();
		System.out.println("enter the seconndNumber");
		n2=sc.nextInt();
		int result = 0;

		switch(operator){
			case 1:
				System.out.println("result " + (n1+n2));
			    break;
			case 2:
				System.out.println("result " +(n1-n2));
			     break;
			case 3:
				System.out.println("result " +(n1*n2));
			     break;
			case 4:
				System.out.println("result " +(n1/n2));
			     break;
			case 5:
				System.out.println("result " +(Math.pow(n1,n2)));
			     break;
			 default:
             System.out.println("Invalid choice. Please choose again.");
             System.out.println("Enter Operator is not vaild");
		  }
		}
	}
}
