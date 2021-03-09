import java.util.*;
public class LinkListTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c=input.nextInt();
		Node head = new Node(c,null);
		Node tail=head;
		while(c>=0) {
			int s = input.nextInt();
			if(s==0) {
				break;
			}
			Node nd = new Node(s,null);
			tail.next=nd;
			tail=nd;
		}
		for(Node i = head; i!=null; i=i.next) {
			System.out.print(i.elem+" ");
		}
		
	}
}
