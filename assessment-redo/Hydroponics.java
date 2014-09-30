import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Hydroponics {
    public static void main( String[] args) {
        MetricsParser metrics = new MetricsParser("metrics.tsv");
        List<RecordedMetric> metricsArray = metrics.parsingTheFile();
//        SortedContainers

//        System.out.println(metricsArray.get(0));
//        for (RecordedMetric metric : metricsArray) {
//            System.out.println(metric.getPh());
//        }

        HydroponicsStats hydroStats = new HydroponicsStats(metricsArray);
//        SortedContainers sorted = hydroStats.sortByContainer();

        List<AveragedContainer> averagedContainers = hydroStats.averageAllContainers();

        for (AveragedContainer avg : averagedContainers) {
            System.out.println(avg.averagePh());
            System.out.println(avg.averageNutrientSolution());
            System.out.println(avg.averageTemperature());
            System.out.println(avg.averageWaterLevel());
            System.out.println("***********************");
        }
        System.out.println(averagedContainers);

//        HashMap<String,ArrayList<HashMap<String,String>>> x = hydroStats.sortByContainer();
//        System.out.println(x);

    }
}