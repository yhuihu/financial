package xyz.yhhu.financial.exception;

/**
 * @author Tiger
 * @date 2020-06-17
 * @see xyz.yhhu.financial.exception
 **/
public enum ExceptionStatus {
    /**
     * 未知错误
     */
    UNKNOWN(-1, "未知错误"),
    /**
     * 参数错误
     */
    VALID(20003, "参数错误");

    private Integer code;

    private String message;

    ExceptionStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getMessage(int code) {
        for (ExceptionStatus status : values()) {
            if (status.getCode().equals(code)) {
                return status.getMessage();
            }
        }
        return null;
    }
}
