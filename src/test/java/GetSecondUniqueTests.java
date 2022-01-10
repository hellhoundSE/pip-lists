import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GetSecondUniqueTests {

    @Test
    public void getSecondUniqueCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<Integer> sequence = new ArrayList<Integer>();

        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);

        Integer correct = 4;

        GenericTestFactory.testMethod(main,"getSecondUnique",correct, new Object[]{sequence});
    }

    @Test
    public void getSecondUniqueCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<Integer> sequence = new ArrayList<Integer>();

        sequence.add(10);
        sequence.add(25);
        sequence.add(10);
        sequence.add(25);
        sequence.add(44);
        sequence.add(33);

        Integer correct = 33;

        GenericTestFactory.testMethod(main,"getSecondUnique",correct, new Object[]{sequence});
    }
}
