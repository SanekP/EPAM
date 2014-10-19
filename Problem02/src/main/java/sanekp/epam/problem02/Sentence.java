package sanekp.epam.problem02;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class Sentence {
    Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        String string = "";
        for (Word word : words) {
            string += word + " ";
        }
        return string;
    }
}
