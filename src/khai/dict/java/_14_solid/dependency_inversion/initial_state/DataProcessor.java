package khai.dict.java._14_solid.dependency_inversion.initial_state;

public class DataProcessor {
    private final DataFetcher dataFetcher;

    public DataProcessor() {
        this.dataFetcher = new DataFetcher();
    }

    void process() {
        String data = dataFetcher.fetchData();
        System.out.println("Processing " + data);
    }
}
