// 왼 루트 오 
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    
 List<Integer> a = new ArrayList<Integer>();
Stack<TreeNode> stack = new Stack<TreeNode>();
      while(root != null || stack.isEmpty() != true ){ 
          while(root != null){
           stack.add(root);
           root = root.left; 
           // 중위 순위 왼 노드 오 
          }
         root = stack.pop();
         a.add(root.val);
         root = root.right;
      
}
    return a;
}
}