public class MarsUtil {

	public static int getRandomInt() {
		return (int)(Math.random() * 10);
	}

	public static boolean checkOrder(String order) {
		
		// if (null == order) {
		// 	return false;
		// }

		// if ("".equals(order)) {
		// 	return false;
		// }

		if (null == order || "".equals(order)) {
			return false;
		}

		//���Ƽ� ���ױ�NPE�쳣
		// if (order.equals("")) {
		// 	return false;
		// }

		

		return true;
	}

}