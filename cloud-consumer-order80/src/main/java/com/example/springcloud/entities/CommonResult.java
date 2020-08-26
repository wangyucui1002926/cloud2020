package com.example.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yucui.wang
 * @date 8/21/2020 5:35 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    Integer code;
    String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
