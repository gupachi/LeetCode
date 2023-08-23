
  
  public class TreeNode {
     int val;
      TreeNode left;
     TreeNode right;
       TreeNode() {}
        TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public boolean checkTree(TreeNode root) {
        int value = root.val;
        value -= root.left.val;
        value -= root.right.val;
        
        if(value == 0){
            return true;
        }
        else{ return false;}
        
    }
}