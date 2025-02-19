package loops;
import java.util.*;
public class common_factors {
	public static void checkcommon(int a,int b) {
		/*common factor cannot be greater than any one of a,b
		  bcoz factors of any num cannot be greater than itself
		  ex:12,18 common factors are 1,2,3,6 no factor is greater than any of 12,18
		  so,i<=a or i<=b
		  to make code more efficient we can find min of two numbers then i<=min
		  so,int min=a<b?a:b;
		  i<=min
		*/
		for(int i=1;i<=a;i++) {
		   if(a%i==0 && b%i==0) {
				System.out.println(i);
			}
			}
	   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a,b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		checkcommon(a,b);
	}

}
