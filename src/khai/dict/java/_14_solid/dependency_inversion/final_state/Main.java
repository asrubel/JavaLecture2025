package khai.dict.java._14_solid.dependency_inversion.final_state;

public class Main {
    public static void main(String[] args) {
        ComplexDataFetcher fetcher = new ComplexDataFetcher();
        DataProcessor processor = new DataProcessor(fetcher);
        processor.process();
    }
}
