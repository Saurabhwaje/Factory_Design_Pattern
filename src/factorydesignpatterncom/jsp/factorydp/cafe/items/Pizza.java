package factorydesignpatterncom.jsp.factorydp.cafe.items;

import factorydesignpatterncom.jsp.factorydp.cafe.order.Order;

public class Pizza implements Order {

	@Override
	public void orderItem() {
		System.out.println("Ordering Pizza");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pizza is ready");
	}
}
