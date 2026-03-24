/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author user
 */

public class Review {

    private Node_Tree root;
    private int vowelIndex = 0;
    private int consonantIndex = 0;

    public class Node_Tree {
        private Node_Tree left;
        private Node_Tree right;
        private char data;

        public Node_Tree(char data) {
            this.data = data;
        }
    }

    static char[] vowel = new char[100];
    static char[] consonant = new char[100];

    public void letters(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char count = word.charAt(i);
            if (count == 'a' || count == 'e' || count == 'i' || count == 'o' || count == 'u') {
                vowel[vowelIndex++] = count;
            } else if (Character.isLetter(count)) {
                consonant[consonantIndex++] = count;
            }
        }
    }

    public void createBinaryTree() {
        if (vowelIndex > 0) {
            Node_Tree firstValue = new Node_Tree(vowel[0]);
            root = firstValue;

            if (consonantIndex > 1) {
                Node_Tree secondValue = new Node_Tree(consonant[1]);
                firstValue.left = secondValue;

                if (vowelIndex > 2) {
                    Node_Tree thirdValue = new Node_Tree(vowel[2]);
                    firstValue.right = thirdValue;

                    if (consonantIndex > 3) {
                        Node_Tree fourthValue = new Node_Tree(consonant[3]);
                        secondValue.left = fourthValue;

                        if (vowelIndex > 4) {
                            Node_Tree fifthValue = new Node_Tree(vowel[4]);
                            secondValue.right = fifthValue;
                        }
                    }
                }
            }
        }
    }

    public void traversalOutput(Node_Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        traversalOutput(root.left);
        traversalOutput(root.right);
    }

    public static void main(String[] args) {
        Review binary = new Review();
        binary.letters("kianvillaluz");
        binary.createBinaryTree();
        binary.traversalOutput(binary.root);
    }
}

    
