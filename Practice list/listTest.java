public class listTest{
  public static void main(String[] args){
    Object a[]={10,20,30,40,50,60,70};
    Link s = new Link(a);
    s.print();
    System.out.println(s.countNode());
    s.rotateLeft(5);
    s.print();
    s.rotateRight(2);
    s.print();
  }
}