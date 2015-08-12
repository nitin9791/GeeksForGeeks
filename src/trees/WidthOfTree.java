package trees;

public class WidthOfTree {
	public static void MaxiumWidht(){
		BuildTree.add();
		int height = MaxheightOfTree.height(BuildTree.root),maxWidth=0;
		for(int i=1;i<=height;i++){
			int width = getWidth(BuildTree.root,i);
			if(maxWidth < width)
				maxWidth = width;
		}
		System.out.println(maxWidth);
	}
	public static int getWidth(BuildTree node,int level){
		if(node == null){
			return 0; 
		}
		else if(level == 1){
			return 1;
		}
		return getWidth(node.left,level-1)+getWidth(node.right,level-1);
	}
}
