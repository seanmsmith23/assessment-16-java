import java.util.List;
import java.util.ArrayList;

public class Container {
    private String containerName;
    private List<RecordedMetric> containerMetrics = new ArrayList<RecordedMetric>();

    public Container(String name){
        containerName = name;
    }

    public String getContainerName(){
        return containerName;
    }

    public void addMetric(RecordedMetric metric){
        containerMetrics.add(metric);
    }

    public List<RecordedMetric> getMetrics () {
        return containerMetrics;
    }
}