
public class Main
{

	public static void main(String[] args)
	{
		Vista vis = new Vista();
		Modelo mod = new Modelo();
		new Controlador(vis, mod);

	}

}
