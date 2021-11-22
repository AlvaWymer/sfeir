package com.sfeir.service;

import com.sfeir.bean.MathOperation;
import com.sfeir.bean.MathResult;

public interface IMathService {
//    Integer mathOperation(String operation, Integer firstNumber, Integer secondNumber);

    MathResult mathOperationByObject(MathOperation operation, Integer firstNumber, Integer secondNumber);
//    MathResult mathOperationByObject(MathOperation operation);

//    MathResult mathOperationByObject(MathOperation operation, Integer firstNumber, Integer secondNumber);
//    Integer sub(Integer firstNumber, Integer secondNumber);
//    Integer add(Integer firstNumber, Integer secondNumber);
//    Integer add(Integer firstNumber, Integer secondNumber);
}
