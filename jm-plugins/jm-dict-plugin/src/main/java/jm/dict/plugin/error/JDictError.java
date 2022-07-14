package jm.dict.plugin.error;

public enum JDictError {
    REFLECT_ILLEGAL_ACCESS(40001, "没有访问权限")
    ;

    /**
     * 编码
     */
    private final int code;

    /**
     * 错误消息
     */
    private final String message;

    private JDictError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
