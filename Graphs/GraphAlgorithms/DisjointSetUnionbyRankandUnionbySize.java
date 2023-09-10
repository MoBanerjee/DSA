package GraphAlgorithms;

import java.util.ArrayList;

public class DisjointSetUnionbyRankandUnionbySize {
	ArrayList<Integer> rank=new ArrayList<>();
	ArrayList<Integer> parent=new ArrayList<>();
	ArrayList<Integer> size=new ArrayList<>();
	DisjointSetUnionbyRankandUnionbySize (int n){
		for(int i=0;i<=n;i++) {
			rank.add(0);
			parent.add(i);
			size.add(1);
		}}
	public int findUPar(int node) {
		if(parent.get(node)==node)return node;
		int temp=findUPar(parent.get(node));
		parent.set(node,temp);
		return temp;
		
	}
	public void unionByRank(int node1,int node2) {
		int ulp1=findUPar(node1);
		int ulp2=findUPar(node2);
		if(ulp1==ulp2)return;
		if(rank.get(ulp1)<rank.get(ulp2)) {
			parent.set(ulp1,ulp2);
			
		}
		else if(rank.get(ulp1)>rank.get(ulp2)) {
			parent.set(ulp2, ulp1);
			
		}
		else {
			parent.set(ulp2, ulp1);
			int t=rank.get(ulp1);
			rank.set(ulp1, t+1);
			
		}
	}
	public void UnionbySize(int n1,int n2) {
		int ulp1=findUPar(n1);
		int ulp2=findUPar(n2);
		if(ulp1==ulp2)return;
		if(size.get(ulp1)<size.get(ulp2)) {
			parent.set(ulp1,ulp2);
			int t=size.get(ulp1);
			int t2=size.get(ulp2);
			size.set(ulp2, t+t2);
			
		}
		else {
			parent.set(ulp2,ulp1);
			int t=size.get(ulp2);
			int t2=size.get(ulp1);
			size.set(ulp1, t+t2);
		}
		
		
	}
	

}

