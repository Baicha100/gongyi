package com.example.demo.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetRequest {

    /**
     * @Name:           GET
     * @Description:    GET请求
     * @Author:         johson
     * @Params:         [requestUrl]
     * @Return:         java.lang.String
     * @CreateDate:     2019/5/12 0012
     */
    public static String GET(String requestUrl) {

        //1.定义变量：result、BufferedReader、InputStream、InputStreamReader
        String result = "";
        BufferedReader in = null;
        InputStream is = null;
        InputStreamReader isr = null;
        //2.创建URL连接
        try {
            URL realUrl = new URL(requestUrl);
            URLConnection conn = realUrl.openConnection();
            conn.connect();
            //3.初始化：BufferedReader、InputStream、InputStreamReader
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            in = new BufferedReader(isr);
            //4.读取返回的结果
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("Get请求失败"+e);
            //5.关闭连接
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (is != null) {
                    is.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (Exception e2) {
            }
        }
        //6.返回结果
        return result;
    }
}
