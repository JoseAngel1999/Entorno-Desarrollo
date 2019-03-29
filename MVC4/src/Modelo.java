public class Modelo
{


	public String numero_a_palabra (int numero) {
		
		switch (numero){
		case 1:
			return "Programacion";
		case 2:
			return "Perro";
		case 3:
			return "Insignia";
		case 4:
			return "Numerable";
		case 5:
			return "Automóvil";
		case 6:
			return "ACL";
		case 7:
			return "Decronomicon";
		
		default:
			return "";
	  }
	}
	public int palabra_a_numero (String palabra) {
		switch (palabra){
		case "Programacion":
			return 1;
		case "Perro":
			return 2;
		case "Insignia":
			return 3;
		case "Numerable":
			return 4;
		case "Automóvil":
			return 5;
		case "ACL":
			return 6;
		case "Decronomicon":
			return 7;
		
		default:
			return 0;
	  }
	}
		
		
	}




