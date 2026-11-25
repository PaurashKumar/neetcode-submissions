class Solution {
    private Map<Integer,List<Integer>> adjlist=new HashMap<>();
    public boolean validTree(int n, int[][] edges) {
            adjlist.clear();
            if(n==1){
                return edges.length==0;
            }
            if(edges.length==0){
                return false;
            }
            for(int[] e:edges){
                int n1=e[0];
                int n2=e[1];
                adjlist.putIfAbsent(n1,new ArrayList<>());
                adjlist.putIfAbsent(n2,new ArrayList<>());

                adjlist.get(n1).add(n2);
                adjlist.get(n2).add(n1);
            }

            Set<Integer> visit=new HashSet<>();
            if(!dfs(edges[0][0],-1,visit)){
                return false;
            }
            return visit.size()==n;
    }
    public boolean dfs(int node,int pre,Set<Integer> visit){
        if(visit.contains(node)){
            return false;
        }
        visit.add(node);
        for(int nei:adjlist.get(node)){
            if(nei==pre){
                continue;
            }
            if(!dfs(nei,node,visit)){
                return false;
            }
        }
        return true;
    }
}
