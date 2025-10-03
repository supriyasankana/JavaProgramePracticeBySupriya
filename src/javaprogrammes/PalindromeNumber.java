package javaprogrammes;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=121;
		int input=n;
		int rev=0;
		int r=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		
		if(input==rev)
			System.out.println("given number is palindrome" + rev);
		else
			System.out.println("given number is not palindrome"+rev);
	}

}
