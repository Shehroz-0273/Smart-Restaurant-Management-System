package Menu;

public class MenuTree {

    private TreeNode root;

    public MenuTree() {
        root = new TreeNode("Menu");
    }

    public TreeNode getRoot() {
        return root;
    }

    public void displayTree() {
        display(root, 0);
    }

    private void display(TreeNode node, int level) {

        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }

        System.out.println("|-- " + node.getNodeName());

        for (TreeNode child : node.getChildren()) {
            display(child, level + 1);
        }
    }
}