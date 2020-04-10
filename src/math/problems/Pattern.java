package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int num=100, n=10;
		while (num>=90){
			System.out.println(num+ " ");
			num--;
		}
		num++;
		for(int i=0; i<n;i++){
			System.out.println(num-2+ " ");
			num -=2;
		}
		for(int i=0;i<n;i++){
			System.out.println(num-3+ " ");
			num -=3;
		}
		for(int i=0;i<n;i++){
			if(i<9){
				System.out.println(num-4+ " ");
				num -=4;
			}else
				System.out.println(num -=4);
		}
		


	}
}
