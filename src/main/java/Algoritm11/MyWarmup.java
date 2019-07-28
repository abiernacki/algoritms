/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package Algoritm11;

public class MyWarmup implements Warmup {

	@Override
	public int findMax(int[] array) {


		if (array.length == 0){
			return -1;
		}

		int value = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++){
			if (value < array[i]){
				index = i;
				value = array[i];
			}
		}

		return index;


	}
}
