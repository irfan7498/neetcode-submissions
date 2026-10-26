// 0 -> 1
// 1 -> 0,2,4,3
// 2 -> 3,1
// 3 -> 2,1
// 4 -> 1

// [
//     0[ ,1, , , ],
//     1[1, ,1,1,1],
//     2[ , , , , ],
//     3[ , , , , ],
//     4[ , , , , ]
// ]

class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length == 0) return true;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            map.put(i , new ArrayList<>());
        }

        for(int[] e : edges){
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

    
        boolean res = dfs(map, n-1, n-1,visited);
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        
        
        return !res;
    }
        
        boolean dfs(Map<Integer, ArrayList<Integer>> map, int cur , int prev,boolean[] visited){
            if(visited[cur]){
                return true;
            }

            if(map.get(cur).isEmpty()){
                return false;
            }            
            visited[cur] = true;
            for(int a : map.get(cur)){
                if(a == prev){
                    continue;
                }
                if(dfs(map, a, cur,visited)){
                    return true;
                }
            }
            
            map.put(cur, new ArrayList<>());
            return false;
        }
}

