package com.hong.common.error;

/**
 * @Author : KongJHong
 * @Date : 2020-06-25 19:54
 * @Version : 1.0
 * Description     : 统一的错误返回接口
 */
public interface CommonError {
    int getErrCode();
    String getErrMsg();
    CommonError setErrMsg(String errMsg);
}
