package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoLikesItTest {
    @Test
    public void staticTests(){
        assertEquals("no one likes this",WhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this",WhoLikesIt.whoLikesIt("Peter"));
    }

}