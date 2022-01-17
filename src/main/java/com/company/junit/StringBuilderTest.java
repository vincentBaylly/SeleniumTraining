package com.company.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBuilderTest {

    @Test
    public void stringBuilderAppendShouldConcatinate()  {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String");
        stringBuilder.append("Builder");
        stringBuilder.append("Test");

        assertEquals("StringBuilderTest", stringBuilder.toString());
    }
}