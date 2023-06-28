// 199. Binary Tree Right Side View



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

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return list;
        
        fillList(root, k);

        return list;

        
    }

    public void fillList(TreeNode root, int k){
        if(root == null)
            return;

        if(k == list.size()){
            list.add(root.val);
        }

        k+=1;
        fillList(root.right, k);
        fillList(root.left, k);

        return;
    }
}