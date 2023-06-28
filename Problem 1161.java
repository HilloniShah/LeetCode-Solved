// 1161. Maximum Level Sum of a Binary Tree


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    int k = 0;
    
    public int maxLevelSum(TreeNode root) {
        
        fillList(root, k);

        //Collections.sort(list);
        int max = Integer.MIN_VALUE, ans = 0;

        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
                ans = i+1;
            }
        }

        return ans;
    }

    public void fillList(TreeNode root, int k){
        if(root == null)
            return;

        if(k==list.size()){
            list.add(root.val);
        }
        else{
            int temp = root.val + list.get(k);
            list.set(k,temp);
        }

        k+=1;

        fillList(root.left, k);
        fillList(root.right, k);

        return;
    }
}