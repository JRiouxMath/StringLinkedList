/**
 * Original copied from Savitch text to better learn data structures
 * I am hoping to teach this to my CSA students in 19-20
 */
public class stringLinkedList
{
    private ListNode head;
    private ListNode tail;

    /**
     * Default constructor
     */
    public stringLinkedList()
    {
        head = null;
        tail = null;
    }//end constructor

    /**
     * Method to print out the list.  Not quite a toString, but almost
     */
    public void printList()
    {
        ListNode position = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }//end while loop
    }//end method to print out the list

    /**
     * Method to return the number of nodes on the list
     * @return the count of nodes
     */
    public int length()
    {
        int count = 0;
        ListNode position = head;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }//end while loop

        return count;
    }//end method length


    /**
     * method to add a node at the head
     * @param data
      */
    public void addNodeToStart (String data)
    {
        head = new ListNode(data, head);
    }//end method to add a node to the start

    /**
     * Method to add a node to the tail
     * @param data
     */
    public void addNodeToEnd(String data)
    {
        ListNode position = head;
        while(position.getLink() != null)
        {
            position = position.getLink();
        }
        tail = new ListNode(data, tail);
        position.setLink(tail);

    }//end method to add node to the end

    /**
     * method to delete the first node on the list
     */
    public void deleteHeadNode()
    {
        if(head != null)
            head = head.getLink();
        else
        {
            System.out.println("Deleting from an empty list");
            System.exit(0);
        }//end else block
    }//end method to delete the head node

    /**
     * Method to delete the last node on the list
     */
    public void deleteTailNode()
    {
        int count = 0;
        ListNode position = head;
        while (count < this.length()-2)
        {
            position = position.getLink();
            count++;
        }//end while loop

        position.setLink(null);
    }//end method to delete the tail node

    /**
     * Method to determine if the target is on the list
     * @param  target
     * @return Boolean
     */
    public boolean onList(String target)
    {
        boolean isOnList = false;
        isOnList = find(target) != null;
        return isOnList;
    }//end method to find if onList

    /**
     * Method which finds the first node containing the target data.
     * If target not found, returns null.
     * @param target
     * @return position of target
     */
    public ListNode find(String target)
    {
        boolean found = false;
        ListNode position = head;
        while ((position != null) && !found)
        {
            String dataAtPosition = position.getData();
            if(dataAtPosition.equals(target))
                found = true;
            else
                position = position.getLink();
        }//end while loop
        return position;
    }//end method to find position of target


}//end class stringLinkedList
