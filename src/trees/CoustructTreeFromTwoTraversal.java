package trees;

public class CoustructTreeFromTwoTraversal {
	static int preInd, postInd,len;
	public static void ConstructTree(){
		int inorder[] = {8,4,10,2,6,28,14};
		int postorder[] = {8,10,4,28,14,6,2};
		int preorder[] = {2,4,8,10,6,14,28};
		int n = inorder.length;
		preInd=0;
		postInd=n-1;
		len = n;
		BuildTree.root = BuildTreeinPre(inorder,preorder,0,n-1);
//		BuildTree.inorder(BuildTree.root);
		BuildTree.preorder(BuildTree.root);
	}
	public static BuildTree BuildTreeinPre(int inorder[],int preorder[],int start,int end){
		if(preInd > len || start > end)
			return null;
		
		
		BuildTree node = new BuildTree(preorder[preInd++]);
		
		int loc = getLocation(inorder,start,end,node.data);
		if(loc != -1){
			node.left = BuildTreeinPre(inorder,preorder,start,loc-1);
			node.right = BuildTreeinPre(inorder,preorder,loc+1,end);
		}
		return node;
	}
	public static int getLocation(int in[],int start,int end,int data){
		for(int i=start;i<=end;i++){
			if(in[i] == data){
				return i;
			}
		}
		return -1;
	}
}