package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		Product ledTv = new Product("ledTv", "a very good Tv", 1000);
		Product computerDesktop = new Product("computerDesktop", "super computer", 1500);

		System.out.println(ledTv);
		System.out.println("______________________\n");
		System.out.println(computerDesktop);

	}

}
