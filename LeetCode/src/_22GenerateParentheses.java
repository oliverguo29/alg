import java.util.ArrayList;
import java.util.List;

class _22GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n,n,"",res);
        return res;


    }

    public static void helper(int left,int right,String path,List<String> ll){
        if(left==0&&right==0){
            ll.add(path);
            return;
        }

        if(left!=0){
            helper(left-1,right,path+"(",ll);
        }

        if(right!=0&&right>left){
            helper(left,right-1,path+")",ll);
        }
    }
}