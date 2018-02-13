public class ForwardEngine extends Engine {

	public ForwardEngine() {

	}

	public void move(Point point) {
		point.setY(point.getY() + 1);
	}
}
