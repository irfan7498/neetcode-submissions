class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] arr = new List[nums.length+1];
        int[] res = new int[k];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = new ArrayList<>();
        }

        for (int i : nums){
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        
        count.forEach((key, value) -> {
            arr[value].add(key);
        });

        int j = 0;
        for(int i = arr.length-1; i >=0 ; i--){
            if (arr[i].isEmpty()){
                continue;
            }
            for(int n : arr[i]){
                if( j < k ){
                    res[j] = n;
                    j++; 
                }
                else{
                    break;
                }
                }        
        }
        return res;
}
}
