/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
if they are in wrong order.
 */

package bubblesort;

public class BubbleSort {

    public int[] sort(int[] tab){
        for (int i = tab.length-1; i > 0; i--){
            if (tab[i] < tab[i-1]) {
                int tmp = tab[i];
                tab[i] = tab[i-1];
                tab[i-1] = tmp;
            }
        }

        return tab;
    }

}
