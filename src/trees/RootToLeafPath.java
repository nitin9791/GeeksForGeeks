package trees;

public class RootToLeafPath {
	public static void allPaths(){
		BuildTree.add();
		int height = MaxheightOfTree.height(BuildTree.root);
		int path[] = new int[height];
		findAndPrintAllPaths(BuildTree.root,path,0);
	}
	public static void findAndPrintAllPaths(BuildTree root,int path[],int height){
		if(root == null){
			return;
		}
		else{
			path[height] = root.data;
			findAndPrintAllPaths(root.left,path,height+1);
			findAndPrintAllPaths(root.right,path,height+1);
		}
		if(root.left == null && root.right == null)
		{
			printPaths(path,height+1);
		}
	}
	public static void printPaths(int path[],int height){
		for(int i=0;i<height;i++){
			System.out.print(path[i]+"->");
		}
		System.out.println();
	}
}