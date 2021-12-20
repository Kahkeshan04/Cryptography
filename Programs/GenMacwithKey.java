import java.crypto.*;
import java.security.SecureRandom;
import sum.misc.*;

class GenMacwithKey{
	public static void main(String args[]) throws Exception{
		SecureRandom random=new SecureRandom();
		byte[] keyBytes=new byte[20];
		random.nextBytes(keyBytes);
		SecretKeySpec key=new SecretKeySpec(keyBytes,"HMACSHA1");
		System.out.println("Key : "+new BASE64Encoder().encode(key.getEncoded()));
		Mac mac=Mac.getInstance("HMACSHA1");
		mac.init(key);
		mac.update("test".getBytes("UTF8"));
		byte[] result=mac.doFinal();
		System.out.println("Mac : "+new BASE64Encoder().encode(result));
	}
}