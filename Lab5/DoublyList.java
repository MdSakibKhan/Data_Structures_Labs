public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; // Making it circular
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count = 0;
    for(Node i = head.next ; i!=head; i=i.next,count++){
    }
    
    return count; 
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    for(Node i = head.next ; i!=head; i=i.next){
      System.out.print(i.element+" ");
    }
    System.out.println();   
  }
  
  public void backwardprint(){
    for(Node i = head.prev ; i!=head; i=i.prev){
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int c=0;
    for(Node i = head.next ; i!=head && c<=idx; i=i.next,c++){
      if(c==idx)return i;
    }
    return null; 
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int c = 0; 
    for(Node i = head.next; i!=head; i=i.next, c++){
      if(i.element.equals(elem)) return c;
    }
    
    
    
    return -1; 
  }
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int c = 0;
    Node i=null;
    for(i = head.next; i!= head && c<idx ; i=i.next,c++){
    }
    Node newNode  = new Node(elem,null,null);
    Node x=i.prev;
    x.next=newNode;
    newNode.next=i;
    i.prev = newNode;
    newNode.prev=x;
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    int c=0;
    Node i=null;
    Object el = null;
    for(i = head.next; i!= head && c<index ; i=i.next,c++){
    }
    el=i.element;
    Node n = i.prev;
    n.next=i.next;
    i.next.prev=n;
    i=null;
    
    return el; 
  }  
}