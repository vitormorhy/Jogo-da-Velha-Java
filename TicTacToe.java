import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame{  
    JButton[][] btn = new JButton[3][3];
    private JButton newGame;
    private JButton zerar; //
    private boolean changer;
    boolean[] block = new boolean[9];
    

    public TicTacToe(JLabel xPlacarLabel, JLabel oPlacarLabel) {

     

        setLayout(null);
        setBounds(250, 400, 600, 500);
        
        GameMethods method = new GameMethods(xPlacarLabel, oPlacarLabel);

        btn[0][0] = new JButton(" ");
        btn[0][1] = new JButton(" ");
        btn[0][2] = new JButton(" ");
        btn[1][0] = new JButton(" ");
        btn[1][1] = new JButton(" ");
        btn[1][2] = new JButton(" ");
        btn[2][0] = new JButton(" ");
        btn[2][1] = new JButton(" ");
        btn[2][2] = new JButton(" ");
        newGame = new JButton("Novo Jogo");
        zerar = new JButton("Zerar"); //
        
        Font font = new Font("Dialog", Font.PLAIN, 80);
        btn[0][0].setFont(font);
        btn[0][1].setFont(font);
      	btn[0][2].setFont(font);
        btn[1][0].setFont(font);
        btn[1][1].setFont(font);
     	btn[1][2].setFont(font);
        btn[2][0].setFont(font);
        btn[2][1].setFont(font);
        btn[2][2].setFont(font);
        
        
        btn[0][0].setFocusable(false);//
        btn[0][1].setFocusable(false);//
      	btn[0][2].setFocusable(false);//
        btn[1][0].setFocusable(false);
        btn[1][1].setFocusable(false);
     	btn[1][2].setFocusable(false);
        btn[2][0].setFocusable(false);
        btn[2][1].setFocusable(false);
        btn[2][2].setFocusable(false);
        newGame.setFocusable(false);
        zerar.setFocusable(false);
        
        
        btn[0][0].setForeground(new Color(123,50,200));//
        btn[0][1].setForeground(new Color(123,50,200));//
      	btn[0][2].setForeground(new Color(123,50,200));
        btn[1][0].setForeground(new Color(123,50,200));
        btn[1][1].setForeground(new Color(123,50,200));
     	btn[1][2].setForeground(new Color(123,50,200));
        btn[2][0].setForeground(new Color(123,50,200));
        btn[2][1].setForeground(new Color(123,50,200));
        btn[2][2].setForeground(new Color(123,50,200));
        newGame.setForeground(new Color(123,50,200));
        zerar.setForeground(new Color(123,50,200));

        btn[0][0].setBounds(50, 50, 100, 100);
        btn[0][1].setBounds(155, 50, 100, 100);
        btn[0][2].setBounds(260, 50, 100, 100);
        btn[1][0].setBounds(50, 155, 100, 100);
        btn[1][1].setBounds(155, 155, 100, 100);
        btn[1][2].setBounds(260, 155, 100, 100);
        btn[2][0].setBounds(50, 260, 100, 100);
        btn[2][1].setBounds(155, 260, 100, 100);
        btn[2][2].setBounds(260, 260, 100, 100);
        newGame.setBounds(470, 150, 100, 40);
        zerar.setBounds(470, 250, 100, 40);

        add(btn[0][0]);
        add(btn[0][1]);
        add(btn[0][2]);
        add(btn[1][0]);
        add(btn[1][1]);
        add(btn[1][2]);
        add(btn[2][0]);
        add(btn[2][1]);
        add(btn[2][2]);
        add(newGame);
        add(zerar);


      btn[0][0].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[0]){
                	changer = !changer;
                	Change(btn[0][0]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[0] = true;
                }
                
            }
        });

        btn[0][1].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[1]){
                	changer = !changer;
                	Change(btn[0][1]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[1] = true;
                }
                
            }
        });
        
        btn[0][2].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[2]){
                	changer = !changer;	
                	Change(btn[0][2]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[2] = true;
                }
                
            }
        });

        btn[1][0].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[3]){
                	changer = !changer;
                	Change(btn[1][0]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[3] = true;
                }
                
            }
        });

        btn[1][1].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[4]){
                	changer = !changer;	
                	Change(btn[1][1]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[4] = true;
                }
                
            }
        });

        btn[1][2].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[5]){
                	changer = !changer;
                	Change(btn[1][2]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[5] = true;
                }
                
            }
        });

        btn[2][0].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[6]){
                	changer = !changer;
                	Change(btn[2][0]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[6] = true;
                }
                
            }
        });

        btn[2][1].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[7]){
                	changer = !changer;
                	Change(btn[2][1]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[7] = true;
                }
                
            }
        });

        btn[2][2].addActionListener(new ActionListener() {
            boolean oc;
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!block[8]){
                	changer = !changer;
                	Change(btn[2][2]);
                	method.verificarVitoriaX(btn);
                	method.verificarVitoriaO(btn);
                	block[8] = true;
                }
                
            }
        });
        
        newGame.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ae) {
        		method.clear(btn);
                changer = false;
        		for(int i=0; i<10; i++) {
        			block[i]=false;
        		}
        	
        	}
        });

        zerar.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ae) {
                method.zerar();
                method.clear(btn);
                changer = false;
                for(int i = 0; i<10; i++){
                    block[i]=false;
                }
    }
});
    }
    public void Change(JButton btn){
        if(changer){
            btn.setText("X");
        }else{
            btn.setText("O");
        }
    }
    
}
