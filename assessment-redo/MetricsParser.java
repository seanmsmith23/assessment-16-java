import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MetricsParser
{
    private String fileName;

    public MetricsParser(String file) {
        fileName = file;
    }

    public List<RecordedMetric> parsingTheFile() {
            List<RecordedMetric> parsedMetrics = new ArrayList<RecordedMetric>();
        try {
            FileReader inputFile = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitMetric = line.split("\t");

                RecordedMetric record = new RecordedMetric(splitMetric);
                parsedMetrics.add(record);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return parsedMetrics;
    }
}