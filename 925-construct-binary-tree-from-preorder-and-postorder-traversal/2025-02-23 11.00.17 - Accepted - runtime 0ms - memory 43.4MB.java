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
    public TreeNode tree(int[] preorder, int p, int pree, int[] postorder, int poss, int pose){
        if(p> pree || poss> pose) return null;
        TreeNode r= new TreeNode(preorder[p]);
        if(p== pree) return r;
        int leftch= preorder[p+1];
        int leftpo= -1;
        for(int i=poss; i<=pose; i++){
            if(postorder[i]==leftch){
                leftpo=i;
                break;
            }
        }
        int lefts= leftpo-poss+1;
        r.left= tree(preorder, p+1, p+ lefts, postorder, poss, leftpo);
        r.right= tree(preorder, p+lefts+1, pree, postorder, leftpo+1, pose-1);
        return r;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode r= tree(preorder, 0, preorder.length-1, postorder, 0, postorder.length-1);
        return r;
    }
}