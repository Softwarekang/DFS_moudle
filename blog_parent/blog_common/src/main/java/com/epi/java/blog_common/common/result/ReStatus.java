package com.epi.java.blog_common.common.result;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
public class ReStatus {

    private static final long serialVersionUID = 1L;

    public static final int RE_ERROR = 1;
    public static final int RE_SUCCESS = 0;

    public static final int STATUS_500 = 500;
    public static final int STATUS_200 = 200;
    public static final int STATUS_404 = 404;
    public static final int STATUS_409 = 409;

    private Integer returnCode;

    private String returnMessage;

    private String returnUserMessage;


    public ReStatus(Integer returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.returnUserMessage = returnMessage;
    }

    public ReStatus(Integer returnCode, String returnMessage,String returnUserMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.returnUserMessage = returnUserMessage;
    }


    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnUserMessage() {
        return returnUserMessage;
    }

    public void setReturnUserMessage(String returnUserMessage) {
        this.returnUserMessage = returnUserMessage;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

}
