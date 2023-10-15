package TrieBasics;

public class TrieInsertSearchStartswith {
	private static NodeBasicTemplate rootnode;
	TrieInsertSearchStartswith(){
		rootnode=new NodeBasicTemplate();
	}
	public static void Insert(String newword) {
		NodeBasicTemplate n=rootnode;
		
		for(int i=0;i<newword.length();i++) {
			
			if(!n.containsKey(newword.charAt(i))){
			
				n.put(newword.charAt(i), new NodeBasicTemplate());
			}
			
			n=n.get(newword.charAt(i));
		}
		n.setEnd();
	}
	
	public static boolean Search(String findword) {
		NodeBasicTemplate n=rootnode;
		
		for(int i=0;i<findword.length();i++) {
			if(!n.containsKey(findword.charAt(i))){
				return false;
			}
			n=n.get(findword.charAt(i));
		}
		if(n.isEnd())return true;
		return false;
	}
	public static boolean Startswith(String prefix) {
		NodeBasicTemplate n=rootnode;
		for(int i=0;i<prefix.length();i++) {
			if(!n.containsKey(prefix.charAt(i))){
				return false;
			}
			n=n.get(prefix.charAt(i));
		}
		return true;
	}
	 public static void main(String args[])
	 {
	 	int n = 5;
	 	int type[] = {1, 1, 2, 3, 2};
	 	String value[] = {"hello", "help", "help", "hel", "hel"};
	 	TrieInsertSearchStartswith trie=new TrieInsertSearchStartswith();
	 	for (int i = 0; i < n; i++) {
	 		if (type[i] == 1) {
	 			trie.Insert(value[i]);
	 		}
	 		else if (type[i] == 2) {
	 			if (trie.Search(value[i])) {
	 				System.out.println( "true" );
	 			}
	 			else {
	 				System.out.println("false");
	 			}
	 		}
	 		else {
	 			if (trie.Startswith(value[i])) {
	 				System.out.println("true" );
	 			}
	 			else {
	 				System.out.println("false");
	 			}
	 		}
	 	}
	 }
}
