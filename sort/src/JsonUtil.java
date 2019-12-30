import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

public class JsonUtil {
    public static void main(String[] args) throws IOException, JSONException {
        String V2Path="/Users/oliver/Desktop/V2.json";
        String V3Path="/Users/oliver/Desktop/V3.json";


        JSONObject musicV2 = readQQsearch(V2Path);
        JSONObject musicV3 = readQQsearch(V3Path);


        Iterator V3keys = musicV3.keys();
        Iterator V2keys = musicV2.keys();

        List <String>compare = Compare(V2keys, V3keys);
        if(compare!=null){
            for(String s:compare){
                System.out.println("not contain: "+s);
            }
        }else {
            System.out.println("pass");
        }

    }

    public static List  Compare( Iterator V2keys, Iterator V3keys){
        Set<String> set_V3 = new HashSet<>(); //v3多，包含v2

        while (V3keys.hasNext()){
            set_V3.add((String) V3keys.next());
        }

        List<String> notContains= new ArrayList<>();

        while (V2keys.hasNext()){
            String tmp=(String) V2keys.next();
           if(!set_V3.contains(tmp)){
               notContains.add(tmp);
           }
        }

       return notContains;
    }

    
    public static JSONObject readQQsearch(String path) throws JSONException, IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br  = null;
        try {
            br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;


        while ((line=br.readLine())!=null){
            sb.append(line);
        }

        String jsonStr = sb.toString();
        JSONObject object= new JSONObject(jsonStr);
        JSONObject data = object.getJSONObject("data");
        JSONArray list = data.getJSONArray("list");
        JSONObject music = list.getJSONObject(0);
        
        
        return music;
    }
}
