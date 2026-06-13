package Menu;

import java.util.ArrayList;

public class TreeNode {

    private String nodeName;

    private Menu_Item menuItem;

    private ArrayList<TreeNode> children;

    public TreeNode(String nodeName) {

        this.nodeName = nodeName;
        this.children = new ArrayList<>();
    }

    public TreeNode(Menu_Item menuItem) {

        this.menuItem = menuItem;
        this.nodeName = menuItem.getItemName();
        this.children = new ArrayList<>();
    }

    public String getNodeName() {
        return nodeName;
    }

    public Menu_Item getMenuItem() {
        return menuItem;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}