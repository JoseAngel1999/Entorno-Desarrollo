import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Controlador implements ActionListener, WindowListener
{

	Vista objVista = null; 
	Modelo objModelo = null;
	
	public Controlador(Vista objVista, Modelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
		objVista.btn.addActionListener(this);
		objVista.addWindowListener(this); 
	}
	
	public void windowActivated(WindowEvent e)
	{
		
		
	}

	
	public void windowClosed(WindowEvent e)
	{
		
		
	}

	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}

	
	public void windowDeactivated(WindowEvent e)
	{
		
		
	}

	
	public void windowDeiconified(WindowEvent e)
	{
	
		
	}

	
	public void windowIconified(WindowEvent e)
	{
		
		
	}
	


	public void windowOpened(WindowEvent e)
	{
		
		
	}

	
	public void actionPerformed(ActionEvent arg0)
	{
		if(objVista.btn.equals(arg0.getSource())) {
			int numero = (Integer.parseInt(this.objVista.txt1.getText()));
			String resultado = objModelo.numero_a_palabra(numero);
			objVista.txt3.setText(resultado);
		}
		if(objVista.btn.equals(arg0.getSource())) {
			String palabra = ((this.objVista.txt2.getText()));
			Integer resultado = objModelo.palabra_a_numero(palabra);
			objVista.txt3.setText(resultado.toString());
		}
		
	}

}
