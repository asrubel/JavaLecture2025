package khai.dict.java._14_solid.dependency_inversion.final_state;

public class DataProcessor {
    private final DataFetcher dataProvider;

    public DataProcessor(DataFetcher dataProvider) {
        // check for validation etc
        this.dataProvider = dataProvider;
    }

    void process() {
        String data = dataProvider.fetchData();
        System.out.println("Processing " + data);
    }
}
