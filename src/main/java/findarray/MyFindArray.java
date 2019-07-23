/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package findarray;

public class MyFindArray implements FindArray {

	
	public int findArray(int[] array, int[] subArray) {
		int[] tab = new int[subArray.length];
		for (int i = 0; i < subArray.length; i++){
			boolean exist  = false;
			for (int j = 0; j < array.length; j++){
				if (subArray[i] == array[j]){
					exist = true;
					tab[i] = j;
				}
			}
			if (!exist){
				return -1;
			}
		}

		int temp = tab[0];
		for (int i = 0; i < tab.length; i++){
			if (temp > tab[i]){
				return -1;
			} else {
				temp = tab[i];
			}
		}


		return tab[0];
	}
}
