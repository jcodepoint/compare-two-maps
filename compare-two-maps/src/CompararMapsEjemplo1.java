import java.util.HashMap;
import java.util.Map;

public class CompararMapsEjemplo1 {
	public static void main(String[] args) {
		Map<Integer, String> colormap1 = new HashMap<Integer, String>();
		colormap1.put(1, "blanco");
		colormap1.put(2, "amarillo");
		colormap1.put(3, "verde");
		colormap1.put(4, "azul");
		
		Map<Integer, String> colormap2 = new HashMap<Integer, String>();
		colormap2.put(2, "amarillo");
		colormap2.put(1, "blanco");
		colormap2.put(4, "azul");
		colormap2.put(3, "verde");

		System.out.println("-> " + colormap1.equals(colormap2));
	}
}