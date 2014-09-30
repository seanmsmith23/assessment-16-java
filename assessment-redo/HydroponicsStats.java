import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HydroponicsStats {
    private List<RecordedMetric> metrics;
    private SortedContainers sorted;

    public HydroponicsStats (List<RecordedMetric> parsedMetrics) {
        metrics = parsedMetrics;
    }

    public List<Container> sortByContainer () {
        SortedContainers sorted = new SortedContainers(metrics);

        Container one = new Container("container1");
        Container two = new Container("container2");
        Container three = new Container("container3");

        sorted.addContainer(one);
        sorted.addContainer(two);
        sorted.addContainer(three);

        List<Container> sortedWithMetrics = sorted.getContainers();

        return sortedWithMetrics;
    }

    public List<AveragedContainer> averageAllContainers(){
        List<AveragedContainer> containersWithAverages = new ArrayList<AveragedContainer>();
        List<Container> sortedContainers = sortByContainer();

        for (Container container : sortedContainers) {
            containersWithAverages.add(averageSingleContainer(container));
        }

        return containersWithAverages;
    }

    private AveragedContainer averageSingleContainer(Container container) {
        List<RecordedMetric> metrics = container.getMetrics();
        AveragedContainer avgContainer = new AveragedContainer(container);

        avgContainer.setAveragePh(getAveragesFor("pH", metrics));
        avgContainer.setAverageNutrientSolution(getAveragesFor("nutrientSolution", metrics));
        avgContainer.setAverageTemperature(getAveragesFor("temperature", metrics));
        avgContainer.setAverageWaterLevel(getAveragesFor("waterLevel", metrics));

        return avgContainer;
    }

    private double getAveragesFor(String metricType, List<RecordedMetric> metrics){
        double total = 0.0;
        int count = metrics.size();

        for (RecordedMetric metric : metrics) {
            total = (total + metric.getMeasurement(metricType));
        }

        double average = total/count;
        average = Math.round(average * 100);
        average = average/100;

        return average;
    }

}