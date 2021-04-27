/*
* GitHub Repo: https://github.com/Mara16/CS-324-Final-Project
*/

import java.util.Arrays;

public class BWT {
    private String text, transform;
    private int index;

    public BWT(String word) {
        this.text = word;
    }

    public String getTransform() {
        return this.transform;
    }

    public void permutations() {
        // 1D array the size of the string to hold all of the rotations
        String[] rotations = new String[this.text.length()];

        // create rotations and store in rotations array
        for (int i = 0; i < rotations.length; i++) {
            rotations[i] = this.text.substring(i) + this.text.substring(0, i);
            System.out.println("rotation " + i + ": " + rotations[i]);
        }

        encode(rotations);
    }

    private void encode(String[] rotations) {
        //sort the rotations lexicographically
        Arrays.sort(rotations);

        System.out.println("\nSorted rotations: ");

        // getting the last column, 'the transformed text'
        String transform = "";
        for (int i = 0; i < rotations.length; i++) {
            System.out.println(rotations[i]);
            transform += rotations[i].charAt(rotations.length - 1);
            if (rotations[i].equals(this.text))    // index of where the original text sits needed to decode later
                this.index = i;
        }

        // System.out.println("The original text sits at index: " + this.index);
        System.out.println("\nBurrows-Wheeler Transform: " + transform);
        this.transform = transform;

        decode();
    }

    // recover the original string
    public String decode() {
        int textLength = this.text.length();

        String[] d = new String[textLength];
        Arrays.fill(d, "");

        for (int i = 0; i < textLength; i++) {
            for (int j = 0; j < textLength; j++) {
                d[j] = this.transform.charAt(j) + d[j];
            }
            Arrays.sort(d);
        }

        // System.out.println(Arrays.toString(d));   // the original sorted rotations table reconstructed
        System.out.println("Original string: " + d[this.index]);
        return d[this.index];
    }
}
