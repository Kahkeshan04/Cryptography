import java.util.*;
import java.math.*;

class DiffieHellman{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Xa & Xb : ");
		int XaValue=sc.nextInt();
		int XbValue=sc.nextInt();
		System.out.println("Enter a prime no.q : ");
		int qValue=sc.nextInt();
		System.out.println("Enter primitive root alpha such that alpha < q : ");
		int alphaValue=sc.nextInt();
		BigInteger xa=new BigInteger(Integer.toString(XaValue));
		BigInteger xb=new BigInteger(Integer.toString(XbValue));
		BigInteger q=new BigInteger(Integer.toString(qValue));
		BigInteger alpha=new BigInteger(Integer.toString(alphaValue));
		BigInteger ya=alpha.modPow(xa,q);
		System.out.println("ya : "+ya);
		BigInteger yb=alpha.modPow(xb,q);
		System.out.println("yb : "+yb);
		BigInteger ka=yb.modPow(xa,q);
		System.out.println("ka : "+ka);
		BigInteger kb=ya.modPow(xb,q);
		System.out.println("kb : "+kb);
		if(ka.compareTo(kb)==0)
			System.out.println("Transaction Successfull");
		else 
			System.out.println("Transaction Failed");
	}
}