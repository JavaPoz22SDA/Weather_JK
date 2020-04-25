package pl.sda.weather;

public class Request {

    private String type;
    private  String query;

    public Request(){}


    public Request(String type, String query) {
        this.type = type;
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public String getQuery() {
        return query;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
