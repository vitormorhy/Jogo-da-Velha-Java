import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 



public class Main {

	public static void main(String[] args) {
		
		  Font font = new Font("Dialog", Font.PLAIN, 50);

	        JLabel xlabel = new JLabel("X: ");
	        xlabel.setFont(font);
	        xlabel.setForeground(new Color(123, 50, 200));

	        JLabel xplacar = new JLabel("0");
	        xplacar.setFont(font);
	        xplacar.setForeground(Color.BLACK);
			
	        JPanel xpanel = new JPanel();
	        xpanel.setBackground(Color.CYAN);
	        xpanel.setBounds(450, 345, 150, 100);
	        xpanel.add(xlabel);
	        xpanel.add(xplacar);

	        JLabel olabel = new JLabel("O: ");
	        olabel.setFont(font);
	        olabel.setForeground(new Color(123, 50, 200));

	        JLabel oplacar = new JLabel("0");
	        oplacar.setFont(font);
	        oplacar.setForeground(Color.BLACK);

	        JPanel opanel = new JPanel();
	        opanel.setBackground(Color.CYAN);
	        opanel.setBounds(450, 0, 150, 100);
	        opanel.add(olabel);
	        opanel.add(oplacar);

	        TicTacToe frame = new TicTacToe(xplacar, oplacar);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);
	        frame.setSize(600, 480);
	        frame.setTitle("Jogo da Velha - Java");
	        frame.setVisible(true);
	        frame.add(xpanel);
	        frame.add(opanel);
			frame.setLocationRelativeTo(null);

	        ImageIcon image = new ImageIcon("undf2icon.png");
	        frame.setIconImage(image.getImage());
	        frame.getContentPane().setBackground(new Color(123, 50, 200));
	    }
	}

