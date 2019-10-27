import java.util.*;

public class Guidewire {

   public static Map<String, Integer> map = new HashMap<>();

    public static  String solution(String ss){
        String[] arr = ss.split("\n");


        map.put("music",0);
        map.put("images",0);
        map.put("movies",0);
        map.put("others",0);
        for(String info:arr){
            String[] s = info.split(" ");
            if(s[0].endsWith(".mp3")||s[0].endsWith(".aac")||s[0].endsWith(".flac")){
                getInfo("music",s);
            }else if((s[0].endsWith(".jpg")||s[0].endsWith(".bmp")||s[0].endsWith(".gif"))){
                getInfo("images",s);
            }else if((s[0].endsWith(".mp4")||s[0].endsWith(".avi")||s[0].endsWith(".mkv"))){
                getInfo("movies",s);
            }else{
                getInfo("others",s);
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        StringBuilder sss= new StringBuilder();
        String [] tmp = new String [4];
        for(Map.Entry ee:entries){
            if(ee.getKey().equals("music")){
                String s=ee.getKey()+" "+ee.getValue();
                tmp[0]=s;
            } else if(ee.getKey().equals("images")){
                String s=ee.getKey()+" "+ee.getValue();
                tmp[1]=s;
            } else if(ee.getKey().equals("movies")){
                String s=ee.getKey()+" "+ee.getValue();
                tmp[2]=s;
            } else{
                String s=ee.getKey()+" "+ee.getValue();
                tmp[3]=s;
            }

        }

        for(String s:tmp){
            sss.append(s+"b"+"\n");
        }


        return sss.toString();
    }

    public  static void getInfo(String category,String [] s){
        Integer num = map.get(category);

        char[] size = s[1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<size.length;i++){
            if(Character.isDigit(size[i])){
                sb.append(size[i]);
            }
        }
        num+=Integer.valueOf(sb.toString());
        map.put(category,num);
    }

    public static void main(String[] args) {
        String ss = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
        String solution = solution(ss);

        System.out.println(solution);
    }

   }

