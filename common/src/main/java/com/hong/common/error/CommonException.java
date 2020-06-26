package com.hong.common.error;

/**
 * @Author : KongJHong
 * @Date : 2020-06-25 19:56
 * @Version : 1.0
 * Description     : 自定义异常类
 */
public class CommonException extends Exception implements CommonError {

    private CommonError commonError;

    public CommonException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    //接收自定义errMsg的构造方法
    public CommonException(CommonError commonError,String errMsg){
        super();
        this.commonError = commonError;
        setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
