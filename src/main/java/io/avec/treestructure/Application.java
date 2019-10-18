package io.avec.treestructure;


/**
 * Created by avec112 on 17.10.19.
 */
public class Application {


    public static void main(String[] args) {
        Node<Enhet> root = createTree();
        printTree(root, " ");
    }

    private static Node<Enhet> createTree() {
        Node<Enhet> root = new Node<>(new Bataljon("PBN/N", "Øyvind"));

        Node<Enhet> node1 = root.addChild(new Node<>(new Eskadron("Esk 1", "Terje")));
        Node<Enhet> node191a = node1.addChild(new Node<>(new Stridsvogn("191A", "Terje")));

        Node<Enhet> node11 = node1.addChild(new Node<>(new Tropp("Tr 1", "Atle")));
        Node<Enhet> node111 = node11.addChild(new Node<>(new Stridsvogn("111", "Atle")));
        Node<Enhet> node112 = node11.addChild(new Node<>(new Stridsvogn("112", "Ronny")));
        Node<Enhet> node12 = node1.addChild(new Node<>(new Tropp("Tr 2", "Truls")));
        Node<Enhet> node121 = node12.addChild(new Node<>(new Stridsvogn("121", "Truls")));
        Node<Enhet> node122 = node12.addChild(new Node<>(new Stridsvogn("122", "Pål")));

        Node<Enhet> node2 = root.addChild(new Node<>(new Eskadron("Esk 2", "Kristian")));
        Node<Enhet> node291a = node2.addChild(new Node<>(new Stridsvogn("291A", "Kristian")));
        Node<Enhet> node21 = node2.addChild(new Node<>(new Tropp("Tr 1", "Knut")));
        Node<Enhet> node211 = node21.addChild(new Node<>(new Stridsvogn("211", "Knut")));
        Node<Enhet> node212 = node21.addChild(new Node<>(new Stridsvogn("212", "Vidar")));
        Node<Enhet> node22 = node2.addChild(new Node<>(new Tropp("Tr 2", "Steinar")));
        Node<Enhet> node221 = node22.addChild(new Node<>(new Stridsvogn("221", "Steinar")));
        Node<Enhet> node222 = node22.addChild(new Node<>(new Stridsvogn("222", "Hans")));
        return root;
    }

    private static <T> void printTree(Node<T> node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each -> printTree(each, appender + appender));

    }

}