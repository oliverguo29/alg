import java.util.*;

class _692TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        List<String> list = new ArrayList<>();

       PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue()==o2.getValue()?o1.getKey().compareTo(o2.getKey()):o1.getValue()-o2.getValue();
           }
       });

        for(String word:words){
            if(!map.containsKey(word)){
                map.put(word,1);
            }else {
                int value = map.get(word);
                map.put(word,value+1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry:entries){
            pq.add(entry);
        }

        for(int i=0;i<k;i++){
            Map.Entry<String, Integer> poll = pq.poll();
            list.add( poll.getKey());
        }

        return  list;
    }
}