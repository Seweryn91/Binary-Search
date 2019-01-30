import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public BinarySearch() {}

    private List<Integer> sortList(List<Integer> inputList) {
        Collections.sort(inputList);
        return inputList;
    }

    public boolean search(List<Integer> inputList, Integer toFind) {
        List<Integer> sortedList = sortList(inputList);
        int upperBound = sortedList.size();
        int lowerBound = 1;

        for (int i = 0; i < sortedList.size(); i++) { // Using "while" loop with toFind not
                                                      // present && lowerBound < toFind < upperBound
                                                      // creates an infinite loop.
            if (toFind < lowerBound) {
                return false;
            }

            int midpoint = lowerBound + (upperBound - lowerBound) / 2;

            if (sortedList.get(midpoint) < toFind) {
                lowerBound = midpoint + 1;
            } else if (sortedList.get(midpoint) > toFind) {
                upperBound = midpoint - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
