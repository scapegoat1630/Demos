package com.tzy.visit;

import java.util.Stack;

import com.tzy.commons.Node;

public class RecursivePreorder {
	public static void visit(Node root){
		System.out.println(root);
	}
	public static void preorder(Node root){
		if(root != null){
			preorder(root.getLeft());
			visit(root);
			preorder(root.getRight());
		}
	}

}
