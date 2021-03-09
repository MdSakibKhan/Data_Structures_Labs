public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }

    public int size(){
      return size;
    }

    public boolean isEmpty(){
      if(size==0){
      return true;
      }
      return false;
    }

    public void push(Object e) throws StackOverflowException{
      if(size<data.length){
       data[size++]=e;
      }
      else throw new StackOverflowException();
    }

    public Object pop() throws StackUnderflowException{
      if(size==0){
        throw new StackUnderflowException();
      }
     else{ 
       Object r=data[size-1];
       size--;
       return r;
     }
    }

    public Object peek() throws StackUnderflowException{
      if(size==0) throw new StackUnderflowException();
      else return data[size-1];
    }

    public String toString(){
      String s="{" ;
      for(int i = size-1; i>=0; i--){
       s=s+data[i]+" ";
      }
      s=s+"}";
      return s;
    }

    public Object[] toArray(){
      Object s[] = new Object[size];
      int j = 0 ;
      for(int i = size-1; i>=0; i--){
       s[j]=data[i];
       j++;
      }
      return s;
    }

    public int search(Object e){
      int count = 0;
      for(int i = size-1; i>=0; i--){
        if(data[i].equals(e)){
          return count;
        }
        count++;
      }
      return -1;
    }

    
}