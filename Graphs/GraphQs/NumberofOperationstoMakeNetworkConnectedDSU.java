package GraphQs;


import GraphAlgorithms.DisjointSetUnionbyRankandUnionbySize;

public class NumberofOperationstoMakeNetworkConnectedDSU {
public static int connections(int n, int[][] edge) {
	DisjointSetUnionbyRankandUnionbySize dj=new DisjointSetUnionbyRankandUnionbySize(n);
	int extra=0;
	for(int[]arr:edge) {
		int ulp1=dj.findUPar(arr[0]);
		int ulp2=dj.findUPar(arr[1]);
		if(ulp1==ulp2)extra++;
		else
		dj.UnionbySize(arr[0], arr[1]);
		
	}
	int components=0;
	for(int i=0;i<n;i++) {
		if(dj.parent.get(i)==i)components++;
	}
	if(extra>=components-1)return components-1;
	else return -1;
	
}
public static void main (String[] args) {
    int V = 9;
    int[][] edge = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {2, 3}, {4, 5}, {5, 6}, {7, 8}};

    
    int ans = connections(V, edge);
    System.out.println("The number of operations needed: " + ans);

}

}
