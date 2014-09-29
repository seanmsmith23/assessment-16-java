import java.util.HashMap;
import java.util.ArrayList;

public class HydroponicsStats {
    private ArrayList<HashMap<String, String>> metrics;

    public HydroponicsStats (ArrayList<HashMap<String,String>> parsedMetrics) {
        metrics = parsedMetrics;
    }

    public HashMap<String,ArrayList<HashMap<String,String>>> sortByContainer () {
        HashMap<String,ArrayList<HashMap<String,String>>> byContainer = new HashMap<String,ArrayList<HashMap<String,String>>>();
        byContainer.put("container1", new ArrayList<HashMap<String,String>>());
        byContainer.put("container2", new ArrayList<HashMap<String,String>>());
        byContainer.put("container3", new ArrayList<HashMap<String,String>>());

        for (HashMap<String,String> record : metrics ) {
            if ( record.get("container").equals("container1") ) {
                byContainer.get("container1").add(record);
            } else if ( record.get("container").equals("container2") ) {
                byContainer.get("container2").add(record);
            } else if ( record.get("container").equals("container3") ) {
                byContainer.get("container3").add(record);
            }
        }
        return byContainer;
    }
}