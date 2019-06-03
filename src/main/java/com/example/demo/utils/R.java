package com.example.demo.utils;

import org.springframework.http.HttpStatus;
import java.util.HashMap;
public class R extends HashMap<String,Object> {
    /*
     * 默认ok方法
     * */
    public static R ok(){
        R r = new R();
        r.put("code",HttpStatus.OK.value());
        r.put("msg",HttpStatus.OK.getReasonPhrase());
        return r;
    }

    /*
     * 自定义ok方法
     * */
    public static R ok(int code,String msg){
        R r = new R();
        r.put("code",code);
        r.put("msg",msg);

        return r;
    }

    /*
     * 默认error方法
     * */
    public static R error(){
        R r = new R();
        r.put("code",HttpStatus.INTERNAL_SERVER_ERROR.value());
        r.put("msg",HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());

        return r;
    }

    /*
     * 自定义error方法
     * */
    public static R error(int code,String msg){
        R r = new R();
        r.put("code",code);
        r.put("msg",msg);

        return r;
    }

    /*
     * 调用父类的put方法，实现key,value形式的数据封装
     * */
    public R put(String key,Object value){
        super.put(key,value);
        return this;
    }
}
