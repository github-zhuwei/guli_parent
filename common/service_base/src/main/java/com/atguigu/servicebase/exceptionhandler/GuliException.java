package com.atguigu.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhuwei
 * @createdate 2021/1/12 - 8:18
 *
 * 自定义异常类
 */
@Data
@AllArgsConstructor//生成有参数的构造方法
@NoArgsConstructor//生成无参构造方法
public class GuliException extends RuntimeException {


    private Integer code;//状态码
    private String msg;//异常信息

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
