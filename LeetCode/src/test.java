public class test {

    public static void main(String[] args) {

        String [] logs = new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};


        _937ReorderLogFiles s = new _937ReorderLogFiles();
        String[] strings = s.reorderLogFiles(logs);
        for(String ss:strings){
            System.out.println(ss);
        }

        String s1="g1";
        String s2="a8";

        //System.out.println(s1.compareTo(s2)+"***");


//        for(int [] point:merge){
//            System.out.println(point[0]+"***"+point[1]);
//        }

        //System.out.println(iii);





    }
}
