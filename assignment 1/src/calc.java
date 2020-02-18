
public class calc implements ICalculator {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public float divide(int x, int y) {
		return (float) x/y;
	}
	

}
