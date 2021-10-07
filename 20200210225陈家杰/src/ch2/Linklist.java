package ch2;

public class Linklist implements iList {

    public Node head;

    public Linklist(){
        head = new Node();
    }

    public void clear(){
        head.data=null;
        head.next=null;
    }

    public Linklist(int n ){

    }

    public boolean isEmpty(){
        return head.next == null ? true:false;
    }

    public int length(){
        Node p = head.next;
        int length =0;
        while(p!=null){
            p=p.next;
            length++;
        }
        return length;
    }

    public Object get(int i)throws Exception{
        Node p = head.next;
        int j=0;
        while (p!=null && j<i){
            p=p.next;
            j++;
        }
        if(j>i || p==null)
        {
            throw new Exception("第"+i+"个元素不存在！");
        }
        return null;
    }

    public void insert(int i, Object x) throws Exception{

    }

    public void remove(int i){

    }
}
