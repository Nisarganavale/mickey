import java.util.Random;

public class RW {
    /**
     * list of words.
     */
    public static void main(String[] args) {
        String[] words = new String[] { "Lorem", //$NON-NLS-1$
            "ipsum", //$NON-NLS-1$
            "dolor", //$NON-NLS-1$
            "sit", //$NON-NLS-1$
            "amet", //$NON-NLS-1$
            "consetetur", //$NON-NLS-1$
            "sadipscing", //$NON-NLS-1$
            "elitr", //$NON-NLS-1$
            "sed", //$NON-NLS-1$
            "diam", //$NON-NLS-1$
            "nonumy", //$NON-NLS-1$
            "eirmod", //$NON-NLS-1$
            "tempor", //$NON-NLS-1$
            "invidunt", //$NON-NLS-1$
            "ut", //$NON-NLS-1$
            "labore", //$NON-NLS-1$
            "et", //$NON-NLS-1$
            "dolore", //$NON-NLS-1$
            "magna", //$NON-NLS-1$
            "aliquyam", //$NON-NLS-1$
            "erat", //$NON-NLS-1$
            "sed", //$NON-NLS-1$
            "diam", //$NON-NLS-1$
            "voluptua", //$NON-NLS-1$
            "At", //$NON-NLS-1$
            "vero", //$NON-NLS-1$
            "eos", //$NON-NLS-1$
            "et", //$NON-NLS-1$
            "accusam", //$NON-NLS-1$
            "et", //$NON-NLS-1$
            "justo", //$NON-NLS-1$
            "duo", //$NON-NLS-1$
            "dolores", //$NON-NLS-1$
            "et", //$NON-NLS-1$
            "ea", //$NON-NLS-1$
            "rebum", //$NON-NLS-1$
            "Stet", //$NON-NLS-1$
            "clita", //$NON-NLS-1$
            "kasd", //$NON-NLS-1$
            "gubergren", //$NON-NLS-1$
            "no", //$NON-NLS-1$
            "sea", //$NON-NLS-1$
            "takimata", //$NON-NLS-1$
            "sanctus", //$NON-NLS-1$
            "est" };
    /**
     * random number producer.
     */
    Random random = new Random();
}
public static String getRW() {
        return words[random.nextInt(words.length)];
    }
}
