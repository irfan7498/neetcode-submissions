class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = 0 ;
        boolean[] visited = new boolean[n];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(i , new ArrayList<>());
        }

        for(int[] e : edges){
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                count++;
                dfs(map, i, visited);
            }
        }
        return count;
    }
    void dfs(Map<Integer, ArrayList<Integer>> map, int i , boolean[] visited){
        
        if(visited[i]){
            return; 
        }
        visited[i] = true;
        if(map.get(i).size() == 0){
            return;
        }
        for(int e : map.get(i)){
            dfs(
                map,
                e ,
                visited
            );
        }
        map.put(i, new ArrayList<>());        
    }
}
