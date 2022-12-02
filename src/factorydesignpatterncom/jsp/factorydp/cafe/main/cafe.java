package factorydesignpatterncom.jsp.factorydp.cafe.main;

import java.util.Scanner;

import factorydesignpatterncom.jsp.factorydp.cafe.items.Burger;
import factorydesignpatterncom.jsp.factorydp.cafe.items.Coffee;
import factorydesignpatterncom.jsp.factorydp.cafe.items.Fries;
import factorydesignpatterncom.jsp.factorydp.cafe.items.Momos;
import factorydesignpatterncom.jsp.factorydp.cafe.items.Pasta;
import factorydesignpatterncom.jsp.factorydp.cafe.items.Pizza;
import factorydesignpatterncom.jsp.factorydp.cafe.order.Order;

public class cafe {
	private static Order order;
	private static boolean loop = true;
	private static int choice;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (loop) {
			try {
				factory().orderItem();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static Order factory() {
		System.out.println("----MENU----\n" + "1. Pizza \n" + "2. Burger \n" + "3. Fries \n" + "4. Coffee \n"
				+ "5. Momos \n" + "6. Pasta \n" + "7. Exit \n");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			order = new Pizza();
			break;

		case 2:
			order = new Burger();
			break;

		case 3:
			order = new Fries();
			break;

		case 4:
			order = new Coffee();
			break;

		case 5:
			order = new Momos();
			break;

		case 6:
			order = new Pasta();
			break;

		case 7:
			System.out.println("Thankyou Visit Again");
			loop = false;
			break;

		default:
			System.out.println("Invalid choice");
			order = null;
			break;
		}
		return order;
	}
}
