import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetSentenceMostOccurredWord {

    @Test
    public void getSentenceMostOccurredWordCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<String> words = new ArrayList<>();
        words.add("fish");
        words.add("dog");
        words.add("cat");
        words.add("cat");
        words.add("monkey");
        words.add("mouse");

        String correct = "cat";

        GenericTestFactory.testMethod(main,"getSentenceMostOccurredWord",correct, new Object[]{words});
    }

    @Test
    public void getSentenceMostOccurredWordCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<String> words = new ArrayList<>();
        words.add("fish");
        words.add("dog");
        words.add("fish");
        words.add("cat");
        words.add("monkey");
        words.add("mouse");

        String correct = "fish";

        GenericTestFactory.testMethod(main,"getSentenceMostOccurredWord",correct, new Object[]{words});
    }
}
