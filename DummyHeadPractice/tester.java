public class tester{
  public static void main(String[] args){
    Object []a={10,20,30,40,50};
    LinkList c1 = new LinkList(a);
    c1.printForward();
    c1.printBackward();
    c1.insert(50,3);
    c1.printForward();
    
  }
}
 