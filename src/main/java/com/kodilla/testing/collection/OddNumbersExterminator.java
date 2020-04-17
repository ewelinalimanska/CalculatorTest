package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> OddNumbersList = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                OddNumbersList.add(number);
            }
        }
        return OddNumbersList;
    }
}
