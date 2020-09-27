package com.studio3104.leetcode.contest.weekly208.ThroneInheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThroneInheritanceTest {
    @Test
    void getInheritanceOrder() {
        ThroneInheritance t= new ThroneInheritance("king"); // order: king
        t.birth("king", "andy"); // order: king > andy
        t.birth("king", "bob"); // order: king > andy > bob
        t.birth("king", "catherine"); // order: king > andy > bob > catherine
        t.birth("andy", "matthew"); // order: king > andy > matthew > bob > catherine
        t.birth("bob", "alex"); // order: king > andy > matthew > bob > alex > catherine
        t.birth("bob", "asha"); // order: king > andy > matthew > bob > alex > asha > catherine
        Assertions.assertEquals(List.of("king", "andy", "matthew", "bob", "alex", "asha", "catherine"), t.getInheritanceOrder());
        t.death("bob"); // order: king > andy > matthew > bob > alex > asha > catherine
        Assertions.assertEquals(List.of("king", "andy", "matthew", "alex", "asha", "catherine"), t.getInheritanceOrder());
    }
}