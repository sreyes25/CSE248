import java.util.HashMap;
import java.util.Map;

public class TrieNode {

	Map<Character, TrieNode> children;
	boolean isEndNode;
	
	public TrieNode() {
		children = new HashMap<>();
		isEndNode = false;
	}

	@Override
	public String toString() {
		return "TrieNode [children=" + children + ", isEndNode=" + isEndNode + "]";
	}
}
