import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private List<Integer> createList() {
        List<Integer> sampleList = new ArrayList<Integer>();
        sampleList.add(1);
        sampleList.add(13);
        sampleList.add(20);
        sampleList.add(88);
        sampleList.add(33);
        sampleList.add(5);

        return sampleList;
    }

}