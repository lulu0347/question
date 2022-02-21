
public class Question {
	
	public static void main(String[] args) {
		
		//統計能被3或7整除的數字
		int divisible_Count = 0;
		//統計不能同時被3與7整除的數字
		int Not_divisible_Count = 0;
		
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				divisible_Count++;
			} else if (i % 3 != 0 && i % 7 != 0) {
				Not_divisible_Count++;
			}
		}
		System.out.println("能被3或7整除數量 : " + divisible_Count);
		System.out.println("不能同時被3與7整除數量 : " + Not_divisible_Count);
	}
}
