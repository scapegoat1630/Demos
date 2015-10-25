package com.tzy.visit;

import java.util.Stack;

import com.tzy.commons.Node;

public class IterativeInorder {
	public static void visit(Node root){
		System.out.println(root);
	}
	public static void postorder(Node root){
		Node lastVisit = root;
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
		while(temp != null){
			//往下找，所有左子树入栈
			while(temp != null){
				stack.add(temp);
				temp = temp.getLeft();
			}
			//没有右边的孩子或者孩子已经输出
			while(temp != null && (temp.getLeft() == null || temp.getRight() == lastVisit)){
				visit(temp);
				lastVisit = temp;
				if(stack.empty())
					return ;
				temp = stack.pop();
			}
			//乖乖的处理右边的节点
			stack.push(temp);
			temp = temp.getRight();
		}
	}
}
