import java.util.*;


class _39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        helper(candidates,target,result, new ArrayList<>(),0);
        return result;


    }

    public void  helper(int[] candidates, int target, List<List<Integer>> res, List<Integer> current, int start){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target) {
                break;
            }
                current.add(candidates[i]);
                helper(candidates, target - candidates[i], res, current, i);
                current.remove(current.size()-1);   //如果加起来不能让target 为0，删除
            }
        }




    }
