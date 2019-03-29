import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vista extends JFrame implements WindowListener, ActionListener
{

	private static final long serialVersionUID = 1L;
	TextArea txt1 = new TextArea();
	JTextField txt2 = new JTextField(20);
	JButton btn = new JButton("Calcular");
	Vista(){
		setLayout(new FlowLayout());
		setTitle("Contador");
		setSize(480,330);
		setLocationRelativeTo(null);
		this.add(txt1);
		this.add(txt2);
		this.add(btn);
		btn.addActionListener(this);
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

	
	public void windowIconified(WindowEvent arg0)
	{
		
		
	}

	
	public void windowOpened(WindowEvent arg0)
	{
		
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}

}
