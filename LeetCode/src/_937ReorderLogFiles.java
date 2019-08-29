import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class _937ReorderLogFiles {
    /**
     *
     * 第二个单词是以字母开头的 还是数字开头的
     * 字母开头的全部放在前边，按照a-z的顺序
     * 数字开头的按照原有的顺序
     *
     */
    public String[] reorderLogFiles(String[] logs) {
        String [] res = new String[logs.length];

        List<String[]> ll =new ArrayList<>();
        List<String[]> num =new ArrayList<>();


        //将logs中的字母开头的都取出来,放入ll
        Pattern p1 = Pattern.compile("[a-z]");
        Pattern p2 = Pattern.compile("[0-9]");
        for(int i=0;i<logs.length;i++){
            String[] part = logs[i].split(" ");         //a1 9 2 3 1

            Matcher matcher1 = p1.matcher(part[1].charAt(0)+"");
            Matcher matcher2 = p2.matcher(part[1].charAt(0)+"");
            if (matcher1.matches()) {
                ll.add(part);
            }else if(matcher2.matches()){
                num.add(part);
            }
        }


        //排序*
        ll.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(!o1[1].equals(o2[1])){
                    return o1[1].compareTo(o2[1]);
                }else {
                    int length=o1.length<o2.length?o1.length:o2.length;
                    for(int i=1;i<length;i++){
                        if(!o1[i].equals(o2[i])){
                            return o1[i].compareTo(o2[i]);
                        }
                    }

                    return o1[0].compareTo(o2[0]);
                }

            }
        });

        //放入res
        int i=0;
        arrToStr(ll,res,i);

        //将数字开头的也放进res
        i=ll.size();
        arrToStr(num,res,i);

        return  res;
    }

    public void arrToStr( List<String[]> ll, String [] res,int i){
        for(String[] part:ll){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<part.length;j++){
                if(j<part.length-1) {
                    sb.append(part[j]+" ");
                }else {
                    sb.append(part[j]);
                }
            }
            String ss = sb.toString();
            res[i++]=ss;

        }

    }
}