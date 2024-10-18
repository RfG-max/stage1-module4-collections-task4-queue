package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> resultList = new ArrayList<>();
        Deque<Integer> linkedListDeque = new LinkedList<>();
        int i = 1;
        int j = 1;
        while (i <= numberOfDishes){
            linkedListDeque.add(i);
            i++;
        }
        while (linkedListDeque.size()!=0||linkedListDeque.size()>=everyDishNumberToEat){
            while (j!=everyDishNumberToEat){
                linkedListDeque.offer(linkedListDeque.poll());
                j++;
            }
            j=1;
            resultList.add(linkedListDeque.poll());
        }
        resultList.addAll(linkedListDeque);
        return resultList;
    }
}
