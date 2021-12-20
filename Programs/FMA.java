class FMA{
	public static void main(String args[]){
		int c=0, d=1;
		int a=7, m=560, n=561, temp;
		int b[]=new int[10];
		temp=m;
		for(int k=0; k<10; k++){
			b[k]=m%2;
			m=m/2;
		}
		for(int k=9; k>=0; k--){
			c=2*c;
			d=(d*d)%n;
			if(b[k]==1){
				c=c+1;
				d=(d*a)%n;
			}
		}
		System.out.println(a+" power "+temp+" mod "+n+" = "+d);
	}
}