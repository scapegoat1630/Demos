package com.tzy.visit;

import java.util.Stack;

import com.tzy.commons.Node;

public class IterativePostorder {
	public static void visit(Node root){
		System.out.println(root);
	}
	public static void postorder(Node root){
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
		while(temp != null){
			while(temp !=  null){
				stack.push(temp);
				temp = temp.getLeft();
			}
			if(stack.size() >0){
				temp = stack.pop();
				visit(temp);
				temp = temp.getRight();
			}
		}
	}
}
