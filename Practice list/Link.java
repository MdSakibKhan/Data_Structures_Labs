public class Link{
  Node head;
  Link(Object []ob){
    head = new Node(ob[0],null);
    Node tail = head;
    for(int i = 1; i<ob.length; i++){
      Node x = new Node(ob[i],null);
      tail.next=x;
      tail = x;
    }
  }
  public void print(){
    for(Node i = head; i!=null; i=i.next){
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  public int countNode(){
  int count =0;
  for(Node i = head; i!=null; i=i.next,count++){
    }
  return count;
  }
  public void rotateLeft(int ps){
   Node joint = head;
   int c=1;
   Node i = null;
   Node newHead=null;
   for( i = head; i!=null; i=i.next,c++){
     if(c==ps){
     newHead=i.next;
     i.next=null;
     break;
   }
   }
   head=newHead;
   for(Node n = head; n!=null ; n=n.next){
     if(n.next==null){
       n.next=joint;
       break;
     }
  }
}
  
  public void rotateRight(int ps){
    Node joint =head;
    Node newHead=null;
    int c=1;
    int nodeCount= countNode();
    for(Node i = head; i!=null; i=i.next,c++){
      if(c==nodeCount-ps){
        newHead = i.next;
        i.next=null;
        for(Node n = newHead; n!=null; n=n.next){
          if(n.next==null){
            n.next=joint;
            head=newHead;
            break;
        }
      } 
        break;
  }
    }
}
}