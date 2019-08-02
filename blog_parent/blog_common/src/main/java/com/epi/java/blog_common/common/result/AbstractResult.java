package com.epi.java.blog_common.common.result;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
public class AbstractResult<T> implements Result<T> {

    protected ReStatus error;

    protected T data;

    public AbstractResult(ReStatus error, T data) {
        this.error = error;
        this.data = data;
    }

    public AbstractResult() {}

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setData(T val) {
        this.data = val;
    }

    @Override
    public ReStatus getError() {
        return this.error;
    }

    @Override
    public void setError(ReStatus val) {
        this.error = val;
    }
}
