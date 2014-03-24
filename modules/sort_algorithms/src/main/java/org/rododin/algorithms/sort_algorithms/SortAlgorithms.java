/*
 * SortAlgorithms.java
 */

package org.rododin.algorithms.sort_algorithms;

import java.util.ArrayList;

import org.rododin.algorithms.sort_algorithms.algorithms.SelectionSort;

/**
 * The main application class.
 *
 * @author Rod Odin
 */
public class SortAlgorithms
{
  public static final int DEF_DATA_SIZE = 50;
  public static final int DEF_MAX_VALUE = 100;


  public static void main(String[] args)
  {
    sortBy(new SelectionSort());
    //sortBy(new InsertionSort());
    //sortBy(new BubbleSort());
    //sortBy(new ShellSort());
  }

  public static void sortBy(SortAlgorithm algorithm)
  {
    final int[] array = new int[DEF_DATA_SIZE];
    final ArrayList<Integer> list = new ArrayList<Integer>(DEF_DATA_SIZE);

    Utils.provideRandomData(array, DEF_MAX_VALUE);
    Utils.provideRandomData(list, DEF_DATA_SIZE, DEF_MAX_VALUE);

    System.out.println("Initial array: " + Utils.toString(array));
    int itCount = algorithm.sort(array);
    System.out.println("Sorted: itCount=" + itCount + ", array=" + Utils.toString(array));

    System.out.println("\n");

    System.out.println("Initial list: " + list);
    itCount = algorithm.sort(list);
    System.out.println("Sorted: itCount=" + itCount + ", list=" + list);
  }
}