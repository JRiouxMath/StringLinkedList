public class ListNode
{
    private String data;
    private ListNode link;

    public ListNode()
    {
        link = null;
        data = null;
    }//end default ListNode constructor

    public ListNode(String data, ListNode link)
    {
        this.data = data;
        this.link = link;
    }//end 2arg ListNode constructor

    public void setData(String data)
    {
        this.data = data;
    }// end data setter

    public void setLink (ListNode link)
    {
        this.link = link;
    }// end link setter

    public String getData ()
    {
        return data;
    }//end data getter

    public ListNode getLink()
    {
        return link;
    }//end link getter
}//end class ListNode
