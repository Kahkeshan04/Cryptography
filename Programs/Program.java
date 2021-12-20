class Program{
	public static void main(String args[]){
		char str[]={'H','e','l','l','o',' ','w','o','r','l','d'};
		char str1[]=new char[11];
		int i,len;
		len=str.length;
		for(i=0; i<len; i++){
			str1[i]=(char)(str[i]^0);
			System.out.print(" "+str1[i]);
		}
	}
}