import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GetSecondMinimalTests {

    @Test
    public void getSecondMinimalCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<List<Integer>> sequence = new ArrayList<List<Integer>>();
        List<Integer> sequence1 = new ArrayList<Integer>();
        List<Integer> sequence2 = new ArrayList<Integer>();
        List<Integer> sequence3 = new ArrayList<Integer>();

        sequence1.add(10);
        sequence1.add(20);
        sequence2.add(30);
        sequence2.add(40);
        sequence3.add(5);
        sequence3.add(25);

        sequence.add(sequence1);
        sequence.add(sequence2);
        sequence.add(sequence3);

        Integer correct = 10;

        GenericTestFactory.testMethod(main,"getSecondMinimal",correct, new Object[]{sequence});
    }

    @Test
    public void getSecondMinimalCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<List<Integer>> sequence = new ArrayList<List<Integer>>();
        List<Integer> sequence1 = new ArrayList<Integer>();
        List<Integer> sequence2 = new ArrayList<Integer>();
        List<Integer> sequence3 = new ArrayList<Integer>();

        sequence1.add(33);
        sequence1.add(44);
        sequence2.add(55);
        sequence2.add(66);
        sequence3.add(77);
        sequence3.add(88);
        sequence3.add(13);
        sequence3.add(1);

        sequence.add(sequence1);
        sequence.add(sequence2);
        sequence.add(sequence3);

        Integer correct = 13;

        GenericTestFactory.testMethod(main,"getSecondMinimal",correct, new Object[]{sequence});
    }
}
