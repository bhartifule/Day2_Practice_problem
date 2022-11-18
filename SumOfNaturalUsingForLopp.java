package Day2PracticeProblem;
import java.util.Scanner;
public class SumOfNaturalUsingForLopp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a natural number");
		int N=scan.nextInt();
	
		int s=0;
		for(int i=1;i<=N;i++) 
			s=s+i;
			System.out.println("sum is "+s);
		
	}
}