package GraphAlgorithms;

import javafx.util.Pair;

public class EdgesforKruskal implements Comparable<EdgesforKruskal>{
int from,to,wt;
Pair<Integer,Integer> p;
EdgesforKruskal(int from,int to,int wt){
	this.from=from;
	this.to=to;
	this.wt=wt;
	p=new Pair<>(from,to);
}
public int compareTo(EdgesforKruskal edge2) {
	return this.wt-edge2.wt;
}
}
