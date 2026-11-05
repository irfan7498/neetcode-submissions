class MedianFinder {
    Queue<Integer> max;
    Queue<Integer> min;

    public MedianFinder() {
        max = new PriorityQueue<>((a,b) -> ( b - a ));
        min = new PriorityQueue<>((a,b) -> ( a - b ));        
    }
    
    public void addNum(int num) {
        max.add(num);
        if(
            max.size() - min.size() > 1 || 
            !min.isEmpty() && 
            max.peek() > min.peek() )
         {
            min.add(max.poll());
        }
        if(min.size() - max.size() > 1){
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        double res;
        if(max.size() == min.size()){
            res = (double) (max.peek() + min.peek())/2;
        }
        else if(max.size() > min.size()){
            res = (double) max.peek();
        }
        else{
            res = (double) min.peek();
        }
        return res;
    }
}
