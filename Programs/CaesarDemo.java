class CaesarCipher{
	public final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	public String encrypt(String plainText, int shiftKey){
		plainText = plainText.toLowerCase();
		String cipherText = "";
		for(int i=0; i<plainText.length(); i++){
			int charPosition = ALPHABET.indexOf(plainText.charAt(i));
			int keyVal = (charPosition+shiftKey)%26;
			char replaceVal = this.ALPHABET.charAt(keyVal);
			cipherText += replaceVal;
		}
		return cipherText;
	}
	public String decrypt(String cipherText,int shiftKey){
		String plainText = "";
		for(int i=0; i<cipherText.length(); i++){
			int charPosition = this.ALPHABET.indexOf(cipherText.charAt(i));
			int keyVal = (charPosition-shiftKey)%26;
			if(keyVal<0){
				keyVal = (this.ALPHABET.length()+keyVal)%26;
			}
			char replaceVal = this.ALPHABET.charAt(keyVal);
			plainText += replaceVal;
		}
		return plainText;
	}
}

class CaesarDemo{
	public static void main(String args[]){
		String plainText = "meetmeattogaparty";
		int shiftKey = 3;
		CaesarCipher cc = new CaesarCipher();
		String cipherText = cc.encrypt(plainText,shiftKey);
		System.out.println("Your plainText : "+plainText);
		System.out.println("Your cipherText : "+cipherText);
		String cPlainText = cc.decrypt(cipherText,shiftKey);
		System.out.println("Your cplainText : "+cPlainText);
	}
}