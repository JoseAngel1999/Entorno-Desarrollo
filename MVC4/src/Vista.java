import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame implements WindowListener
{

	
	private static final long serialVersionUID = 1L;
	JLabel etiqueta = new JLabel("Numero");
	JTextField txt1 = new JTextField(20);
	JLabel etiqueta2 = new JLabel("Palabra");
	JTextField txt2 = new JTextField(20);
	JLabel etiqueta3 = new JLabel("Resultado");
	JTextField txt3 = new JTextField(20);
	JButton btn = new JButton("Buscar");
	
	
	Vista(){
		setLayout(new FlowLayout());
		setTitle("Memoria");
		setSize(280,230);
		setLocationRelativeTo(null);
		this.add(etiqueta);
		this.add(txt1);
		this.add(etiqueta2);
		this.add(txt2);
		this.add(etiqueta3);
		this.add(txt3);
		this.add(btn);
		this.addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Vista();

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
	
	public void windowIconified(WindowEvent e)
	{
		
		
	}

	public void windowOpened(WindowEvent e)
	{
	
		
	}

}
