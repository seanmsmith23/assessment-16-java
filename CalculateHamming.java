public class CalculateHamming
{
    public static void main( String[] args)
    {
        HammingDistance hamming = new HammingDistance("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT");
        int distance = hamming.getHammingDistance();

        System.out.println(distance);
    }
}