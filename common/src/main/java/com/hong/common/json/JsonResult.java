package com.hong.common.json;

import com.hong.common.error.CommonError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author : KongJHong
 * @Date : 2020-06-25 19:52
 * @Version : 1.0
 * Description     : 统一的json返回格式
 */
@Data
@ToString
@ApiModel(value="返回数据")
@SuppressWarnings("all")
public class JsonResult<T> {

    @ApiModelProperty(value = "返回数据")
    private T data;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String msg;

    private JsonResult(){
    }

    private JsonResult(Integer code,String msg){
        this(code,msg,null);
    }

    private JsonResult(Integer code,String msg,T jsonData){
        this.code = code;
        this.msg = msg;
        this.data = jsonData;
    }

    public static<T> JsonResult ok(CommonError commonError){
        return data(commonError,null);
    }

    public static<T> JsonResult error(CommonError commonError){
        return data(commonError,null);
    }

    public static<T> JsonResult error(Integer code,String msg){
        return new JsonResult(code,msg);
    }

    public static<T> JsonResult data(CommonError commonError,T jsonData){
        JsonResult jsonResult = new JsonResult();
        jsonResult.msg = commonError.getErrMsg();
        jsonResult.code = commonError.getErrCode();
        jsonResult.data = jsonData;
        return jsonResult;
    }

}
