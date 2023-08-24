package GraphQs;

import java.util.*;

import javafx.util.Pair;

public class WordLadder1 {
	static int wordladder(String start,String end,String[]wordlist) {
		int n=wordlist.length;
		Set<String> holder=new HashSet<String>();
		for(int i=0;i<n;i++) {
			holder.add(wordlist[i]);
		}
		holder.remove(start);
		if(!holder.contains(end))return 0;
		Queue<Pair<String,Integer>> q=new LinkedList<>();
		q.add(new Pair<>(start,1));
		while(!q.isEmpty()) {
			Pair<String,Integer> firstpair=q.poll();
			String first=firstpair.getValue0();
			int level=firstpair.getValue1();
			
		for(int c=0;c<start.length();c++) {
			for(char ch='a';ch<='z';ch++) {
				
				char [] temp=first.toCharArray();
				temp[c]=ch;
				String news=new String(temp);
				if(news.equals(end))return level+1;
				if(holder.contains(news)) {
					holder.remove(news);
					q.add(new Pair<>(news,level+1));
				}
			}
		}}
		return 0;
		
		
	}
	public static void main(String[] args) {
		String startWord = "der", targetWord = "dfs";
        String[] wordList = {
            "des",
            "der",
            "dfr",
            "dgt",
            "dfs"
        };
        String startWord2 = "amir", targetWord2 = "ahan";
        String[] wordList2 = {
            "ahan",
            "nike"
            
        };
        String s="hit",e="cog";
        String[] list3={"hot","dot","dog","lot","log"};
        
		System.out.println(wordladder(startWord2,targetWord2,wordList2));
		System.out.println(wordladder(s,e,list3));
		
	}

}
