import java.util.*;
import javax.crypto.*;

class DES{
	public static void main(String args[]) throws Exception{
		KeyGenerator KG=KeyGenerator.getInstance("DES");
		SecretKey myDeskey=KG.generateKey();
		Cipher desCipher;
		desCipher=Cipher.getInstance("DES");
		desCipher.init(Cipher.ENCRYPT_MODE, myDeskey);
		System.out.println("Enter Message : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		byte[] text=str.getBytes();
		System.out.println("Text[Byte Format] : "+text);
		System.out.println("Text : "+new String(text));
		byte[] textEncrypted=desCipher.doFinal(text);
		System.out.println("Text Encrypted : "+textEncrypted);
		desCipher.init(Cipher.DECRYPT_MODE, myDeskey);
		byte[] textDecrypted=desCipher.doFinal(textEncrypted);
		System.out.println("Text Decrypted : "+new String(textDecrypted));
	}
}