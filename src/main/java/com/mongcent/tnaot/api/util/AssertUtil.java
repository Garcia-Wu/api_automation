package com.mongcent.tnaot.api.util;

import org.junit.Assert;

public class AssertUtil extends Assert {

    // 比较数值是否相等
    public static void assertNumberValue(Number expected, Number actual){
        assertTrue("The number value is not equals! Expected ["+expected+"], Actual ["+actual+"]",
                expected.doubleValue() == actual.doubleValue());
    }

}
