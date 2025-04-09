import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;

public class GameMethods {
		int contador=9;
		int vitoriasX=0; //vitoriasX++
		int vitoriasO=0; //vitoriasO++
		boolean antiBug=true;
		private JLabel xPlacarLabel;
	    private JLabel oPlacarLabel;
	    
	    
	    
	    
	    public GameMethods(JLabel xPlacarLabel, JLabel oPlacarLabel) {
	        this.xPlacarLabel = xPlacarLabel;
	        this.oPlacarLabel = oPlacarLabel;
	    }
		
		
	public void verificarVitoriaX(JButton[][] btn){
		for(int i = 0; i < 3; i++){
            if(btn[i][0].getText() == "X" && btn[i][1].getText() == "X" && btn[i][2].getText() == "X"){
               vitoriasX++;
			   antiBug=false;
               btn[i][0].setBackground(Color.CYAN); //
               btn[i][1].setBackground(Color.CYAN); //
               btn[i][2].setBackground(Color.CYAN); //
			   JOptionPane.showMessageDialog(null, "O jogador X venceu!!");
               xPlacarLabel.setText(String.valueOf(vitoriasX));
               
               
            } else if(btn[0][i].getText() == "X" && btn[1][i].getText() == "X" && btn[2][i].getText() == "X"){
            	vitoriasX++;
				antiBug=false;
            	btn[0][i].setBackground(Color.CYAN); //
            	btn[1][i].setBackground(Color.CYAN); //
            	btn[2][i].setBackground(Color.CYAN); //
				JOptionPane.showMessageDialog(null, "O jogador X venceu!!");
            	xPlacarLabel.setText(String.valueOf(vitoriasX));
            	
            }
        }
        
        if(btn[0][0].getText() == "X" && btn[1][1].getText() == "X" && btn[2][2].getText() == "X"){
        	vitoriasX++;
			antiBug=false;
        	btn[0][0].setBackground(Color.CYAN);
        	btn[1][1].setBackground(Color.CYAN);
        	btn[2][2].setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(null, "O jogador X venceu!!");
        	xPlacarLabel.setText(String.valueOf(vitoriasX));
        	
        
        } else if(btn[0][2].getText() == "X" && btn[1][1].getText() == "X" && btn[2][0].getText() == "X"){
        	vitoriasX++;
			antiBug=false;
        	btn[0][2].setBackground(Color.CYAN);
        	btn[1][1].setBackground(Color.CYAN);
        	btn[2][0].setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(null, "O jogador X venceu!!");
        	xPlacarLabel.setText(String.valueOf(vitoriasX));
        	 	
        }
	}
	
	public void verificarVitoriaO(JButton[][] btn){
		for(int i = 0; i < 3; i++){
            if(btn[i][0].getText() == "O" && btn[i][1].getText() == "O" && btn[i][2].getText() == "O"){
               vitoriasO++;
               btn[i][0].setBackground(Color.CYAN); //
               btn[i][1].setBackground(Color.CYAN); //
               btn[i][2].setBackground(Color.CYAN); //
			   JOptionPane.showMessageDialog(null, "O jogador O venceu!!");
               oPlacarLabel.setText(String.valueOf(vitoriasO));
              
            } else if(btn[0][i].getText() == "O" && btn[1][i].getText() == "O" && btn[2][i].getText() == "O"){
            	 vitoriasO++;
            	 btn[0][i].setBackground(Color.CYAN); //
             	 btn[1][i].setBackground(Color.CYAN); //
             	 btn[2][i].setBackground(Color.CYAN); //
				 JOptionPane.showMessageDialog(null, "O jogador O venceu!!");
            	 oPlacarLabel.setText(String.valueOf(vitoriasO));
            	
            }
        }
        
        if(btn[0][0].getText() == "O" && btn[1][1].getText() == "O" && btn[2][2].getText() == "O"){
        	 vitoriasO++;
        	 btn[0][0].setBackground(Color.CYAN);
         	 btn[1][1].setBackground(Color.CYAN);
         	 btn[2][2].setBackground(Color.CYAN);
			 JOptionPane.showMessageDialog(null, "O jogador O venceu!!");
        	 oPlacarLabel.setText(String.valueOf(vitoriasO));
        	 
        } else if(btn[0][2].getText() == "O" && btn[1][1].getText() == "O" && btn[2][0].getText() == "O"){
        	 vitoriasO++;
        	 btn[0][2].setBackground(Color.CYAN);
         	 btn[1][1].setBackground(Color.CYAN);
         	 btn[2][0].setBackground(Color.CYAN);
			 JOptionPane.showMessageDialog(null, "O jogador O venceu!!");
        	 oPlacarLabel.setText(String.valueOf(vitoriasO));
        	 	 
        }else if(antiBug){
			if(btn[0][0].getText() != " " &&
         		btn[0][1].getText() != " " &&
         		btn[0][2].getText() != " " &&
         		btn[1][0].getText() != " " && 
         		btn[1][1].getText() != " " && 
         		btn[1][2].getText() != " " && 
         		btn[2][0].getText() != " " && 
        		 btn[2][1].getText() != " " && 
         		btn[2][2].getText() != " ") {
			JOptionPane.showMessageDialog(null, "O jogo empatou!!!");
		}
		}
	}
	
	public void clear(JButton[][] btn) {
	  btn[0][0].setText(" ");
      btn[0][1].setText(" ");
      btn[0][2].setText(" ");
      btn[1][0].setText(" ");
      btn[1][1].setText(" ");
      btn[1][2].setText(" ");
      btn[2][0].setText(" ");
      btn[2][1].setText(" ");
      btn[2][2].setText(" ");
     
      btn[0][0].setBackground(new JButton().getBackground());
      btn[0][1].setBackground(new JButton().getBackground());
      btn[0][2].setBackground(new JButton().getBackground());
      btn[1][0].setBackground(new JButton().getBackground());
      btn[1][1].setBackground(new JButton().getBackground());
      btn[1][2].setBackground(new JButton().getBackground());
      btn[2][0].setBackground(new JButton().getBackground());
      btn[2][1].setBackground(new JButton().getBackground());
      btn[2][2].setBackground(new JButton().getBackground());

	  antiBug = true;
      
	}
	public void zerar(){
		vitoriasX = 0;
		vitoriasO = 0;
		xPlacarLabel.setText(String.valueOf(vitoriasX));
		oPlacarLabel.setText(String.valueOf(vitoriasO));
	}
}
