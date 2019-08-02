package com.epi.java.blog_common.common.result;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
public class FailResult<T> extends AbstractResult<T> {
    public FailResult(ReStatus status, T val) {
        super(status, val);
    }

    public FailResult(ReStatus status) {
        super(status, (T)"");
    }
}
