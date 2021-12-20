import java.security.*;

class DSAKeyGen{
	public static void main(String args[]) throws Exception{
		KeyPairGenerator keyGen=KeyPairGenerator.getInstance("DSA");
		keyGen.initialize(1024);
		KeyPair keypair=keyGen.genKeyPair();
		PrivateKey privatekey=keypair.getPrivate();
		System.out.println(privatekey);
		PublicKey publickey=keypair.getPublic();
		System.out.println(publickey);
	}
}