/*
 *
 * =======================================================================
 *
 * Copyright (c) 2009-2021 Sony Network Entertainment International, LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Sony Network Entertainment International, LLC.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with
 * Sony Network Entertainment International, LLC.
 *
 * =======================================================================
 *
 * For more information, please see http://www.sony.com/SCA/outline/corporation.shtml
 *
 */

package Lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main( String[] args ) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};
        final int W = 7; //volume of rucksack

        //sorting O(n*log(n))
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        int weightSoFar = 0; //current weight
        int valueSoFar = 0; //current walue
        int currentItem = 0; //current item in rucksack

        while (currentItem < items.length && weightSoFar != W) { //while < then length of allItemsArray and currentWeight != weight
            if (weightSoFar + items[currentItem].getWeight() < W) { //if currentWeight + weight of current item < volume
                //take object fully
                valueSoFar += items[currentItem].getValue(); //we can put object fully
                weightSoFar += items[currentItem].getWeight(); //and it's value will be fully
            } else {
                //take part of object
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) * items[currentItem].getValue();
                //(how much value left / weight of current item) * value of current item
                weightSoFar = W; //our rucksack is full -> current weight == volume
            }
            currentItem++; //do it for each item in array
        }

        System.out.println("Value of the best set: " + valueSoFar);
    }


}

class Item {
    private int weight;
    private int value;

    public Item( int weight, int value ) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight( int weight ) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue( int value ) {
        this.value = value;
    }

    public String toString() {
        return "{w: " + weight  + "; v: " + value + "}";
    }
}
