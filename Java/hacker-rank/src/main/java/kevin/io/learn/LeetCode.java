package kevin.io.learn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class LeetCode {

    static boolean formatIsCorrect(String formatted) {

        if (isNotBracketsAsString(formatted)) return false;

        final String[] splitBrackets = formatted.split("");

        if (isNotEvenNumberOfBrackets(splitBrackets)) return false;

        if (splitBrackets.length == 2) {
            if (splitBrackets[0].equals(")")) return false;

            if (splitBrackets[1].trim().equals(")")) return true;
        }

        return checkValidityOfMoreThan2Brackets(splitBrackets);
    }

    private static boolean checkValidityOfMoreThan2Brackets(String[] splitBrackets) {

        for (int i = 0; i < splitBrackets.length; i++) {
            if (isNotEvenNumberOfBrackets(splitBrackets)) return false;

            if (splitBrackets[i].equals("(") && splitBrackets[i + 1].equals(")")) return true;
        }

        return false;
    }

    private static boolean isNotBracketsAsString(String formatted) {
        return !Pattern.matches("[()]+", formatted);
    }

    private static boolean isNotEvenNumberOfBrackets(String[] splitBrackets) {
        return splitBrackets.length % 2 != 0;
    }

    @DisplayName("Test class for LeetCode")
    static class Tests {

        @Test
        public void testFalseFor2Bracket() {
            assertFalse(LeetCode.formatIsCorrect(")("));
        }

        @Test
        public void testFalseForWrongBrackets() {
            assertFalse(LeetCode.formatIsCorrect("(()"));
        }

        @Test
        public void testCorrectForFakeString() {
            assertFalse(LeetCode.formatIsCorrect("test"));
        }

        @Test
        public void testCorrectFor2Bracket() {
            assertTrue(LeetCode.formatIsCorrect("()"));
        }

        @Test
        public void testCorrectFor4Brackets() {
            assertTrue(LeetCode.formatIsCorrect("()()"));
        }

        @Test
        public void testCorrectFor6Brackets() {
            assertTrue(LeetCode.formatIsCorrect("()()()"));
        }

        @Test
        public void testCorrectForInnerBrackets() {
            assertTrue(LeetCode.formatIsCorrect("(()())"));
        }

    }
}

class TreeNode {

    final List<int[]> childParentMatrix = new ArrayList<>();

    public void addNode(int child, int parent) {
        childParentMatrix.add(new int[]{child, parent});
    }

    public int findRoot() {
        List<Integer> childs = new ArrayList<>();
        int root = 0;

        for (int[] parentMatrix : childParentMatrix) {
            childs.add(parentMatrix[0]);
        }

        for (int[] parentMatrix : childParentMatrix) {
            if (!childs.contains(parentMatrix[1])) {
                root = parentMatrix[1];
            }
        }

        return root;
    }

    @DisplayName("Test class for TreeNode")
    static class TreeNodeTest {

        @Test
        public void basicTest() {
            TreeNode tree = new TreeNode();

            tree.addNode(1, 3);
            tree.addNode(3, 4);
            tree.addNode(4, 5);
            tree.addNode(2, 4);

            assertEquals(5, tree.findRoot());
        }

        @Test
        public void AdvancedTest() {
            TreeNode tree = new TreeNode();

            tree.addNode(1, 3);
            tree.addNode(3, 4);
            tree.addNode(4, 5);
            tree.addNode(2, 4);
            tree.addNode(2, 6);
            tree.addNode(6, 5);
            tree.addNode(5, 8);

            assertEquals(8, tree.findRoot());
        }
    }
}

class Challenge {


    public static Integer sjf(List<Integer> jobs, Integer index) {

        if (jobs.isEmpty()) return 0;

        final int cycleClockOfOurJob = jobs.get(Math.abs(index));

        return jobs.stream()
                .map(Math::abs)
                .sorted()
                .filter(x -> x <= cycleClockOfOurJob)
                .reduce(0, Integer::sum);
    }

    static class Tests {

        @Test
        public void shouldHandleTheExample() {
            Integer expected = 6;
            Integer actual = Challenge.sjf(Arrays.asList(3, 10, 20, 1, 2), 0);
            assertEquals(expected, actual);
        }

        @Test
        public void shouldHandleTheExample2() {
            Integer expected = 26;
            Integer actual = Challenge.sjf(Arrays.asList(3, 10, 10, 20, 1, 2), 2);
            assertEquals(expected, actual);
        }
    }
}

class PalindromeNumber {

    static boolean isPalindrome(int number) {

        if (number < 0) return false;

        return number == reversedForm(number);
    }

    private static int reversedForm(int number) {
        int reversed = 0;

        while (number > 0) {
            reversed = (number % 10) + (reversed * 10) ;
            //noinspection IntegerDivisionInFloatingPointContext
            number = (int) Math.floor(number / 10);
        }

        return reversed;
    }

    static class Tests {

        @Test
        @DisplayName("Should print true for 121")
        void shouldReturnTrue() {
            assertTrue(PalindromeNumber.isPalindrome(121));
        }

        @Test
        @DisplayName("Should print true for 121")
        void shouldReturnFalse() {
            assertFalse(PalindromeNumber.isPalindrome(65));
        }
    }
}

