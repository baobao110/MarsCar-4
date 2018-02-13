public class MarsCar extends Car {

	public MarsCar() {
		this.name = "mc";
		this.point = new Point();
	}

	public MarsCar(String name) {
		this.name = name;
		this.point = new Point(MarsUtil.getRandomInt(), MarsUtil.getRandomInt());
	}

	public MarsCar(String name, Point point) {
		this.name = name;
		this.point = point;
	}

	public void move(String... orders) {
		for (String order : orders) {
			processOrder(order);
		}
	}

	// public void move(String manyOrder) {
	// 	String[] orderArray = manyOrder.split("\\,");
	// 	for (String order : orderArray) {
	// 		System.out.println(order);
	// 		processOrder(order);
	// 	}
	// }

	private void processOrder(String order) {
		
		if (!MarsUtil.checkOrder(order)) {
			throw new RuntimeException("��������Ϸ�");
		}

		Engine engine = EngineFactory.getEngine(order);
		//System.out.println("ԭʼ����[" + point.getX() + "," + point.getY() + "]");
		
		if ("back".equals(order)) {
			if (null == point.getPrePoint()) {
				throw new RuntimeException("�����ѵ�ԭ��");
			}

			point = point.getPrePoint();

		} else if ("show".equals(order)) {
			Point tmpPoint = point;
			while (null != tmpPoint) {
				System.out.println(String.format(MarsConstant.CAR_POINT, "�켣", tmpPoint.getX(), tmpPoint.getY()));
				tmpPoint = tmpPoint.getPrePoint();
			}

		} else {

			Point currentPoint = new Point(this.point.getX(), this.point.getY());
			currentPoint.setPrePoint(point);

			point = currentPoint;

			engine.move(point);
		}

		System.out.println(String.format(MarsConstant.CAR_POINT, name, point.getX(), point.getY()));
	}
}
