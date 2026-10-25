
//   0 1 2 3
// 0[ ,1, , ]
// 1[1, , , ]
// 2[ ,1, , ]
// 3[ ,1, , ]
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //adjacency List

        Map<Integer, ArrayList<Integer>> preMap = new HashMap<>();
        boolean[] visited = new boolean[numCourses];

        for(int i = 0 ; i < numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }

        for(int[] pre: prerequisites){
            preMap.get(pre[0]).add(pre[1]);
        }

        for(int[] pre: prerequisites){
            if(dfs(preMap, pre[0] , visited)){
                return false;
            }
        }

        return true;
    }

    boolean dfs(Map<Integer, ArrayList<Integer>> map , int pre, boolean[] visited){
        if(visited[pre]){
            return true;
        }
        if(map.get(pre).isEmpty()){
            return false;
        }
        visited[pre] = true;
        for(int p : map.get(pre)){
            if(dfs(map, p , visited)){
                return true;
            }
        }
        visited[pre] = false;

        map.put(pre, new ArrayList<>());
        return false;
    }
}
