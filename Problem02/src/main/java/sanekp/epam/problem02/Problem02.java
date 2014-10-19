package sanekp.epam.problem02;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class Problem02 {
    public static void main(String[] args) {
        Text text = new Text();
        text.setTitle("EPAM Java course");
        Sentence first = new Sentence(new Word[]{new Word("1."), new Word("Java"), new Word("fundamental")});
        text.append(first);
        Sentence second = new Sentence(new Word[]{new Word("2."), new Word("Classes"), new Word("and"), new Word("Objects")});
        text.append(second);
        Sentence third = new Sentence(new Word[]{new Word("3."), new Word("Reference"), new Word("Classes")});
        text.append(third);
        text.print();
    }
}
