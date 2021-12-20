class Program2{
	public static void main(String args[]){
		char str[]={'H','e','l','l','o',' ','w','o','r','l','d'};
		char str1[]=new char[11];
		char str2[]=new char[11];
		char str3[]=new char[11];
		int i,len;
		len=str.length;
		for(i=0; i<len; i++){
			str1[i]=(char)(str[i]&127);
			System.out.print(" "+str1[i]);
		}
		System.out.println("\n");
		for(i=0; i<len; i++){
			str2[i]=(char)(str[i]|127);
			System.out.print(" "+str2[i]);
		}
		System.out.println("\n");
		for(i=0; i<len; i++){
			str3[i]=(char)(str[i]^127);
			System.out.print(" "+str3[i]);
		}
		System.out.println("\n");
	}
}