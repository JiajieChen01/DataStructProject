package ch1;

public class pluraltest {
    public static void main(String[] args){
        plural first=new plural();
        first.plural(5,6);
        plural second=new plural();
        second.plural(9,6);
        method a=new method();
        a.showplural(first);
        a.showplural(second);
        a.add(first,second);

        a.minus(first, second);

    }
}
