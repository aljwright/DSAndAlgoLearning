package com.learning.dsandalgo.tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeTraversals {

    public void recursivePreOrder(BinaryTreeNode root){
        if(root!= null){
            System.out.println(root.data);
            recursivePreOrder(root.left);
            recursivePreOrder(root.right);
        }
    }

    public ArrayList<Integer> iterativePreOrder(BinaryTreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(root == null){
            return result;
        }

        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        stack.push(root);

        while (!stack.isEmpty()){
            BinaryTreeNode tempNode = stack.pop();
            result.add(tempNode.data);

            if(tempNode.right!= null){
                stack.push(tempNode.right);
            }

            if(tempNode.left!= null){
                stack.push(tempNode.left);
            }
        }
        return result;
    }


    public static void main(String[] args){
        BinaryTreeTraversals bTreeTraversals = new BinaryTreeTraversals();
        BinaryTreeNode root = BTreeUtil.getLoadedBtree();
        bTreeTraversals.recursivePreOrder(root);
        System.out.println("Pre Order : "+bTreeTraversals.iterativePreOrder(root));

    }



}
