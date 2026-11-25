class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> premap=new HashMap<>();
        Set<Integer> visit=new HashSet<>();

        for(int i=0;i<numCourses;i++){
            premap.put(i,new ArrayList<>());
        }
        for(int pair[]:prerequisites){
            premap.get(pair[0]).add(pair[1]);
        }
        
        for(int c=0;c<numCourses;c++){
            if(!dfs(c,premap,visit)){
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int c,HashMap<Integer,List<Integer>> premap,Set<Integer> visit){
        if(visit.contains(c)){
            return false;
        }
        if(premap.get(c).isEmpty()){
            return true;
        }
        visit.add(c);
        for(int p:premap.get(c)){
            if(!dfs(p,premap,visit)){
                return false;
            }
        }
        visit.remove(c);
        premap.put(c,new ArrayList<>());
        return true;

    }
}
