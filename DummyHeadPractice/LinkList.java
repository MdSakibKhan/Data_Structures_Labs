public class LinkList{
  Node head = new Node(null,null,null);
  LinkList(Object ar[]){
    Node h2;
    int c = 0;
    for(h2=head; c<ar.length; c++){
      Node x = new Node(ar[c],null,null);
      h2.next = x;
      x.prev=h2;
      h2=x;
    }
    h2.next=head;
    head.prev=h2;
  }
  public void printForward(){
    for(Node n = head.next; n!=head ; n=n.next)
      System.out.print(n.element+" ");
    System.out.println();
  }
  public void printBackward(){
    for(Node n = head.prev; n!=head ; n=n.prev)
      System.out.print(n.element+" ");
    System.out.println();
  }
  public void insert(Object elem,int idx){
    int c =0;
    Node n;
    for(n = head.next; c<idx; n=n.next,c++);
    Node x = n.prev;
    Node y=n;
    Node hidx = new Node(elem,null, null);
    x.next=hidx;
    hidx.prev=x;
    hidx.next=y;
    y.prev=hidx;
  }
}
