import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> max = new PriorityQueue(Comparator.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue();
    public MedianFinder() {

    }
    public void addNum(int num) {
        min.offer(num);
        max.offer(min.poll());
        if(min.size() < max.size()){
            min.offer(max.poll());
        }
    }
    public double findMedian() {
        if(min.size() == max.size()){
            return (min.peek() + max.peek()) / 2.0;
        } else {
            return min.peek();
        }
    }
}
