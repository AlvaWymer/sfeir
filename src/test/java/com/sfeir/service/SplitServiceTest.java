package com.sfeir.service;

import com.sfeir.AbstractTest;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @className: SplitServiceTest
 * @description:
 * @author: Yang Naihua
 * @create: 2020-05-02 14:59
 **/
@DisplayName("Split Service Test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SplitServiceTest extends AbstractTest {
    @Autowired
    private ISplitArrayService splitArrayService;

    //    @MockBean
    //    private OmsTerminalMappingsRepository omsTerminalMappingsRepository;
    //    Mockito.when(omsTerminalMappingsRepository.findAllByPrefix2(any())).thenReturn(terminalMappings);

    @Test
    @Order(1)
    @DisplayName("1. Step 1")
    void partition() {
        partitionVolumeTwo(Arrays.asList(1, 2, 3, 4, 5), 2);
        partitionVolumeThree(Arrays.asList(1, 2, 3, 4, 5), 3);
        partitionVolumeOne(Arrays.asList(1, 2, 3, 4, 5), 1);
    }

    /**
     * @description partition([1, 2, 3, 4, 5], 2) return: [ [1,2], [3,4], [5] ]
     * @method partitionVolumeTwo
     * @date 2020-05-02 15:18:42
     * @author Yang Naihua
     */
    private void partitionVolumeTwo(List<Integer> data, Integer volume) {
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Collections.singletonList(5));

        // result
        assertEquals(result, splitArrayService.partition(data, volume));
    }

    /**
     * @description partition([1, 2, 3, 4, 5], 3) retourne: [ [1,2,3], [4,5] ]
     * @method partitionVolumeThree
     * @date 2020-05-02 15:18:51
     * @author Yang Naihua
     */
    private void partitionVolumeThree(List<Integer> data, Integer volume) {
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5));

        // result
        assertEquals(result, splitArrayService.partition(data, volume));
    }

    /**
     * @description partition([1, 2, 3, 4, 5], 1) retourne: [ [1], [2], [3], [4], [5] ]
     * @method partitionVolumeOne
     * @date 2020-05-02 15:19:00
     * @author Yang Naihua
     */
    private void partitionVolumeOne(List<Integer> data, Integer volume) {
        List<List<Integer>> result = Arrays.asList(
                Collections.singletonList(1),
                Collections.singletonList(2),
                Collections.singletonList(3),
                Collections.singletonList(4),
                Collections.singletonList(5));

        // result
        assertEquals(result, splitArrayService.partition(data, volume));
    }

}