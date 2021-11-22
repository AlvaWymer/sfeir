package com.sfeir.service;

import com.sfeir.AbstractTest;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Math Service Test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SplitServiceTest extends AbstractTest {
    @Autowired
    private IMathService mathService;

    //    @MockBean
    //    private OmsTerminalMappingsRepository omsTerminalMappingsRepository;
    //    Mockito.when(omsTerminalMappingsRepository.findAllByPrefix2(any())).thenReturn(terminalMappings);

    @Test
    @Order(1)
    @DisplayName("1. Test for add")
    void add() {
//        int add = mathService.mathOperation("ADD", 3, 4);
//        assertEquals(7, result);
    }

//    /**
//     * @description partition([1, 2, 3, 4, 5], 2) return: [ [1,2], [3,4], [5] ]
//     * @method partitionVolumeTwo
//     * @date 2020-05-02 15:18:42
//     * @author Yang Naihua
//     */
//    private void partitionVolumeTwo(List<Integer> data, Integer volume) {
//        List<List<Integer>> result = Arrays.asList(
//                Arrays.asList(1, 2),
//                Arrays.asList(3, 4),
//                Collections.singletonList(5));
//
//        // result
//        assertEquals(result, splitArrayService.partition(data, volume));
//    }
//
//    /**
//     * @description partition([1, 2, 3, 4, 5], 3) retourne: [ [1,2,3], [4,5] ]
//     * @method partitionVolumeThree
//     * @date 2020-05-02 15:18:51
//     * @author Yang Naihua
//     */
//    private void partitionVolumeThree(List<Integer> data, Integer volume) {
//        List<List<Integer>> result = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5));
//
//        // result
//        assertEquals(result, splitArrayService.partition(data, volume));
//    }
//
//    /**
//     * @description partition([1, 2, 3, 4, 5], 1) retourne: [ [1], [2], [3], [4], [5] ]
//     * @method partitionVolumeOne
//     * @date 2020-05-02 15:19:00
//     * @author Yang Naihua
//     */
//    private void partitionVolumeOne(List<Integer> data, Integer volume) {
//        List<List<Integer>> result = Arrays.asList(
//                Collections.singletonList(1),
//                Collections.singletonList(2),
//                Collections.singletonList(3),
//                Collections.singletonList(4),
//                Collections.singletonList(5));
//
//        // result
//        assertEquals(result, splitArrayService.partition(data, volume));
//    }

}