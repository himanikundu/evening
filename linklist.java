package pa1;
class Node{
	int data;
	Node next;
	
}
 class linklist {
Node start;
public void insert(int data) {
	Node node =new Node();
	node.data=data;
	node.next=null;
	if(start==null) {
		start=node;
	}
	else 
	{
		Node n=start;
	while(n.next!=null)
		n=n.next;
	n.next=node;	
}
}
public void display() {
	Node n=start;
	while(n!=null) {
		System.out.println(n.data);
		n=n.next;
	}
}
	public static void main(String[] args) {
linklist a=new linklist();
for(int i=1;i<=4;i++) {
	a.insert(i);
}
a.display();
			
		}
		

	}
