import java.util.Arrays;

public class HammingDistance
{

    public String hammingOne;
    public String hammingTwo;

    public HammingDistance(String hammingStart, String hammingFinish) {
        hammingOne = hammingStart;
        hammingTwo = hammingFinish;
    }

    public int getHammingDistance () {
        char[] firstArray = splitHammingString(hammingOne);
        char[] secondArray = splitHammingString(hammingTwo);

        int distance = loopAndCountDifferences(firstArray, secondArray);

        return distance;
    }

    private char[] splitHammingString (String hammingString) {
        char[] hammingArray = hammingString.toCharArray();

        return hammingArray;
    }

    private int loopAndCountDifferences (char[] firstArray, char[] secondArray) {
        int differences = 0;

        for (int i=0; i < firstArray.length; i++ ) {
            if ( firstArray[i] != secondArray[i] ) {
                differences = differences + 1;
            }
        }

        return differences;
    }

}
