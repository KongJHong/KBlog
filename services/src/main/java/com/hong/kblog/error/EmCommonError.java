package com.hong.kblog.error;

import com.hong.common.error.CommonError;

/**
 * @Author : KongJHong
 * @Date : 2020-06-26 11:37
 * @Version : 1.0
 * Description     : 项目的错误编码
 */
public enum EmCommonError implements CommonError {
    SUCCESS(20000,"操作成功"),
    UNKNOWN_ERROR(20001,"未知错误");

    private int errCode;
    private String errMsg;

    EmCommonError(int errCode,String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
