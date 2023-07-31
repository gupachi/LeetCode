class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {   
 List<List<Integer>> a = new ArrayList<>();

 if(root == null){return a;}
 Queue<TreeNode> queue = new LinkedList<>();
 queue.add(root);
while(!queue.isEmpty()){
  int size=queue.size();
  
List<Integer> currentVal = new ArrayList<>();
for(int i=0;i<size;i++){
        
        TreeNode current = queue.remove();
        currentVal.add(current.val);
        if(current.left != null){
            queue.add(current.left);
        }
         if(current.right != null){
            queue.add(current.right);
        }
    }
    a.add(currentVal);
 }
    return a;
    }
}
