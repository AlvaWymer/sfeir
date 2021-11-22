package com.sfeir.controller;

import com.sfeir.bean.MathOperation;
import com.sfeir.bean.MathResult;
import com.sfeir.service.IMathService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Yang Naihua <br>
 * Description:  SplitController<br>
 * @since 2020/02/05<br>
 */
@Slf4j
@RestController
@RequestMapping(value = "/calcul")
public class SplitController {
    @Autowired
    private IMathService mathService;

//    @PostMapping(value = {"/{operation}/{firstNumber}/{secondNumber}"})
//    public Integer mathOperation(
//            @PathVariable("operation") String operation,
//            @PathVariable("firstNumber") Integer firstNumber,
//            @PathVariable("secondNumber") Integer secondNumber) {
//        return mathService.mathOperation(operation, firstNumber, secondNumber);
//    }

    @PostMapping(value = {"/{operation}/{firstNumber}/{secondNumber}"})
    public MathResult mathOperationByObject(
            @PathVariable("operation") MathOperation mathOperation,
            @PathVariable("firstNumber") Integer firstNumber,
            @PathVariable("secondNumber") Integer secondNumber) {
        return mathService.mathOperationByObject(mathOperation, firstNumber, secondNumber);
    }
}

