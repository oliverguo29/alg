/**
 * @program:MyIdeaTest
 * @description:奇安信笔试题01
 * @author:JasonYu
 * @date:2019-09-09 19-34
 **/
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class qianxin_findFather {
    public static void main(String[] args) {
        //检测输入
//        Scanner sc = new Scanner(System.in);
//        int depth = sc.nextInt();
//        int[] arr = new int[(int)Math.pow(2,depth)-1];
//        for (int i = 0; i < (int)Math.pow(2,depth)-1; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int node1 = sc.nextInt();
//        int node2 = sc.nextInt();
//        测试用例
        int node1 = 12;
        int node2 = 20;
        int[] arr = {9,6,15,2,-1,12,25,-1,-1,-1,-1,-1,-1,20,37};
        System.out.println(findFather(node1,node2,arr));
    }
    public static int findFather(int node1,int node2,int[] arr)
    {
        int result = -1;
        int node1Idx = -1;
        int node2Idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (node1==arr[i])
                node1Idx=i;
            if (node2==arr[i])
                node2Idx=i;
        }
        if(node1Idx==-1||node2Idx==-1)
            return result;
        //求层数
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al1.add(node1);
        al2.add(node2);
        while(node1Idx>0)
        {
            if (node1Idx%2==0)
            {
                node1Idx = (node1Idx-2)/2;
                al1.add(arr[node1Idx]);
            }
            if (node1Idx%2==1)
            {
                node1Idx = (node1Idx-1)/2;
                al1.add(arr[node1Idx]);
            }
        }
        while(node2Idx>0)
        {
            if (node2Idx%2==0)
            {
                node2Idx = (node2Idx-2)/2;
                al2.add(arr[node2Idx]);
            }
            if (node2Idx%2==1)
            {
                node2Idx = (node2Idx-1)/2;
                al2.add(arr[node2Idx]);
            }
        }
        if (al1.size()>=al2.size())
        {
            for (int i = 0; i < al2.size(); i++) {
                int temp = al2.get(i);
                for (int j = 0; j < al1.size(); j++) {
                    if(al1.get(j)==temp)
                    {
                        result = temp;
                        return result;
                    }
                }
            }
        }else
        {
            for (int i = 0; i < al1.size(); i++) {
                int temp = al1.get(i);
                for (int j = 0; j < al2.size(); j++) {
                    if(al2.get(j)==temp)
                    {
                        result = temp;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}


/**
 *
 *
 public  static  Node  ancestor(Node root,Node o1, Node o2){
 if(root==null||root.value==-1){
 return root;
 }
 Node left = ancestor(root.left,o1,o2);
 Node right = ancestor(root.right,o1,o2);

 if(left.value!=-1&&right.value!=-1){
 return  root;
 }



 return left.value!=-1?left:right;
 }
 }
 **/