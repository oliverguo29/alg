import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Guidewire {
    public static  String solution(String ss){
        String[] arr = ss.split("\n");

        Map<String, Integer> map = new HashMap<>();
        map.put("music",0);
        map.put("images",0);
        map.put("movies",0);
        map.put("others",0);
        for(String info:arr){
            String[] s = info.split(" ");
            if(s[0].endsWith(".mp3")){
                Integer num = map.get("music");
                char[] size = s[1].toCharArray();
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<size.length;i++){
                    if(Character.isDigit(size[i])){
                        sb.append(size[i]);
                    }
                }
                num+=Integer.valueOf(sb.toString());
                map.put("music",num);
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        StringBuilder sss= new StringBuilder();
        for(Map.Entry ee:entries){
            sss.append(ee.getKey()+" "+ee.getValue()+"b"+"\n");
        }


        return sss.toString();
    }

    public static void main(String[] args) {
        String sss = "my.song.mp3 11b\nmy.song.mp3 21b\nmy.song.mp3 31b";
        String solution = solution(sss);
        System.out.println(solution);
    }
}
