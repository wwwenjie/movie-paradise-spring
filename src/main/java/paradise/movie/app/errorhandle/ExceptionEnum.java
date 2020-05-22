package paradise.movie.app.errorhandle;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
    MOVIE_NOT_FOUND(40001, "The movie you requested cannot be found", HttpStatus.NOT_FOUND),
    PARAMS_ERROR(40002, "Params error", HttpStatus.NOT_ACCEPTABLE);

    private Integer code;
    private String error;
    private HttpStatus httpStatus;

    ExceptionEnum(int code, String error, HttpStatus status) {
        this.code = code;
        this.error = error;
        this.httpStatus = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
