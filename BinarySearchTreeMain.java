package com.Bridgelabz.Day15Assignments;

public class BinarySearchTreeMain
{
    public static void main(String[] args) {
        BinarySearchTree BinarySearchTree = new BinarySearchTree();
        BinarySearchTree.insert(56);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(70);
        BinarySearchTree.insert(40);
        BinarySearchTree.insert(22);
        BinarySearchTree.insert(11);
        BinarySearchTree.insert(16);
        BinarySearchTree.insert(3);
        BinarySearchTree.insert(90);
        BinarySearchTree.insert(65);
        BinarySearchTree.insert(65);
        BinarySearchTree.insert(63);
        BinarySearchTree.insert(67);
        System.out.println(BinarySearchTree.search(63));
    }
}

