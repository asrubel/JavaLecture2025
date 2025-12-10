package khai.dict.java._14_solid.dependency_inversion.final_state;

public class SimpleDataFetcher implements DataFetcher {

    @Override
    public String fetchData() {
        return "The simple data is fetched";
    }
}
