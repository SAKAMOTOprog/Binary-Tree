public class BinaryTree {

    Node root;

    public void traversePreOrder() {
        System.out.println("\n--- Pre-Order Traversal (Root -> Left -> Right) ---");

        traversePreOrderRecursive(root);
        System.out.println();
    }

    private void traversePreOrderRecursive(Node node) {

        if (node == null) {
            return;
        }


        System.out.print(node.data + " -> ");

        traversePreOrderRecursive(node.left);

        traversePreOrderRecursive(node.right);
        }

        public void traverseInOrder() {
            System.out.println("\n--- In-Order Traversal (Left -> Root -> Right) ---");
            traverseInOrderRecursive(root);
            System.out.println();
        }

        private void traverseInOrderRecursive(Node node) {
            if (node == null) {
                return;
            }
            traverseInOrderRecursive(node.left);
            System.out.print(node.data + " -> ");
            traverseInOrderRecursive(node.right);
        }

        public void traversePostOrder() {
            System.out.println("\n--- Post-Order Traversal (Left -> Right -> Root) ---");
            traversePostOrderRecursive(root);
            System.out.println();
        }

        private void traversePostOrderRecursive(Node node) {
            if (node == null) {
                return;
            }
            traversePostOrderRecursive(node.left);
            traversePostOrderRecursive(node.right);
            System.out.print(node.data + " -> ");
    }
}
