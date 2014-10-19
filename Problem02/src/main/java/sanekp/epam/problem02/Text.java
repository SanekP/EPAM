package sanekp.epam.problem02;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class Text {
    private String title;
    private String text = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void append(Sentence sentence) {
        text += sentence + "\n";
    }

    public void print() {
        System.out.println(title);
        System.out.println();
        System.out.println(text);
    }
}
