package Week_10;

import java.util.*;
public class QueueTest {
    public static void main(String[] args) throws InterruptedException
    {
        int time = 10;
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = time; i >= 0; i--)
        {
            queue.add(i);
        }
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove() + " ");
            Thread.sleep(1000);
        }
        System.out.println("Hi~");
    }
}
