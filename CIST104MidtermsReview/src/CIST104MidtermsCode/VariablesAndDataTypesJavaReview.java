package CIST104MidtermsCode;
public class VariablesAndDataTypesJavaReview {
	
	public static void main (String [] args) {
		
		/* 
		int mindState = 25;
		int durability = 50;
		int stamina = 73;
		
		double peso = 35.8;
		
		char enemyGrade = 'A';
		boolean isEnemy = false;
		
		String playCharacter = "LUCIDUS IS A PLAYABLE CHARACTER";
		String denEmail = "marcrodenfamero@gmail.com";
		
		System.out.println("THE MINDSTATE IS: " + mindState);
		System.out.println("LUCIDUS DURABILITY IS: " + durability);
		System.out.println("THE STAMINA IS: " + stamina);
		System.out.println(peso);
		System.out.println(enemyGrade);
		
		System.out.println("IS CALIGO AN ENEMY: " + isEnemy);
		
		if (isEnemy == true) {
			System.out.println("THERE IS AN ENEMY!");
		}
		else {
			System.out.println("THERE IS NO ENEMY");
		}
		
		System.out.println(playCharacter + " TRAINED IN THE THEOCRATIC ORPHANAGE");
		System.out.println("CONTACT THE EMAIL: " + denEmail + " FOR MORE QUESTIONS");
		
		*/
		
		
		
		String productName = " SONIC Wireless Headphone 3.5";
		String brandName = "SoundSonic Max";
		String colorName = "Matte Black";
		
		char pesoSign = '₱';
		
		double price = 1500.999;
		int stock = 55;
		boolean isAvailable;
		
		System.out.println("Product: " + productName);
		System.out.println("Brand: " + brandName);
		System.out.println("Color: " + colorName);
		
		System.out.println("");
		
		System.out.println("Price: "  + pesoSign + price);
		System.out.println("Stock Quantity: " + stock);
		
		System.out.println("");
		
		if (stock >= 55) {
			isAvailable = true;	
		}
		
		else {
			isAvailable = false;
			
		}
		
		if (isAvailable == true) {
			System.out.println("The product is available for purchase");
		}
		else {
			System.out.println("THE PRODUCT IS NOT AVAILABLE!");
			
		}
		
			
		}
			
	}
