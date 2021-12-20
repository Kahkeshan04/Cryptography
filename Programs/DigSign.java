import java.security.*;
import sun.misc.BASE64Encoder;

class DigSign{
	public static void main(String args[])throws Exception{
		KeyPairGenerator kpg=KeyPairGenerator.getInstance("RSA");
		kpg.initialize(1024);
		KeyPair kp=kpg.genKeyPair();
		byte[] data="Sample Text".getBytes("UTF8");
		Signature sig=Signature.getInstance("MD5WithRSA");
		sig.initSign(kp.getPrivate());
		sig.update(data);
		byte[] signatureBytes=sig.sign();
		System.out.println("Signature : \n"+Base64.getEncoder().encode(signatureBytes));
		sig.initVerify(kp.getPublic());
		sig.update(data);
		System.out.println(sig.verify(signatureBytes));
	}
}