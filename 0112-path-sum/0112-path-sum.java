class Solution {
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // root 가 null 
        if(root == null )
        {return false;}
    // targetSum 이 0 이 되도록 하는 값 발견 
        else if(root.left == null && 
        root.right == null && 
        targetSum - root.val == 0 ){
            return true; 
            // root.val 현재 노드 
        } 
// 왼쪽과 오른쪽을 둘 다를 탐색하면서 값을 뺸다. 
        else{
            return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
        }
       
        
    }
}