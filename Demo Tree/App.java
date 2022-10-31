public class App {
    public static void main(String[] args) {
        
        // membuat root dengan data "H"
        Pohon<String> p1 = new Pohon<String>("H");

        // membuat subclass dari "H" dengan data "D" dan "K"
        p1.cantolin(p1.root, new Node<String>("D"));
        p1.cantolin(p1.root, new Node<String>("K"));
        
        p1.telusur(p1.root);
        System.out.println();

        // mencari node "D"
        Node<String> nodeD = p1.cari(p1.root, "D");

        // membuat subclass dari "D" dengan data "F" dan "B"
        p1.cantolin(nodeD, new Node<String>("F"));
        p1.cantolin(nodeD, new Node<String>("B"));

        p1.telusur(p1.root);
        System.out.println();

        Node<String> nodeF = p1.cari(p1.root, "F");

        p1.cantolin(nodeF, new Node<String>("E"));
        p1.cantolin(nodeF, new Node<String>("G"));

        p1.telusur(p1.root);
        System.out.println();

        Node<String> nodeB = p1.cari(p1.root, "B");

        p1.cantolin(nodeB, new Node<String>("A"));
        p1.cantolin(nodeB, new Node<String>("C"));

        p1.telusur(p1.root);
        System.out.println();

        Node<String> nodeK = p1.cari(p1.root, "K");

        p1.cantolin(nodeK, new Node<String>("J"));
        p1.cantolin(nodeK, new Node<String>("L"));

        p1.telusur(p1.root);
        System.out.println();

        Node<String> nodeJ = p1.cari(p1.root, "J");

        p1.cantolin(nodeJ, new Node<String>("I"));

        p1.telusur(p1.root);

        p1.findingNonLeaf(p1.root, "H");
    }
}
