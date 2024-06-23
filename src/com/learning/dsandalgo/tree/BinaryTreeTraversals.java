package com.learning.dsandalgo.tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeTraversals {

    public void recursivePreOrder(BinaryTreeNode root){
        if(root!=null){
            System.out.println(root.getData());
            recursivePreOrder(root.getLeft());
            recursivePreOrder(root.getRight());
        }
    }

    public ArrayList<Integer> iterativePreOrder(BinaryTreeNode root){
        ArrayList<Integer> result = new ArrayList<>();

        if(root==null)
            return result;

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            BinaryTreeNode tempNode = stack.pop();
            result.add(tempNode.getData());

            if(tempNode.getRight()!=null){
                stack.push(tempNode.getRight());
            }

            if(tempNode.getLeft()!=null){
                stack.push(tempNode.getLeft());
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
