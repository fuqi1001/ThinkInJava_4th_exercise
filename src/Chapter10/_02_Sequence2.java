package Chapter10;

/**
 * Created by qifu on 17/7/17.
 */
class Word {
    private String word;
    public Word(String s) {this.word = s;}
    public String toString() {return word;}
}
interface Selector2 {
    boolean end();
    Object current();
    void next();
}
public class _02_Sequence2 {
    private Object[] items;
    private int next = 0 ;
    public _02_Sequence2(int size) {
        items = new Object[size];
    }
    private void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector2 {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length) i++;
        }
    }

    public Selector2 selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        _02_Sequence2 sequence = new _02_Sequence2(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(new Word(Integer.toString(i)));
        }

        Selector2 selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }

        Word w1 = new Word("peace");
        Word w2 = new Word("love");
        Word w3 = new Word("Easter");

        _02_Sequence2 message = new _02_Sequence2(3);
        message.add(w1);
        message.add(w2);
        message.add(w3);
        Selector2 selector2 = message.selector();
        while(!selector2.end()) {
            System.out.println(selector2.current());
            selector2.next();
        }
    }

}
