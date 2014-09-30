import java.util.List;
import java.util.ArrayList;

public class SortedContainers {
    private List<Container> containers = new ArrayList<Container>();
    private List<RecordedMetric> metrics;

    public SortedContainers (List<RecordedMetric> givenMetrics) {
        metrics = givenMetrics;
    }

    private void sortMetricsIntoContainers () {
        for (RecordedMetric metric : metrics) {
            addRecordToContainer(metric);
        }
    }

    public void addContainer (Container newContainer) {
        containers.add(newContainer);
    }

    private void addRecordToContainer (RecordedMetric metric) {
        for (Container container : containers){
            if (container.getContainerName().equals(metric.getContainer())) {
                container.addMetric(metric);
            }
        }
    }

    public List<Container> getContainers(){
        sortMetricsIntoContainers();
        return containers;
    }

}