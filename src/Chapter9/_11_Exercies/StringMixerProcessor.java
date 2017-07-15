package Chapter9._11_Exercies;

/**
 * Created by qifu on 17/7/14.
 */
class StringMixerAdapter implements Processor{
    StringMixer stringMixer;
    public StringMixerAdapter(StringMixer stringMixer){
        this.stringMixer = stringMixer;
    }
    @Override
    public String name() {
        return "StringMixerProcessor";
    }

    @Override
    public String process(Object input) {
        return StringMixer.process((String)input);
    }
}

public class StringMixerProcessor {
    public static void main(String[] args) {
        String s = "args";
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}
