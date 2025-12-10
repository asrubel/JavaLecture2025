package khai.dict.java._14_solid.dependency_inversion.final_state;

public class ComplexDataFetcher implements DataFetcher {
    @Override
    public String fetchData() {
        return "The complex data is now fetched";
    }
}
