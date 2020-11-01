package study02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> listarray=new ArrayList<>();
        listarray.add("OK");
        listarray.add(0,"No");
        listarray.get(0);
        listarray.remove(1);
        listarray.clear();


        LinkedList<String> listlink=new LinkedList<>();
        listlink.add("ok");
        listlink.add(0,"No");
        listlink.addFirst("yes");
        listlink.getFirst();
        listlink.getLast();


        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"ok");
        hashMap.get(1);
        hashMap.remove(1);

        Queue<String> queue=new LinkedBlockingQueue<>();
        queue.add("OK");
        queue.poll();
        queue.peek();
    }
}
