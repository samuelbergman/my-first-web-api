package dio.web.api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Object... params) {
        super(String.format(message, params));
    }

    public Object[] getParams() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getParams'");
    }
}