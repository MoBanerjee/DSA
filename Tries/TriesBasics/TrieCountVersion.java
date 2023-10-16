package TrieBasics;

public class TrieCountVersion {
private static NodeCountVersion root;
TrieCountVersion(){
	root=new NodeCountVersion();
}
void insert(String newterm) {
	NodeCountVersion temp=root;
	for(int i=0;i<newterm.length();i++) {
		if(!temp.containsKey(newterm.charAt(i))) {
		
			temp.put(newterm.charAt(i), new NodeCountVersion());
			
		}
		temp=temp.get(newterm.charAt(i));
		temp.inccp();
	}
	temp.incew();
}
int countWordsEqualTo(String findterm) {
	NodeCountVersion temp=root;
	for(int i=0;i<findterm.length();i++) {
		if(temp.containsKey(findterm.charAt(i))) {
			temp=temp.get(findterm.charAt(i));
			
		}
		else {return 0;}
		
		
	}
	return temp.returnEquals();
}
int countWordsStartingWith(String findpre) {
	NodeCountVersion temp=root;
	for(int i=0;i<findpre.length();i++) {
		if(temp.containsKey(findpre.charAt(i))) {
			temp=temp.get(findpre.charAt(i));
			
		}
		else {return 0;}
		
		
	}
	return temp.returnPre();
}
void erase(String deletethis) {
	NodeCountVersion temp=root;
	for(int i=0;i<deletethis.length();i++) {
//		if(temp.containsKey(deletethis.charAt(i))) {
//			temp=temp.get(deletethis.charAt(i));
//			temp.deccp();
//		}
		
		temp=temp.get(deletethis.charAt(i));
		temp.deccp();
	}
temp.decew();
	
}
public static void main(String args[]) {
	  TrieCountVersion T=new TrieCountVersion();
	  T.insert("apple");
	  T.insert("apple");
	  T.insert("apps");
	  T.insert("apps");
	  T.insert("kert");
	  String word1 = "apps";
	  System.out.println("Count Words Equal to "+word1+" "+T.countWordsEqualTo(word1));
	  String word2 = "abc";
	  System.out.println("Count Words Equal to "+word2+" "+T.countWordsEqualTo(word2));
	  String word3 = "ap";
	  System.out.println("Count Words Starting With "+word3+" "+T.countWordsStartingWith
	  (word3));
	  String word4 = "appl";
	  System.out.println("Count Words Starting With "+word4+" "+T.countWordsStartingWith
	  (word4));
	  T.erase(word1);
	  System.out.println("Count Words equal to "+word1+" "+T.countWordsEqualTo(word1));
	  System.out.println("Count Words Starting With "+"ap"+" "+T.countWordsStartingWith
			  ("ap"));
	  T.erase("kert");
	  T.insert("kert");
	}
}
