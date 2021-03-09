
package Lab4;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("\n/////  Test 01  /////");
    Object [] a1 = {10,20,30,40};
    LinkedList h1 = new LinkedList(a1); // Creates a linked list using the values from the array
    // head will refer to the Node that contains the element from a[0] 
    h1.printList(); // This should print: 10,20,30,40. 
    System.out.println(h1.countNode()); // This should print: 4
    System.out.println("\n/////  Test 03  /////");
    // returns the reference of the Node at the given index. For invalid idx return null.
    Node myNode = h1.nodeAt(1);
    System.out.println(myNode.element); // This should print: 20. In case of invalid index This will
    // generate nullPointerException.
    System.out.println("\n/////  Test 04  /////");
    // returns the element of the Node at the given index. For invalid idx return null.
    Object val = h1.get(2);
    System.out.println(val); // This should print: 30. In case of invalid index This will print null.
    System.out.println("\n/////  Test 05  /////");
    
    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */     
    System.out.println(h1.set(1,85)); // This should print: 20
    h1.printList(); // This should print: 10,85,30,40.
    System.out.println(h1.set(15,85)); // This should print: null
    h1.printList(); // This should print: 10,85,30,40. 
    
      
    System.out.println("\n/////  Test 06  /////");
    // returns the index of the Node containing the given element.
    // if the element does not exist in the List, return -1.
    int index = h1.indexOf(40);
    System.out.println(index); // This should print: 3. In case of element that 
    //doesn't exists in the list this will print -1.
   System.out.println("\n/////  Test 07  /////");
    // returns true if the element exists in the List, return false otherwise.
    boolean ask = h1.contains(40);
    System.out.println(ask); // This should print: true.
    
    }
    
}
