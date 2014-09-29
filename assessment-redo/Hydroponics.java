import java.util.HashMap;
import java.util.ArrayList;

public class Hydroponics {
    public static void main( String[] args) {
        MetricsParser metrics = new MetricsParser("metrics.tsv");
        ArrayList<HashMap<String,String>> metricsArray = metrics.readingTheFile();
        System.out.println(metricsArray);
    }
}