package trees;

public class LevelOrderTraversal {
	public static void levelOrder(){
		BuildTree.add();
		int height = MaxheightOfTree.height(BuildTree.root);
		for(int i=1;i<=height;i++){
			printLevelOrder(BuildTree.root,i,true);
		}
	}
	public static void printLevelOrder(BuildTree node,int level,boolean ltr){
		if(node == null)
			return;
		if(level == 1){
				System.out.print(node.data+"->");
			return;
		}
		else if(level > 1){
			if(ltr){
				printLevelOrder(node.left,level-1,ltr);
				printLevelOrder(node.right,level-1,ltr);
			}
			else{
				printLevelOrder(node.right,level-1,ltr);
				printLevelOrder(node.left,level-1,ltr);
			}
		}
	}
	public static void levelOrderInSpiralForm(){
		BuildTree.add();
		int height = MaxheightOfTree.height(BuildTree.root);
		boolean ltr=true;
		for(int i=1;i<=height;i++){
			printLevelOrder(BuildTree.root,i,ltr);
			ltr =!ltr;
		}
	}
}
