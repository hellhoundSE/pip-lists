import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GetParagraphMostOccurredWordTests {

    @Test
    public void getParagraphMostOccurredWordCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        List<List<String>> paragraph = new ArrayList<List<String>>();
        List<String> sentense1 = new ArrayList<>();
        List<String> sentense2 = new ArrayList<>();
        List<String> sentense3 = new ArrayList<>();
        sentense1.add("ala");
        sentense1.add("ma");
        sentense1.add("kota");
        sentense2.add("ala");
        sentense2.add("ma");
        sentense2.add("psa");
        sentense3.add("ala");
        sentense3.add("lubi");
        sentense3.add("ryb");

        paragraph.add(sentense1);
        paragraph.add(sentense2);
        paragraph.add(sentense3);

        String correct = "ala";

        GenericTestFactory.testMethod(main,"getParagraphMostOccurredWord",correct, new Object[]{paragraph});
    }

    @Test
    public void getParagraphMostOccurredWordCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        ArrayList<ArrayList<String>> paragraph = new ArrayList<ArrayList<String>>();
        ArrayList<String> sentense1 = new ArrayList<>();
        ArrayList<String> sentense2 = new ArrayList<>();
        ArrayList<String> sentense3 = new ArrayList<>();
        sentense1.add("marcin");
        sentense1.add("ma");
        sentense2.add("psa");
        sentense2.add("jacek");
        sentense2.add("ma");
        sentense3.add("dom");
        sentense3.add("mateusz");
        sentense3.add("ma");
        sentense3.add("wode");

        paragraph.add(sentense1);
        paragraph.add(sentense2);
        paragraph.add(sentense3);

        String correct = "ma";

        GenericTestFactory.testMethod(main,"getParagraphMostOccurredWord",correct, new Object[]{paragraph});
    }
}
