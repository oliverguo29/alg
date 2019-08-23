import java.util.ArrayList;
import java.util.List;

class _118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows<=0){
            return result;
        }

        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        result.add(ll);

        for(int i=1;i<numRows;i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j=0;j<ll.size()-1;j++){
                cur.add(ll.get(j)+ll.get(j+1));     //每行头尾为1，其他的为上一行的两两相加
            }
            cur.add(1);
            ll=cur;
            result.add(ll);

        }

        return result;
    }
}