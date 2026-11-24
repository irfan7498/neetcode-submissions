class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>(); 

        helper(0,0, target, candidates, temp);
        
        return res;    
    }

    public void helper(int i , int sum , int target, int[] arr, List<Integer> idx){
        if(sum == target){
            res.add(new ArrayList<>(idx));
            return ;
        }
        if(i >= arr.length || sum > target){
            return;
        }
        
        for(int j = i ; j < arr.length; j++){
            if(j > i && arr[j] == arr[j-1]) continue;
            idx.add(arr[j]);
            helper( j+1 ,sum + arr[j] , target,arr,idx);
            idx.remove(idx.size() -1);
        }
    }
}
