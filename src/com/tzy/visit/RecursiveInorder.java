package com.tzy.visit;

import com.tzy.commons.Node;

public class RecursiveInorder {
	public static void visit(Node root){
		System.out.println(root);
	}
	public static void preorder(Node root){
		if(root != null){
			preorder(root.getLeft());
			preorder(root.getRight());
			visit(root);
		}
	}
}
