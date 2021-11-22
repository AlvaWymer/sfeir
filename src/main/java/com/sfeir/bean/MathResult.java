package com.sfeir.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @className: MathResult
 * @description: Match Result
 * @author: Yang Naihua
 * @create: 2021-11-22 11:40
 **/
@Data
public class MathResult {
    @ApiModelProperty(value = "Math Result")
    private Integer result;

//    public void setResult(Integer result) {
//        this.result = result;
//    }

    public MathResult(Integer result) {
        this.result = result;
    }
}