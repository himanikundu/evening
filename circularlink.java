import java.util.Scanner;
import java.util.*;
class node
{
	int data;
	node head=null;
	node next;
	public node()
	{
		this.data=0;
		this.next=null;

	}
	public node(int data1)
	{
		this.data=data1;
		this.next=null;

	}
	public node add(int data)
	{
		node 1=new node(data);
		if(head=null){
			head=1;
			head.next=head;
		}
		else
		{
			node temp=head;
			while(temp.next!=head){
				temp=temp.next;
				1.next=head;
			}
			return head;
		}
		public int length()
		{
			node temp=head;
			int count=0;
			while(temp!=null){
				temp=temp.next;
				count++;
			}
			return count;
		}
		public node mid(node head,int l)
		{
			int count=0;
			node temp=head;	
			while(count!=(1/2))
			{
				temp=temp.next;
				count++;
			}
			node middle=temp.next;
			temp.next=null;
			return middle;
			System.out.println(middle.data);

		}
		public node addFront(int data,node head){
			node f=new node(data);
			f.next=head;
			head=f;
			return head;\
			47

		}
		public node addend(int data,node head)
		{
			node f=new node(data);
			if(head==null)
			{
				head=f;
				head.next=head;
			}
			else
			{
				node temp=head;
				while(temp.next!=head)
				{
                   temp=temp.next;
				}
				temp.next=f;
				f.next=head;
			}
			return head;
		}
		public void print(node head)
		{
			node temp=head;
			while(temp.next!=head)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
			System.out.println(temp.next.data);
		}
		public node reverse(node head)
		{
			node next=null;
			node prev=null;
			node temp=head;
			while(temp!=null)
			{
				next=temp.next;
				temp.next=prev;
				prev=temp;
				temp=next;
				head=prev;

			}
			return head;
		}
		public node midreverse(node m)
		{
			node prev=null;
			node next=null;
			node temp=head;
			while(temp!=null)
			{
				next=temp.next;
				temp.next=prev;
				prev=temp;
				temp=next;
				head=prev;
			}
			return head;
		}
		public void palindrome(node temp1,node temp2)
		{
			if(temp1.data==temp2.data)
			{
				System.out.println("it is palindrome");
				temp1=temp1.next;
				temp2=temp2.next;

			}
			else
			{
				System.out.println("not palindrome");
				temp1=temp1.next;
				temp2=temp2.next;
			}
		}
	}
	class Linkedlist1
	{
		public static void main(String[] args){
			node b=new node();
			node head=b.add(11);
			head=b.add(28);
			head=b.add(38);
			head=b.add(33);
			b.print(head);
		}
	}
	
}