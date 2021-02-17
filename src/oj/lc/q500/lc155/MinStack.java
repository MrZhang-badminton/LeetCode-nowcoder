package oj.lc.q500.lc155;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

	Deque<Integer> stack;
	Deque<Integer> minStack;

	/** initialize your data structure here. */
	public MinStack() {
		stack = new LinkedList<>();
		minStack = new LinkedList<>();
		minStack.push(Integer.MAX_VALUE);
	}

	public void push(int x) {
		stack.push(x);
		minStack.push(Math.min(minStack.peek(),x));
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
