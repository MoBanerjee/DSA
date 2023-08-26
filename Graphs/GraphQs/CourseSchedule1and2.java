package GraphQs;


import java.util.*;

public class CourseSchedule1and2 {
	public static int[] findSchedule1(int numCourses, List<List<Integer>> prerequisites) {
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		for(int i=0;i<numCourses;i++) {
			adjlist.add(new ArrayList<Integer>());
			
		}
		for(List<Integer>l:prerequisites) {
			adjlist.get(l.get(1)).add(l.get(0));
			
			
		}
		int n=adjlist.size();
		int[] answer=new int[n];

		int[]indegree=new int[n];
		for(int i=0;i<n;i++) {
			for(int it:adjlist.get(i)) {
				indegree[it]++;
				
			}
		}

		Queue<Integer>q=new LinkedList<>();
		for(int h=0;h<indegree.length;h++) {
			if(indegree[h]==0)q.add(h);
			
		}

		int index=0;
		while(!q.isEmpty()) {
			int k=q.poll();
			answer[index++]=k;
			for(int g:adjlist.get(k)) {
				if(--indegree[g]==0)q.add(g);
			}
			
		}
		if(index!=n)return new int[0];
		return answer;
        // Write your code here.
    }
	public static boolean findSchedule2(int num,List<List<Integer>> prerequisites) {
		int[]ans=findSchedule1(num,prerequisites);
		if(ans.length==0)return false;
		return true;
	}
	public static void main(String[] args) {
		List<List<Integer>>schedule=new LinkedList<>();
		List<Integer> firstentry=new LinkedList<>();
		List<Integer> firstentry2=new LinkedList<>();
		firstentry.add(1);
		firstentry.add(0);
//		firstentry2.add(0);
//		firstentry2.add(1);
		schedule.add(firstentry);
//		schedule.add(firstentry2);
		System.out.println(schedule);
		System.out.println(Arrays.toString(findSchedule1(2,schedule)));
		System.out.println(findSchedule2(2,schedule));
		
		
		
	}

}
