public class Demo {

    public static void main(String[] args) {
        String text = "banana";
        System.out.println("Original text: " + text + "\n");
        BWT a = new BWT(text);
        a.permutations();
    }
}
