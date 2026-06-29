public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("n#"); 
            return;
        }
        sb.append(node.val).append("#");
        buildString(node.left, sb);
        buildString(node.right, sb);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new ArrayDeque<>(Arrays.asList(data.split("#")));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("n")) {
            return null; 
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = buildTree(queue);  
        root.right = buildTree(queue); 
        return root;
    }
}