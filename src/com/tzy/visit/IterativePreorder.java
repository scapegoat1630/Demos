package com.tzy.visit;

import java.util.Stack;

import com.tzy.commons.Node;

public class IterativePreorder {
	public static void visit(Node root){
		System.out.println(root);
	}
	public static void preorder(Node root){
		if(root != null){
			Stack<Node> stack = new Stack<Node>();
			stack.push(root);
			while(!stack.isEmpty()){
				Node temp = stack.pop();
				visit(root);
				if(temp.getLeft() != null)
					stack.push(temp.getLeft());
				if(temp.getRight()!= null)
					stack.push(temp.getRight());
			}
		}
	}
}
