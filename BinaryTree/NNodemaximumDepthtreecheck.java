package BinaryTree;

public class NNodemaximumDepthtreecheck {
    public int maxDepth(Node root) {
        if (root == null) return 0;
       
        int end =0;
        int level =1;
        leveladd(root,level,end);
        return end;

    }   
    private void leveladd(Node temp,int level,int end) {
    	 if (temp == null) return;

    	 if (temp.children != null){
             for (Node child : temp.children){
                 level= level+1;
                 if(level>end) end = level;
                 leveladd(child,level,end);
             }
         }         
    }
}
