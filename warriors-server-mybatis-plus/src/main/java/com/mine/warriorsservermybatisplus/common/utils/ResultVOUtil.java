package com.mine.warriorsservermybatisplus.common.utils;


import com.mine.warriorsservermybatisplus.common.ResultVO;

import java.util.HashMap;
import java.util.Map;


public class ResultVOUtil {

    public static ResultVO<?> returnSuccess(Object object) {
        ResultVO<Object> resultVO = new ResultVO<Object>();
        resultVO.setCode(200);
        resultVO.setMsg("success");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO<?> returnSuccess(String key, Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("success");
        Map<String, Object> map = new HashMap<>();
        map.put(key, object);
        resultVO.setData(map);
        return resultVO;
    }

    public static ResultVO<?> returnSuccess() {
        return returnSuccess(null);
    }

    public static ResultVO<?> returnFail(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

//    public static ResultVO<?> returnFail() {
//        return returnFail(ResultEnum.FAIL);
//    }
//
//    public static ResultVO<?> returnFail(ResultEnum resultEnum) {
//        ResultVO resultVO = new ResultVO();
//        resultVO.setCode(resultEnum.getCode());
//        resultVO.setMsg(resultEnum.getMessage());
//        return resultVO;
//    }
}
