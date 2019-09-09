public  class Node {

    /**
     * node for binary tree
     */
    private Object value;
    Node left;
    Node right;

    public Node(Object value) {
        this.value = value;
    }

    public Node(Object value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "dataStructure.Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}