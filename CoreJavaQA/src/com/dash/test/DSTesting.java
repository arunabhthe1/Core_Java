package com.dash.test;

import com.dash.datastructure.SinglyLinkedList;
import java.util.LinkedList;
public class DSTesting {
	
	public static void main(String ar[]){
		SinglyLinkedList<Integer> sll=new SinglyLinkedList<Integer>();
		sll.add(1);
		sll.add(4);
		sll.add(5);
		sll.add(7);
		sll.add(9);
		sll.add(15);
		sll.add(11);
		sll.traverseAll();
		try{
			sll.reverseLinkedList();
			System.out.println("Reversal is done");
		}catch(Exception ex){
			System.out.println(ex);
		}
		sll.traverseAll();
	}

}
