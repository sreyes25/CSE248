
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieNode root = new TrieNode();
		root.children.put('c', new TrieNode());
		root.children.put('a', new TrieNode());
		root.children.get('c').children.put('a', new TrieNode());
		root.children.get('c').children.get('a').isEndNode=true;
	}

}
