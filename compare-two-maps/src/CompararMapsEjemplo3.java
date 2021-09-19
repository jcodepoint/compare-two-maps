import java.util.HashMap;
import java.util.Map;

public class CompararMapsEjemplo3 {

	public static void main(String[] args) {
		Map<Integer, String> colormap1 = new HashMap<Integer, String>();
		colormap1.put(1, "blanco");
		colormap1.put(2, "amarillo");
		colormap1.put(3, "verde");
		colormap1.put(4, "azul");
		
		Map<Integer, String> colormap2 = new HashMap<Integer, String>();
		colormap2.put(2, "cian");
		colormap2.put(1, "gris");
		colormap2.put(4, "purpura");
		colormap2.put(3, "verde");
		
		boolean b = colormap1.entrySet().stream().anyMatch(e ->  e.getValue().equals(colormap2.get(e.getKey())));
		
		System.out.println("-> " + b);
	
	}
}
