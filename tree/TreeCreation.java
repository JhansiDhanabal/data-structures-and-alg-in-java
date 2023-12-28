package tree;
import java.util.*;

public class TreeCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode root = new treenode("drinks");
		treenode level1 = new treenode("tea");
		treenode level2 = new treenode("cuppochino");
		treenode level11 = new treenode("cofee");
		treenode level12 = new treenode("juice");
		root.addchild(level1);
		root.addchild(level11);
		root.addchild(level12);
		level1.addchild(level2);
		System.out.println(root.print(0));
	}

}
class treenode{
	String data;
	ArrayList<treenode>children;
	treenode(String val){
		this.data = val;
		children = new ArrayList<>();
	}
	public void addchild(treenode child) {
		this.children.add(child);
	}
	public String print(int level) {
		String str;
		str = " ".repeat(level)+(level+1)+" : "+data+"\n";
		for(treenode child:children) {
			str += child.print(level+1);
		}
		return str;
	}
}
