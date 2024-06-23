package com.learning.dsandalgo.tree;

public class BTreeUtil {


    public static BinaryTreeNode getLoadedBtree(){

        BinaryTreeNode node = new BinaryTreeNode(1); // level1

        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3); // level 2

        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7); // level 3

        node.setLeft(node2);
        node.setRight(node3); // level1


        node2.setLeft(node4);
        node2.setRight(node5);

        node3. setLeft(node6);
        node3.setRight(node7); // level 2

        return node;
    }



}
