public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size(){
      return size;
    }

    public boolean isEmpty(){
      if(size==0) return true;
      else return false;
    }

    public void push(Object e){
      Node x = new Node(e,top);
      top = x;
      size++;
    }

    public Object pop() throws StackUnderflowException{
      if(size!=0){
        Object p = top.val;
        top = top.next;
        size--;
        return p;
      }
      else throw new StackUnderflowException();
    }

    public Object peek() throws StackUnderflowException{
      
      if(size==0) return new StackUnderflowException();
      else return top.val;
    }

    public String toString(){
      String s="{" ;
      for(Node n = top; n!=null; n=n.next){
       s=s+n.val+" ";
      }
      s=s+"}";
      return s;
    }

   public Object[] toArray(){
      Object s[] = new Object[size];
      int j = 0 ;
      for(Node n = top; n!=null; n=n.next){
       s[j]= n.val;
       j++;
      }
      return s;
    }

    public int search(Object e){
      int count = 0;
      for(Node n = top; n!=null; n=n.next){
        if(n.val.equals(e)){
          return count;
        }
        count++;
      }
      return -1;
    }
    }
