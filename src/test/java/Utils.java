import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Utils {
    public static boolean arrayEquals(Object[] arr1,Object[] arr2){
        if(arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++){
            if(Objects.equals(arr1[i],arr2[i]))
                return false;
        }
        return true;
    }

    public static boolean listsEquals(List list1,List list2){
        if(list1.size() != list2.size())
            return false;
        Collections.sort(list1);
        Collections.sort(list2);
        for (int i = 0; i < list1.size(); i++){
            if(Objects.equals(list1.get(i),list2.get(i)))
                return false;
        }
        return true;
    }
}
