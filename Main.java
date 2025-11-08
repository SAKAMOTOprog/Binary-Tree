public class Main {
    public static void main(String[] args) {

        BinaryTree animalTree = new BinaryTree();

        Node rootNode = new Node("Does it live on land?");
        Node seaNode = new Node("Is it a mammal?");
        Node landNode = new Node("Is it a pet?");
        Node crustaceanNode = new Node("Is it a Crab?");
        Node fishNode = new Node("Is it a Dolphin?");
        Node wildNode = new Node("Is it a Lion?");
        Node petNode = new Node("Is it a Dog?");

        animalTree.root = rootNode;

        rootNode.left = seaNode;
        rootNode.right = landNode;

        seaNode.left = crustaceanNode;
        seaNode.right = fishNode;

        landNode.left = wildNode;
        landNode.right = petNode;

        System.out.println("Tree construction complete!");
        System.out.println("Let's see how a computer would read this tree...");

        animalTree.traversePreOrder();
        animalTree.traverseInOrder();
        animalTree.traversePostOrder();
    }
}
