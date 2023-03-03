import java.util.*;

public class Main {
    public static void main(String[] args) {

        int MAX_NUMBER = 100;

        int TESTS_AMONT = 50;

        int MAX_ELEMENTS = 20;

        Random rand = new Random();

        RedBlackTree<Integer> rbt;
        int testInsertElementsAmount;
        int testContainElementsAmount;
        int testDeleteElementsAmount;
        int num;

        for (int i = 0; i < TESTS_AMONT; i++) {
            try {
                System.out.println("\n\nStart test #" + i);
                rbt = new RedBlackTree<>();

                testInsertElementsAmount = rand.nextInt(MAX_ELEMENTS - 1) + 1;
                testContainElementsAmount = rand.nextInt(MAX_ELEMENTS / 2) + 1;
                testDeleteElementsAmount = rand.nextInt(MAX_ELEMENTS - 1) + 1;

                System.out.println(" Insertion [" + testInsertElementsAmount + "]:");
                for (int j = 0; j < testInsertElementsAmount; j++) {
                    num = rand.nextInt(MAX_NUMBER);
                    System.out.println("  Insert " + num + " into tree");
                    rbt.add(num);
                }
                System.out.println("Tree:");
                RedBlackTree.printTree((RedBlackTree<Integer>) rbt);

                System.out.println(" Contains [" + testContainElementsAmount + "]:");
                for (int j = 0; j < testContainElementsAmount; j++) {
                    num = rand.nextInt(MAX_NUMBER);
                    System.out.println("  Is " + num + " contain in tree? It's " + rbt.contains(num));
                }

                System.out.println(" Deletion [" + testDeleteElementsAmount + "]:");
                for (int j = 0; j < testDeleteElementsAmount; j++) {
                    num = rand.nextInt(MAX_NUMBER);
                    System.out.println("  Is " + num + " delete from tree? It's " + rbt.remove(num));
                }
                System.out.println("Tree:");
                RedBlackTree.printTree(rbt);
            } catch (Exception e) {
                System.out.println("Got error: " + e.getMessage());
            }
        }
    }
}