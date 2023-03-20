package blockchain;
import java.util.ArrayList;
import com.google.gson.*;

public class BlockChain {
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	
	public static void main(String[] args) {
		blockchain.add(new Block("Added 1st block", "0"));
		blockchain.add(new Block("Added 2nd block", blockchain.get(blockchain.size()-1).hash));
		blockchain.add(new Block("Added 3nd block", blockchain.get(blockchain.size()-1).hash));
		
		
		String json = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(json);
	}
	
	public static void BlockHashTest() {
		
		Block testBlock1 = new Block("Added 1st block", "0");
		System.out.println("Frist test Block : "+testBlock1.hash);
		Block testBlock2 = new Block("Added 2st block", "1");
		System.out.println("Frist test Block : "+testBlock2.hash);
		Block testBlock3 = new Block("Added 3st block", "2");
		System.out.println("Frist test Block : "+testBlock3.hash);
	}
}


//source
//https://github.com/Will-Gale/Blockchain-Using-Java