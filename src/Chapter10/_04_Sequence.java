package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Selector {
    boolean end();
    Object Current();
    void next();
}
public class _04_Sequence {
    private Object[] items;
    private int next = 0;
    public _04_Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }

    //test() SequenceSelector seq() in main
    public void test() {
        System.out.println("Sequence.test()");
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object Current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length) i++;
        }

        //method to produce outer class reference
        public _04_Sequence seq() {
            return _04_Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        _04_Sequence sq = new _04_Sequence(10);
        for(int i = 0; i < 10; i++) {
            sq.add(Integer.toString(i));
        }
        Selector selector = sq.selector();
        while(!selector.end()) {
            System.out.println(selector.Current() + " ");
            selector.next();
        }

        //cast and test
        ((SequenceSelector)selector).seq().test();
    }
}
