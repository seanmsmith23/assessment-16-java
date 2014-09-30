class AveragedContainer {
    private double pH, nutrientSolution, temperature, waterLevel;
    private String containerName;

    public AveragedContainer(Container container) {
        containerName = container.getContainerName();
    }

    public String getContainerName(){
        return containerName;
    }

    public double averagePh() {
        return pH;
    }

    public double averageNutrientSolution() {
        return nutrientSolution;
    }

    public double averageTemperature() {
        return temperature;
    }

    public double averageWaterLevel() {
        return waterLevel;
    }

    public void setAveragePh(double average) {
        pH = average;
    }

    public void setAverageNutrientSolution(double average) {
        nutrientSolution = average;
    }

    public void setAverageTemperature(double average) {
        temperature = average;
    }

    public void setAverageWaterLevel(double average) {
        waterLevel = average;
    }

}
