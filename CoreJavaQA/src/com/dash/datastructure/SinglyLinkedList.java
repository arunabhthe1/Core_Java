package com.dash.datastructure;


public class SinglyLinkedList <T> {
	private  Node<T> head;
	private  Node<T> tail;
	public Boolean add(T info){
		Boolean returnVal=false;
		if(head==null){
			Node<T> temp=new Node<T>();
			temp.info=info;
			head=tail=temp;
			
		}else if(head.next==null){
			Node<T> temp=new Node<T>();
			temp.info=info;
			head.next=tail=temp;
		}else{
			Node<T> temp=new Node<T>();
			temp.info=info;
			tail.next=temp;
			tail=temp;
		}
		return returnVal=true;
	}
	public void reverseLinkedList(){
		Node<T> current;
		Node<T> next;
		Node<T> nextToNext;
		current=head;
		
		next=current.getNext();
		nextToNext=next.getNext();
		current.next=null;
		while(true){
			nextToNext=next.getNext();
			next.next=current;
			current=next;
			next=nextToNext;
			nextToNext=nextToNext.next;
			if(nextToNext.next==null){
				break;
			}
		}
		next.next=current;
		nextToNext.next=next;
		head=nextToNext;
	}
	public void traverseAll(){
		Node<T> temp=head;
		if(temp==null){
			System.out.println("List is empty");
			return;
		}
		while(true){
			System.out.println(temp.info);
			if(temp.next!=null)
				temp=temp.next;
			else
				break;
		}
	}
}
class Node<T>{
	T info;
	Node<T> next;
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public String toString(){
		return this.info.toString();
	}
}
