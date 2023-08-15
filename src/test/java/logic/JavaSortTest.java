package logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class JavaSortTest {

    @Test
    void given_List_Whenxecuting_ThenReturnSortedList(){

        JavaSort<Integer> javaSort = new JavaSort<>();

       List<Integer> actual =  javaSort.sort(List.of(1,2,3,4,5));

       assertEquals(List.of(1,2,3,4,5),actual);
    }

}