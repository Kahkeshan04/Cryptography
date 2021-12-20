import java.util.*;

class HillCipher{
	public static int[][] inverseMatrix(int a[][]){
		int s = a.length;
		int ainverse[][] = new int[s][s];
		int c=(a[0][0]*a[1][1]-a[0][1]*a[1][0])%26;
		if(c!=0){
			ainverse[0][0] = a[1][1]/c;
			ainverse[0][1] = -a[0][1]/c;
			ainverse[1][0] = -a[1][0]/c;
			ainverse[1][1] = a[0][0]/c;
		}
		return ainverse;
	}
	public static int[][] multiply(int k[][], int m[][]){
		int c[][] = new int[m.length][m[0].length];
		for(int i=0; i<2; i++)
		for(int j=0; j<1; j++){
			c[i][j]=0;
			for(int x=0; x<2; x++){
				c[i][j]=(c[i][j]+(k[i][x]*m[x][j])%26)%26;
				if(c[i][j]<0)
					c[i][j] = 26+c[i][j];
			}
		}
		return c;
	}
	public static void main(String args[]){
		int l=0,i,j;
		int msg[][] = new int[2][1];
		int key[][] = new int[2][2];
		int ct[][] = new int[2][1];
		int keyinv[][] = new int[2][2];
		int enmsg[][] = new int[2][1];
		
		String cipher = "";
		String decipher = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2*2 martix key(0-28) it is non-singular(i.e.,)inverse exits");
		
		for(i=0; i<2; i++)
		for(j=0; j<2; j++){
			key[i][j] = sc.nextInt();
		}
		
		System.out.println("Enter a message for encrypting having even number of char ");
		String str = sc.next();
		xy:
		while((l<str.length())){
			for(i=0; i<2; i++)
			for(j=0; j<1; j++){
				msg[i][j] = alphabet.indexOf(str.charAt(l));
				l++;
			}
			ct = multiply(key,msg);
			
			for(i=0; i<2; i++)
			for(j=0; j<1; j++)
				cipher = cipher+alphabet.charAt(ct[i][j]);
			continue xy;
		}
		System.out.println("Encrypted text : "+cipher);
		l=0;
		xz:
		while(l<cipher.length()){
			for(i=0; i<2; i++)
			for(j=0; j<1; j++){
				msg[i][j] = alphabet.indexOf(cipher.charAt(l));
				l++;
			}
			keyinv = inverseMatrix(key);
			enmsg = multiply(keyinv,msg);
			
			for(i=0; i<2; i++)
			for(j=0; j<1; j++)
				decipher = decipher+alphabet.charAt(enmsg[i][j]);
			continue xz;
		}
		System.out.println("Decrypted text : "+decipher);
	}
}