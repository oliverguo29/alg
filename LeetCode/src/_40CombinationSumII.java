import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _40CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length < 1)
            return result;
        helper(candidates,target,result,new ArrayList<Integer>(),0);
        return  result;

    }

    public  void  helper(int[] candidates, int target, List<List<Integer>> result,
                                                List<Integer> current, int start){
            if(target==0){
                result.add(new ArrayList<>(current));   //浅拷贝
                return;
            }
            for(int i=start;i<candidates.length;i++){

                if(target<candidates[i]){
                    break;
                }
                    if(i>start && candidates[i]==candidates[i-1]){  //防止重复
                        continue;
                    }
                    current.add(candidates[i]);
                    helper(candidates,target-candidates[i],result,current,i+1);
                                                                    //i+1也是防止重复
                    current.remove(current.size()-1);         //减去不相关的，也就是加起来不能让targer为0的
                }

    }

}