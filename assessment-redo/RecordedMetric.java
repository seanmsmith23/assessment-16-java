public class RecordedMetric {

    private String[] metrics;

    public RecordedMetric (String[] metricArray) {
        metrics = metricArray;
    }

    public double getMeasurement(String metricType) {
        double measurement;
        if (metricType.equals("pH")) {
            measurement = getPh();
        } else if (metricType.equals("nutrientSolution")) {
            measurement = getNutrientSolution();
        } else if (metricType.equals("temperature")) {
            measurement = getTemperature();
        } else if (metricType.equals("waterLevel")) {
            measurement = getWaterLevel();
        } else {
            measurement = 10000000;
        }
        return measurement;
    }

    public String getTimeStamp() {
        return metrics[0];
    }

    public String getContainer() {
        return metrics[1];
    }

    public double getPh() {
        double ph = Double.parseDouble(metrics[2]);
        return ph;
    }

    public double getNutrientSolution() {
        double nutrientSolution = Double.parseDouble(metrics[3]);
        return nutrientSolution;
    }

    public double getTemperature() {
        double temperature = Double.parseDouble(metrics[4]);
        return temperature;
    }

    public double getWaterLevel() {
        double waterLevel = Double.parseDouble(metrics[5]);
        return waterLevel;
    }

}