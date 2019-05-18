package yjm;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {
	public static void main(String[] args) {
		 login l = new login();
		 l.initUI();
	}
	public void initUI() {
		   final JFrame frame = new JFrame();
		   frame.setTitle("µÇÂ½½çÃæ£¨Login£©");
			frame.setSize(300, 400);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(3);
			FlowLayout ljj = new FlowLayout(FlowLayout.RIGHT);
			frame.setLayout(ljj);
			ImageIcon icon = new ImageIcon("C:/Users/123/Desktop/~~U)}B7[FOWHNO6XM$KF4G5.png");
			JLabel labIcon = new JLabel(icon);
			frame.add(labIcon);
			JLabel kong = new JLabel("             		");
			frame.add(kong);
			
			final JLabel labName = new JLabel("ÕËºÅ£º");
			frame.add(labName);
			
			JTextField LLLL = new JTextField();
			LLLL.setPreferredSize(new Dimension(220,20));
			frame.add(LLLL);
			
			 JLabel LLL = new JLabel("ÃÜÂë£º");
			frame.add(LLL);
			final JPasswordField mima = new JPasswordField();
			mima.setPreferredSize(new Dimension(220,20));
			frame.add(mima);
			
			JButton dl = new JButton("µÇÂ½");
			dl.setPreferredSize(new Dimension(130,30));
			frame.add(dl);
			frame.setVisible(true);
		   dl.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			 
					mainclass b =new mainclass();
			      b.initUI();
			    frame.dispose();
				 
			}
		});
		  //buttonlistenner ll = new buttonlistenner();
	//	   ll.setA(frame);
	//	   dl.addActionListener(ll);
		   
	//	   ll.setB(LLLL);
	//	   ll.setC(mima);
		   }
		 
}
