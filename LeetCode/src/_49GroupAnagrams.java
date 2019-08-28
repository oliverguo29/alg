import java.util.*;

class _49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length==0){
            return  res;
        }

        Map<String,List<String>> tmp = new HashMap<>();


        String sorted=new String();

        for(String s:strs){
            char[] sc = s.toCharArray();    //将String转换成字符
            Arrays.sort(sc);                //将sc中的字符排序
            sorted=new String(sc);          //作为key
            if(!tmp.containsKey(sorted)){   //判断是否存在key
                List<String> ll = new ArrayList<>();
                ll.add(s);
                tmp.put(sorted,ll);
            }else{
                List<String> ll = tmp.get(sorted);
                ll.add(s);
            }



        }

        for (Map.Entry<String, List<String>> entry : tmp.entrySet()) {  //遍历map得到其中的value
            res.add(entry.getValue());
        }



        return res;

    }
}