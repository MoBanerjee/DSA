package TrieBasics;

public class NodeCountVersion {
	NodeCountVersion nodes[]=new NodeCountVersion[26];
	int ew=0;
	int cp=0;
	int returnEquals() {
		return ew;
	}
	int returnPre() {
		return cp;
	}
	void incew() {
		ew++;
	}
	void decew() {
		ew--;
	}
	void inccp() {
		cp++;
	}
	void deccp() {
		cp--;
	}
	boolean containsKey(char ch) {
		return (nodes[ch-'a']!=null);
		
		
	}
	NodeCountVersion get(char ch) {
		return nodes[ch-'a'];
	}
	void put(char ch, NodeCountVersion newnode) {
		nodes[ch-'a']=newnode;
	}
}
