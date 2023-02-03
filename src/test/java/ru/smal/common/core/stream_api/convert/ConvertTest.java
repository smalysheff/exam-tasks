package ru.smal.common.core.stream_api.convert;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.common.core.stream_api.convert.ConvertArrayToList;

import java.util.List;

class ConvertArrayToListTest {

    public ConvertArrayToList convert;

    @BeforeEach
    void setUpt() {
        convert = new ConvertArrayToList();
    }

    @Test
    void convertUseStream() {
        List<Integer> nums = convert.convertUseStream(new int[]{1, 2, 3});
        Assertions.assertThat(nums).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    void convertUseIntStream() {
        List<Integer> nums = convert.convertUseIntStream(new int[]{1, 2, 3});
        Assertions.assertThat(nums).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    void convertUseForLoop() {
        List<Integer> nums = convert.convertUseForLoop(new int[]{1, 2, 3});
        Assertions.assertThat(nums).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    void convertUseWhileLoop() {
        List<Integer> nums = convert.convertUseWhileLoop(new int[]{1, 2, 3});
        Assertions.assertThat(nums).isEqualTo(List.of(1, 2, 3));
    }
}