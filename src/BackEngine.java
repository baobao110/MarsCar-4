public class BackEngine extends Engine {

	public BackEngine() {

	}

	public void move(Point point) {
		point.setY(point.getY() - 1);
	}

}
