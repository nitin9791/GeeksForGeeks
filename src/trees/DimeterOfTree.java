package trees;

public class DimeterOfTree {
	public static void findDiameter(){
		BuildTree.add();
		TreeHeight h = new TreeHeight(); 
		System.out.println(findDiameterUtil(BuildTree.root,h));
	}
	public static int findDiameterUtil(BuildTree node,TreeHeight h){
		if(node == null){
			h.h=0;
			return 0;
		}
		if(node.left == null && node.right == null){
			h.h=1;
			return 1;
		}
		TreeHeight leftTree=new TreeHeight(),rightTree=new TreeHeight();
		int leftDiameter = findDiameterUtil(node.left,leftTree);
		int rightDiameter = findDiameterUtil(node.right,rightTree);
		h.h = Math.max(leftTree.h, rightTree.h) + 1;
		int heightsum = 0;
		if(leftTree.h > 0 && rightTree.h > 0){
			heightsum = leftTree.h+rightTree.h+1;
		}
		return Math.max(heightsum,Math.max(leftDiameter, rightDiameter) );
	}
	
}
class TreeHeight{
	int h=0;
}
