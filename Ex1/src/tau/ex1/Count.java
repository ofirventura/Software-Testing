package tau.ex1;

public class Count {
	
	public static void main(String[] args) {
		System.out.println(count(new int[3]));
	}
	public static int count(int[] numbers) {
		int count=0;
		for(int i=0; i<numbers.length; i++) {
			int x = numbers[i];
			if( x < 0) {
				if (x == -1 && i > 0 && numbers[i-1] == -1) {
					break;
				}
			} else {
				count++;
			}
		}
		return count;
	}
}
