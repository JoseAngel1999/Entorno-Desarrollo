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
	
	public void windowActivated(WindowEvent arg0)
	{
		
		
	}

	
	public void windowClosed(WindowEvent arg0)
	{
		
		
	}

	
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
		
	}

	
	public void windowDeactivated(WindowEvent arg0)
	{
		
		
	}

	
	public void windowDeiconified(WindowEvent arg0)
	{
		
		
	}

	
	public void windowIconified(WindowEvent arg0)
	{
		
		
	}

	
	public void windowOpened(WindowEvent arg0)
	{
		
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(objVista.btn.equals(e.getSource())) {
			String numero = ((this.objVista.txt1.getText()));
			Integer resultado = Modelo.cuentaPalabras(numero);
			objVista.txt2.setText(resultado.toString());
		}
		
	}

	

}
