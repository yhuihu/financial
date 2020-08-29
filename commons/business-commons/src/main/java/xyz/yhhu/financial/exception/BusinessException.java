package xyz.yhhu.financial.exception;

/**
 * @author Tiger
 * @date 2020-06-17
 * @see xyz.yhhu.financial.exception
 **/
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -5691472265585910797L;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {

    }

    public BusinessException(ExceptionStatus status) {
        super(status.getMessage());
        this.code = status.getCode();
    }
}
