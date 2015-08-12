package trees;

public class HeightBalance {
	public static void HeightBalanceTree(){
		BuildTree.add();
		if(isHeightBalance(BuildTree.root,new Height())){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static boolean isHeightBalance(BuildTree node,Height height){
		if(node == null){
			height.height=0;
			return true;
		}
		Height leftHeight = new Height();
		Height rightHeight = new Height();
		boolean leftTree= isHeightBalance(node.left,leftHeight);
		boolean rightTree = isHeightBalance(node.right,rightHeight);
		boolean check = Math.abs(leftHeight.height-rightHeight.height) <= 1;
		height.height = Math.max(leftHeight.height, rightHeight.height) + 1;
		return leftTree && rightTree && check;
	}
}

class Height{
	int height;
}