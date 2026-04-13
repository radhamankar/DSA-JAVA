package trees;
import java.util.*;
class Solution {
    void helper(List<Integer> res,TreeNode root){
        if(root==null){
            return;
        }
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> res=new ArrayList<>();
           helper(res,root);
           return res;
    }
}
