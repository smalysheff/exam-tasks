package ru.smal.any_tasks.map_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BatchCollection {

    public  List<List<Integer>> batches(Set<Integer> ids, int batchSize) {
        return IntStream.range(0, ids.size())
                .filter(i -> i % batchSize == 0)
                .mapToObj(i -> new ArrayList<>(ids).subList(i, Math.min(i + batchSize, ids.size())))
                .toList();
    }

    public List<HashSet<Integer>> batchesV2(Set<Integer> ids, int batchSize) {
        List<Integer> idList = new ArrayList<>(ids);
        return idList.stream()
                .collect(Collectors.groupingBy(i -> Math.floor((double) idList.indexOf(i) / batchSize)))
                .values().stream()
                .map(HashSet::new)
                .toList();
    }

}


//import java.util.*;
//
//        import java.util.stream.Collectors;
//
//
//
//public class BatchSplitter {
//
//
//
//    public static List&lt;Set&gt; batches(Set&lt;Integer&gt; ids, int batchSize) {
//
//        return new ArrayList&lt;&gt;(ids).stream()
//
//                .collect(Collectors.groupingBy(s -&gt; (int) Math.floor(new ArrayList&lt;&gt;(ids).indexOf(s) / batchSize)))
//
//                .values().stream()
//
//                .map(HashSet::new)
//
//                .collect(Collectors.toList());
//
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Set&lt;Integer&gt; ids = new HashSet&lt;&gt;(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//
//        int batchSize = 3;
//
//        List&lt;Set&gt; batches = batches(ids, batchSize);
//
//
//
//        for (Set batch : batches) {
//
//            System.out.println(batch);
//
//        }
//
//    }
//
//}

