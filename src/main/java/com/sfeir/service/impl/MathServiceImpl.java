package com.sfeir.service.impl;

import com.sfeir.bean.MathOperation;
import com.sfeir.bean.MathResult;
import com.sfeir.service.IMathService;
import org.springframework.stereotype.Service;

import java.util.regex.MatchResult;

import static com.sfeir.bean.MathOperation.ADD;

/**
 * @className: SplitArrayServiceImpl
 * @description:
 * @author: Yang Naihua
 * @create: 2020-05-02 13:41
 **/
@Service
public class MathServiceImpl implements IMathService {

//    /**
//     * @description: calcul add
//     * @method add
//     * @date 2021-11-22 11:08:01
//     * @author Yang Naihua
//     */
//    @Override
//    public Integer mathOperation(String operation, Integer firstNumber, Integer secondNumber) {
//        return calculMatchCore(operation, firstNumber, secondNumber);
//    }

    @Override
    public MathResult mathOperationByObject(MathOperation operation, Integer firstNumber, Integer secondNumber) {
        Integer result = calculMatchCore(operation, firstNumber, secondNumber);
        return new MathResult(result);
    }

    private Integer calculMatchCore(MathOperation operation, Integer firstNumber, Integer secondNumber) {
        return operation.getCompute().apply(firstNumber, secondNumber);
    }


//    @Override
//    public MathResult mathOperationByObject(String operation, Integer firstNumber, Integer secondNumber) {
//        Integer result = calculMatchCore(operation, firstNumber, secondNumber);
//        return new MathResult(result);
//    }
}