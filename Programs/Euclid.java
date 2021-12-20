import java.util.*;

class Euclid{
	public static void gcd(int A, int B){
		int a1=A, b1=B;
		int r;
		while(B>0){
			r=A%B;
			A=B;
			B=r;
		}
		System.out.println("gcd("+a1+", "+b1+") = "+A);
	}
	public static void main(String args[]){
		int a,b;
		System.out.println("Enter two integers : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		gcd(a,b);
	}
}