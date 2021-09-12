package com.bridgelabz.collectiondemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class CollectionsDemo {
	public static void main(String[] args) {

		doListDemo();
		doStackDemo();

	}

	private static void doListDemo() {
		System.out.println("List Demo");
		List<String> list = new LinkedList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	private static void doStackDemo() {
		System.out.println("Stack Demo");

		Stack<String> stack = new Stack<>();

		stack.push("Ravi");
		stack.push("Amit");
		stack.push("Garima");
		stack.push("Ashish");
		String pop = stack.pop();
		System.out.println("Popped Element : " + pop);
		Iterator iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	

}