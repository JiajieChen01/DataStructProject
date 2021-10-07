package ch2;

public class SqList implements iList {
    private Object[]listElem;
    private int curLen;
    private Exception Exception;
    public SqList(int maxSize){
        curLen=0;
        listElem=new Object[maxSize];
    }
    public void clear(){
        curLen=0;
    }

    public boolean isEmpty(){
        return curLen==0;
    }
    public int length(){
        return curLen;
    }
    public Object get(int i) throws Exception{
        if(i<0 || i>curLen-1)
            throw new Exception("第"+1+"个元素");
        return listElem[i];
    }
    public void insert(int i, Object x)throws  Exception{
        if(curLen>=listElem.length){
            throw  Exception;
        }
        if(i<0 || i>curLen){
            throw new Exception("插入位置不合理");
        }
        for(int j=curLen;j>i;j--)
            listElem[j]=listElem[j-1];
        listElem[i]=x;
        curLen++;
    }
    public void remove(int i){}
    public void indexOf(Object x){}
    public  void display(){}
}
