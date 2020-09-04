/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int num=9829;
	    while(num>9){
	        num=no_of_digits(num);
	    }
	    System.out.println(num);
	}
	static int no_of_digits(int n){
	    int sum=0;
	    while(n!=0){
	        sum=sum+n%10;
	        n/=10;
	    }
	    return sum;
	}
}
