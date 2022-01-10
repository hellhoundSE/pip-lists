import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    @Test
    public void test21(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<List<String>> paragraph = new ArrayList<List<String>>();
        List<String> sentense1 = new ArrayList<>();
        List<String> sentense2 = new ArrayList<>();
        List<String> sentense3 = new ArrayList<>();
        sentense1.add("ala");
        sentense1.add("ma");
        sentense1.add("kota");
        sentense1.add("ala");
        sentense1.add("ma");
        sentense1.add("psa");
        sentense1.add("ala");
        sentense1.add("lubi");
        sentense1.add("ryb");

        paragraph.add(sentense1);
        paragraph.add(sentense2);
        paragraph.add(sentense3);

        String correct = "ala";

        GenericTestFactory.testMethod(main,"method2",correct, new Object[]{paragraph});
    }

    @Test
    public void test22(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<List<String>> paragraph = new ArrayList<List<String>>();
        List<String> sentense1 = new ArrayList<>();
        List<String> sentense2 = new ArrayList<>();
        List<String> sentense3 = new ArrayList<>();
        sentense1.add("marcin");
        sentense1.add("ma");
        sentense1.add("psa");
        sentense1.add("jacek");
        sentense1.add("ma");
        sentense1.add("dom");
        sentense1.add("mateusz");
        sentense1.add("ma");
        sentense1.add("wode");

        paragraph.add(sentense1);
        paragraph.add(sentense2);
        paragraph.add(sentense3);

        String correct = "ma";

        GenericTestFactory.testMethod(main,"method2",correct, new Object[]{paragraph});
    }
}
