public class CheckingLinkedList
{
    public static void main(String[] args)
    {

    stringLinkedList mySLList = new stringLinkedList();
   //add an element to the list
    mySLList.addNodeToStart("Hello");
    //print the list
    mySLList.printList();
        System.out.println();
    //add two more elements to the
        mySLList.addNodeToStart(" everybody ");
        mySLList.addNodeToStart(" on Earth! ");
//        mySLList.addNodeToEnd(" Goodbye! ");
    //print the list
        mySLList.printList();
        System.out.println();

    //remove an element from the list
//        mySLList.deleteHeadNode();
        mySLList.deleteTailNode();
    //print the list
        mySLList.printList();
        System.out.println();

//    //find an element in the list
//        System.out.println(mySLList.find("Hello"));
//    //find IF an element is in the list
//        System.out.println("Found it! " + mySLList.onList("Hello"));
//        System.out.println("Found it! " + mySLList.onList(" everybody "));
//        System.out.println("Found it! " + mySLList.onList(" on Earth! "));

    }//end main method

}//end class to test LinkedList implementation
