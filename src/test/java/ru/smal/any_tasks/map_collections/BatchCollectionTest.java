package ru.smal.any_tasks.map_collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class BatchCollectionTest {

    BatchCollection collection = new BatchCollection();

    @Test
    void batches() {
        List<List<Integer>> batches = collection.batches(getSet(), 3);
        System.out.println(batches);
        Assertions.assertEquals(4, batches.size());
    }

    @Test
    void batchesV2() {
        List<HashSet<Integer>> batches = collection.batchesV2(getSet(), 25);
        System.out.println(getSet().size());
        System.out.println(batches.size());
        System.out.println(batches);
        Assertions.assertEquals(40, batches.size());
    }

    private Set<Integer> getSet() {
        return IntStream.range(0, 1000)
                .boxed()
                .collect(Collectors.toSet());
    }
}