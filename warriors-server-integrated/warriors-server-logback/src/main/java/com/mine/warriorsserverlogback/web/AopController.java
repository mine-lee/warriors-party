package com.mine.warriorsserverlogback.web;

import com.mine.warriorsservercommon.pojo.ResultVO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: warriors-party
 * @description: Aop测试类
 * @author: Mine.Lee
 * @create: 2019-01-19 21:21
 * @version: v1.0
 * @remark: ..
 */
@RestController
public class AopController {

    @RequestMapping("test1")
    public Object hello1() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "张三");
        return map;
    }

    @PostMapping("test2")
    public Object hello2() {
        int i = 1 / 0;
        return "success2";
    }

    @RequestMapping("test3")
    public Object hello3() {
        return null;
    }

    @RequestMapping(value = "test4", method = RequestMethod.POST)
    public Object hello4(ResultVO map) {
        List<ResultVO> list = new ArrayList<>();
        list.add(map);
        return list;
    }

    @RequestMapping(value = "test5", method = RequestMethod.GET)
    public Object hello5(@RequestParam(value = "name") String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "test6", method = RequestMethod.GET)
    public void hello6() {
        System.out.println(System.currentTimeMillis() + "这是一个测试");
    }

}
