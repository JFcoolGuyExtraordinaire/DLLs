package ftctk;

public class DList {
    Node first = null;
    Node last = null;
    Node current = null;
    
    public DList() {
        first = last;
    }
    
    public void addLast(Node node){
        if (last != null)
        {
            last.next = node;
            node.prev = last;
            last = node;
        }
        else{first = node; last = node; current = first;}
    }
    
    public void addFirst (Node node){
        if (first != null)
        {
            first.prev = node;
            node.next = first;
            first = node;
        }
        else{first = node; last = node; current = first;}
    }
    
    public void forward() 
    {if (current.next != null){current=current.next;}}
    
    public void backward() 
    {if (current.prev != null){current=current.prev;}}
}