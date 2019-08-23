import java.util.ArrayList;
import java.util.List;

class _119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> res= new ArrayList<>();

        if(rowIndex<0){
            return res;
        }


        res.add(1);

        for(int i=1;i<=rowIndex;i++){
           List<Integer> cur=new ArrayList<>();
           cur.add(1);
           for(int j=0;j<res.size()-1;j++){
               cur.add(res.get(j)+res.get(j+1));
           }
           cur.add(1);
           res=cur;

        }

        return res;
    }
}