package com.epi.java.blog_common.common.result;

import java.io.Serializable;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
public interface Result<T> extends Serializable {


    T getData();

    void setData(T val);

    ReStatus getError();

    void setError(ReStatus val);
}
