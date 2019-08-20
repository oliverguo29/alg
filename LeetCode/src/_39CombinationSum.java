import java.util.*;


class _39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result=helper(candidates,target,0);
        return result;


    }

    public List<List<Integer>>  helper(int[] candidates, int target,int start){
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=start;i<candidates.length;i++){

            if(target==candidates[i]){
                List<Integer> al = new ArrayList<>();
                al.add(candidates[i]);
                ll.add(al);
                return ll;

            }else if(candidates[i]<target){
                //System.out.println(candidates[i]);
                List<List<Integer>> lll = helper(candidates, target-candidates[i],i);
                for(int j=0;j<lll.size();j++){
                    List<Integer> list = lll.get(j);
                    list.add(0,candidates[i]);
                    ll.add(list);
                }



            }else{
                break;
            }

        }

        return ll;
    }
}