
public class test {

	public static void main(String[] args) {
		
		int[] array3= {10, 23, 30, 11};
		int taille = array3.length;
		
		for (int i = 2; i < taille; i++) {
			array3[i] = array3[i+1];
			taille = taille -1;
		}
		

			for (int i : array3) {
				System.out.println(i);
				}


	}

}
