package TrieBasics;

class NodeBasicTemplate {
NodeBasicTemplate nodes[]=new NodeBasicTemplate[26];
boolean flag=false;
void setEnd() {
	flag=true;
}
boolean isEnd() {
	return flag;
}
boolean containsKey(char ch) {
	return (nodes[ch-'a']!=null);
	
	
}
NodeBasicTemplate get(char ch) {
	return nodes[ch-'a'];
}
void put(char ch, NodeBasicTemplate newnode) {
	nodes[ch-'a']=newnode;
}
}
