package pl.sda.weather;

public class ApiError {

    private boolean success;
    private Error error;

    public ApiError() {}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
