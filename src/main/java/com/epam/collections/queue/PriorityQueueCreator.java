package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> resultQueue = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                // Проверяем, являются ли обе строки заглавными или строчными
                boolean s1IsUpper = Character.isUpperCase(s1.charAt(0));
                boolean s2IsUpper = Character.isUpperCase(s2.charAt(0));

                // Сравниваем по типу: строчные перед заглавными
                if (s1IsUpper && !s2IsUpper) {
                    return 1; // s1 (строчная) перед s2 (заглавная)
                } else if (!s1IsUpper && s2IsUpper) {
                    return -1; // s1 (заглавная) после s2 (строчная)
                } else {
                    // Если оба строки одного типа, сравниваем в обратном алфавитном порядке
                    return s2.compareTo(s1);
                }
            }
        }
        );
        resultQueue.addAll(firstList);
        resultQueue.addAll(secondList);
        return resultQueue;
    }
}
