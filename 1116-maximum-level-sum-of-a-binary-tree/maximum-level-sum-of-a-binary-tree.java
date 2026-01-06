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
    public int maxLevelSum(TreeNode root) {

        if(root==null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int maxSum=Integer.MIN_VALUE, maxLvl =1,currLvl=1;

        while(!q.isEmpty()){
            int lvlSize = q.size(), lvlSum=0;

            for(int i=0;i<lvlSize;i++){
                TreeNode node = q.poll();
                lvlSum += node.val;

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }

            if(lvlSum>maxSum){
                maxSum=lvlSum;
                maxLvl = currLvl;
            }

            currLvl++;
        }

        return maxLvl;
        
    }
}