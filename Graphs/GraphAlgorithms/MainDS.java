package GraphAlgorithms;

public class MainDS {
	
	    public static void main (String[] args) {
	    	DisjointSetUnionbyRankandUnionbySize ds = new DisjointSetUnionbyRankandUnionbySize(7);
	        ds.unionByRank(1, 2);
	        
	        ds.unionByRank(2, 3);
	        ds.unionByRank(4, 5);
	        ds.unionByRank(6, 7);
	        ds.unionByRank(5, 6);

	        // if 3 and 7 same or not
	        if (ds.findUPar(3) == ds.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");

	        ds.unionByRank(3, 7);
	        if (ds.findUPar(3) == ds.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");
	        DisjointSetUnionbyRankandUnionbySize dstest = new DisjointSetUnionbyRankandUnionbySize(7);
	        dstest.unionByRank(1, 2);
	        System.out.println(dstest.rank);
	        System.out.println(dstest.parent);
	        dstest.unionByRank(3, 4);
	        System.out.println(dstest.rank);
	        System.out.println(dstest.parent);
	        dstest.unionByRank(2, 3);
	        System.out.println(dstest.rank);
	        System.out.println(dstest.parent);
	        if (dstest.findUPar(3) == dstest.findUPar(4)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");
	        System.out.println(dstest.rank);
	        System.out.println(dstest.parent);
	        DisjointSetUnionbyRankandUnionbySize dssize = new DisjointSetUnionbyRankandUnionbySize(7);
	        dssize.UnionbySize(1, 2);
	        
	        dssize.UnionbySize(2, 3);
	        dssize.UnionbySize(4, 5);
	        dssize.UnionbySize(6, 7);
	        dssize.UnionbySize(5, 6);

	        // if 3 and 7 same or not
	        if (dssize.findUPar(3) == dssize.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");

	        dssize.unionByRank(3, 7);
	        if (dssize.findUPar(3) == dssize.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");
	    
	    
	    }
	    
	    
	    
	    
	}

