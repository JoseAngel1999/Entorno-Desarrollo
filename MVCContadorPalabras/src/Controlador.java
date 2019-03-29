import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements ActionListener, WindowListener, TextListener 
{
	Vista objVista = null; 
	Modelo objModelo = null;
	public Controlador(Vista objVista, Modelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
		objVista.txt1.addTextListener(this);
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
		
		
	}

	
	public void textValueChanged(TextEvent arg0)
	{
		if(objVista.txt1.equals(arg0.getSource())) {
			objVista.txt2.setText(objModelo.cuentaPalabras(objVista.txt1.getText()).toString());
		}
		
	}


}
