package JavaOutputChecking;

public class Item1 {

	public static void main(String[] args) {
		int sum = 0;

		for(int i = 1; i <= 3; i++)
		{
		sum += i;
		}

		System.out.println(sum);
		
		int[] numbers = {4, 8, 12};
		System.out.println(numbers[2]);
		
		for(int i = 0; i < 4; i++)
		{
		System.out.println(i);
		}
		
		int x = 7;

		if(x % 2 == 0)
		System.out.println("Even");
		else
		System.out.println("Odd");
		
		int[] nums = {10, 20, 30};
		System.out.println(nums[1]);


	}

}
