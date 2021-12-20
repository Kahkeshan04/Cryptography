class MyRnd{
	final static long a=16807;
	final static long n=2147483647;
	long x;
	public MyRnd(){
		x=1;
	}
	long next(){
		x=(a*x)%n;
		return (long)x;
	}
	public static void main(String args[]){
		MyRnd r=new MyRnd();
		for(int i=0; i<5; i++)
			System.out.println(r.next());
	}
}