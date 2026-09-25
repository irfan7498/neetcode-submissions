class KthLargest {
    int k ;
    ArrayList<Integer> arr = new ArrayList<>(); 
    public KthLargest(int k, int[] nums) {
        this.k = k ;
        for(int num: nums){
            arr.add(num);
        }
        arr.sort(Comparator.naturalOrder());
    }
    
    public int add(int val) {
        arr.add(val);
        arr.sort(Comparator.naturalOrder());
        int idx = arr.size() - this.k ;
        return arr.get(idx);
    }
}
