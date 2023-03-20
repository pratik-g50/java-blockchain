package blockchain;
import java.security.MessageDigest; //acces SHA256

public class StringUtility {
	
	public static String shaAlgorithm(String input) {
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			
			StringBuffer hexString = new StringBuffer();
			
			for(int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				
				
				hexString.append(hex);
			}
		
		return hexString.toString();		
		}
		
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	
	}
	
}
