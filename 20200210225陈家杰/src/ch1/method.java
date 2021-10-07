package ch1;

public class method {
    plural a =new plural();
    plural b =new plural();
    plural e =new plural();//通过创建复数对象来实现对复数的操作
    public void add(plural a,plural b){
        double c=a.ture+b.ture;
        double d=a.virtual+b.virtual;
        e.plural(c,d);
        System.out.print(e.ture+"+"+e.virtual+"i"+"\n");
    }//加
    public void minus(plural a,plural b){
        double c=a.ture-b.ture;
        double d=a.virtual-b.virtual;
        e.plural(c,d);
        System.out.print(e.ture+"+"+e.virtual+"i"+"\n");
    }//减
    public void showplural(plural e){
        System.out.print(e.ture+"+"+e.virtual+"i"+"\n");
    }
}
