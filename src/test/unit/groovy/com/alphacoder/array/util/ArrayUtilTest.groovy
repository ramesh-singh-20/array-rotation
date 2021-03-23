package com.alphacoder.array.util

import spock.lang.Specification

import java.util.logging.Handler

class ArrayUtilTest extends Specification{

    def 'Test ArrayUtil | Rotate array by 2 elements' (){
        given:
        int[] arr= new int[] {1,2,3,4,5,6}

        when:
        def results= ArrayUtil.rotateArray(arr, 2)

        then:
        results.length== 6
        results[0]== 3
        results[1]== 4
        results[2]== 5
        results[3]== 6
        results[4]== 1
        results[5]== 2


    }
}
