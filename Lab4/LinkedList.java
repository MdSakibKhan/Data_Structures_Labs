
package javaapplication1;

public class LinkedList {
  public Node head;
  public int count=0;

   public LinkedList(Object [] a){
       head = new Node(a[count],null);
       Node tail=head;
       count=count+1;
       while(count<a.length){
           Node x = new Node(a[count],null);
           tail.next=x;
           tail=x;
           count++;
       }
  }
   public String countNode(){
      return "\nNodeCount "+count;
   }
   public void printList(){
       for(Node i = head; i!=null; i=i.next){
           System.out.print(i.element+" ");
       }
       System.out.println();
   }
   public Node nodeAt(int n){
      int c = 1;
      Node r=null;
      for(Node i = head; i!=null; i=i.next){
        if(c==n+1){
            r=i;
                 break;
             }
             c++;
       }
       return r;
   }
      public Object get(int n){
      int c = 1;
      Object r=null;
           for(Node i = head; i!=null; i=i.next){
             if(c==n+1){
                 r=i.element;
                 break;
             }
             c++;
       }
       return r;
   }
      public Object set(int pos, Object elem){
         Object f= get(pos);
         int c = 1;
           for(Node i = head; i!=null; i=i.next){
             if(c==pos+1){
                 i.element=elem;
                 break;
             }
             c++;
       }
           return f;
      }
      public int indexOf(int value){
          int c = 0;
          boolean r= false;
        for(Node i = head; i!=null; i=i.next){
            if((int)i.element==value){
                r=true;
                break;
            }
            c++;
        } 
        if(r==false){
            c=-1;
        }
        return c;
      }
    public boolean contains(int value){
       boolean r= false;
        for(Node i = head; i!=null; i=i.next){
            if((int)i.element==value){
                r=true;
                break;
            }
        }
        return r;
    }  
}
