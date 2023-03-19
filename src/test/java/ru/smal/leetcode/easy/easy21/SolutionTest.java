package ru.smal.easy.easy21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void mergeTwoListsNullArgs() {
        assertNull(solution.mergeTwoLists(null, null));

    }

    @Test
    void mergeTwoListNullArg1() {
        ListNode expected = new ListNode();
        ListNode node = expected;

        assertEquals(expected, solution.mergeTwoLists(null, node));
        assertEquals(expected, solution.mergeTwoLists(node, null));
    }

    @Test
    void mergeTwoLists() {
        ListNode actual = solution.mergeTwoLists(buildListNode1(), buildListNode2());
        ListNode expected = buildMergeListNode();

        while (Objects.nonNull(expected.next)) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    private ListNode buildListNode1() {
        ListNode node2 = new ListNode(4, null);
        ListNode node1 = new ListNode(2, node2);

        return new ListNode(1, node1);
    }

    private ListNode buildListNode2() {
        ListNode node2 = new ListNode(4, null);
        ListNode node1 = new ListNode(3, node2);

        return new ListNode(1, node1);
    }

     private ListNode buildMergeListNode() {
        ListNode node5 = new ListNode(4, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        return new ListNode(1, node1);
     }
}