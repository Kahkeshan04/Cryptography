import java.util.Scanner;
class String1{
	public static void main(String args[]){
		String alph = "abcdefghijklmnopqrstuvwxyz";
		String key = "chubnysagtxjoplvezfmidkrqw";
		String text = "welcome";
		System.out.println("Your PlainText : "+text);
		System.out.print("Your CipherText : ");
		for(int i=0; i<text.length(); i++){
			char c = text.charAt(i);
			int pos = alph.indexOf(c);
			char ch = key.charAt(pos);
			System.out.print(ch);
		}
	}
}