public class chk{
  Object ob[];
  int start;
  int size;
  public chk(Object b[],int starting , int sz){
    ob=b;
    start=starting;
    size=sz;
  }
  public void print(){
    for(int st=start%ob.length,c=0; c<size ; c++, st=(st+1)%ob.length){
      System.out.print(ob[st]+" ");
    }
    System.out.println();
  }
  public void hi2(){
    int highest = 0;
    for(int st=start%ob.length,c=1; c<size ; c++, st=(st+1)%ob.length){
      if((int)ob[st]>highest) highest = (int)ob[st];
    }
    int highest2 = 0;
    for(int st=start%ob.length,c=1; c<size ; c++, st=(st+1)%ob.length){
      if((int)ob[st]>highest2 && (int)ob[st]!=highest){
        highest2 = (int)ob[st];
      }
    } 
    System.out.println(highest2);
  }
  public boolean palindrom(int first, int last){
    int counter = (last-first)/2;
    for(int st = start+first%ob.length,c=0;  c<=counter ;c++, st=(st+1)%ob.length){
      if((int)ob[st]!=(int)ob[((start-c)+last)%ob.length]) return false;
    }
    return true;
  }
  
}