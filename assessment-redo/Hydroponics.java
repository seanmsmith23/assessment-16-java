import java.util.HashMap;
import java.util.ArrayList;

public class Hydroponics {
    public static void main( String[] args) {
        MetricsParser metrics = new MetricsParser("metrics.tsv");
        ArrayList<HashMap<String,String>> metricsArray = metrics.parsingTheFile();

        HydroponicsStats hydroStats = new HydroponicsStats(metricsArray);

        HashMap<String,ArrayList<HashMap<String,String>>> x = hydroStats.sortByContainer();
        System.out.println(x);

    }
}