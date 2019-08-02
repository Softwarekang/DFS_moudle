package com.epi.java.blog_common.common.result;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
public class SuccessResult<T> extends AbstractResult<T> {
    public SuccessResult(ReStatus error, T data) {
        super(error, data);
    }

    public SuccessResult(ReStatus error) {
        super(error, null);
    }
}
