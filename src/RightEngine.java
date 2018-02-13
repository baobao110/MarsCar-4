public class RightEngine extends Engine {

	public RightEngine() {

	}

	public void move(Point point) {
		point.setX(point.getX() + 1);
	}
}