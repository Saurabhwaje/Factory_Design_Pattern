package factorydesignpatterncom.jsp.factorydp.cafe.items;

import factorydesignpatterncom.jsp.factorydp.cafe.order.Order;

public class Pasta implements Order {

	@Override
	public void orderItem() {
		System.out.println("Ordering Pasta");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pasta is ready");
	}
}
