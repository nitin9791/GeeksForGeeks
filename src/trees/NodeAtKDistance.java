package trees;
import java.io.*;
public class NodeAtKDistance {
	public static void printNodesAtKDistance(){
		BuildTree.add();
		try{
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int k = Integer.parseInt(b.readLine());
			printNodes(BuildTree.root,k);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void printNodes(BuildTree node,int level){
		if(node == null){
			return;
		}
		if(level == 1){
			System.out.println(node.data);
		}
		printNodes(node.left,level-1);
		printNodes(node.right,level-1);
	}
}
