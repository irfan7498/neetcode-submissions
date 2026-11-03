class MedianFinder {
    ArrayList<Integer> arr;
    public MedianFinder() {
        arr = new ArrayList<>();
    }
    
    public void addNum(int num) {
        arr.add(num);
        arr.sort(null);
    }
    
    public double findMedian() {
        int idx = arr.size()/2;
        int sz = arr.size();
        double res;
        if(sz % 2 == 0)
        {
            double a = arr.get(idx-1);
            double b = arr.get(idx);
            
            res = (a + b) / 2;
            
        }else{
            res = arr.get(idx);
        }
        return res;
    }
}
