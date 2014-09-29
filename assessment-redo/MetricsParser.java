import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class MetricsParser
{
    private String fileName;

    public MetricsParser(String file) {
        fileName = file;
    }

    public ArrayList<HashMap<String,String>> parsingTheFile() {
            ArrayList<HashMap<String, String>> parsedMetrics = new ArrayList<HashMap<String, String>>();
        try {
            FileReader inputFile = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                HashMap<String, String> converted = convertLineToMetricHash(line);
                parsedMetrics.add(converted);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return parsedMetrics;
    }

    private HashMap<String, String> convertLineToMetricHash (String line) {
        String[] splitMetric = line.split("\t");

        HashMap<String, String> metricHash = new HashMap<String, String>();

        metricHash.put("timestamp", splitMetric[0]);
        metricHash.put("container", splitMetric[1]);
        metricHash.put("pH", splitMetric[2]);
        metricHash.put("nutrientSolution", splitMetric[3]);
        metricHash.put("temperature", splitMetric[4]);
        metricHash.put("waterLevel", splitMetric[5]);

        return metricHash;
    }
}