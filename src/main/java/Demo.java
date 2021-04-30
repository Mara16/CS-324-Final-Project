/*
 * GitHub Repo: https://github.com/Mara16/CS-324-Final-Project
 */

public class Demo {

    public static void main(String[] args) throws Exception {
        String text = "banana";
        System.out.println("Original text: " + text + "\n");
        BWT a = new BWT(text);
        a.permutations();
    }
}
