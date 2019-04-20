package com.collagehelper.controller;

import com.collagehelper.error.BussinessException;
import com.collagehelper.error.EmBussinessError;
import com.collagehelper.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex){
        Map<String,Object> responseData = new HashMap<>();
        if (ex instanceof BussinessException){
            BussinessException bussinessException = (BussinessException)ex;
            responseData.put("errCode",bussinessException.getErrCode());
            responseData.put("errMsg",bussinessException.getErrMsg());
        }else {
            responseData.put("errCode", EmBussinessError.UNKOWN_ERROR.getErrCode());
            responseData.put("errMsg",EmBussinessError.UNKOWN_ERROR.getErrMsg());
        }
        return CommonReturnType.create("fail",responseData);
    }
}
