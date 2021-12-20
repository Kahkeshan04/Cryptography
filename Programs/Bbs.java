import java.util.*;

class Bbs{
	static long x;
	static long n;
	public Bbs(long sd, long p1, long q1){
		n=p1*q1;
		x=(sd+sd)%n;
	}
	int next(){
		x=(x*x)%n;
		int  b=(int)x%2;
		return b;
	}
	public static void main(String args[]){
		long p,q;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter p,q any two prime numbers : ");
			p=sc.nextLong();
			q=sc.nextLong();
			long r1=p%4;
			long r2=q%4;
			if((r1==3)&&(r2==3)){
				flag=true;
				break;
			}
			else 
				continue;
		}
		if(flag==true){
			System.out.println("Enter seed value 's' such that relatively prime to n=p*q ");
			long s=sc.nextLong();
			Bbs b=new Bbs(s,p,q);
			for(int i=0; i<5; i++){
				System.out.print(b.next());
				if(i==3)
					break;
			}
		}
	}
}