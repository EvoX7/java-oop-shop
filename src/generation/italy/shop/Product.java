package generation.italy.shop;

import java.util.Random;

public class Product {

	private int code;
	private String name;
	private String description;
	private int price;
	private int vat;

//	Constructor
	public Product(String name, String description, int price) {

		Random rnd = new Random();
		code = rnd.nextInt(20000, 200000);
		vat = 20;

		this.name = name;
		this.description = description;
		this.price = price;

	}

	public int getPrice() {
		return price;

	}

	public int getVatwithPrice() {
		return price + (price / 100 * vat);

	}

	@Override
	public String toString() {

		return "product code: " + code + "\nname: " + name + "\ndescription: " + description + "\nregular price: "
				+ price + "e" + "\nvat at: " + vat + "%" + "\nprice with vat: " + getVatwithPrice() + "e";
	}

}
