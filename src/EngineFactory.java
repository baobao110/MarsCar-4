import java.util.HashMap;
import java.util.Map;

public class EngineFactory {

	private static final Map<String, Engine> engineMap = new HashMap<String, Engine>();

	static {
		engineMap.put(MarsConstant.ORDER_W, new ForwardEngine());
		engineMap.put(MarsConstant.ORDER_S, new BackEngine());
		engineMap.put(MarsConstant.ORDER_D, new RightEngine());
		engineMap.put(MarsConstant.ORDER_A, new LeftEngine());
	}

	public EngineFactory() {
		
	}

	public static Engine getEngine(String order) {
		return engineMap.get(order);
	}
}
