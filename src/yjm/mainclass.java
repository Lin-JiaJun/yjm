package yjm;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainclass extends JFrame{
	public static void main(String[] args) {
		mainclass b= new mainclass();
		b.initUI();
	}
	public void initUI(){
		this.setTitle("�����");
		this.setSize(600,600);
		this.setDefaultCloseOperation(3);
		this.setLayout(new FlowLayout());
		JLabel print = new JLabel();
		print.setSize(new Dimension(100,100));
		Button train = new Button("¼�����");
		Button play  = new Button("���ı���");
		Button find  = new Button("��ѯͳ��");
		this.add(train);
		this.add(play);
		this.add(find);
		this.add(print);
		listennner i = new listennner();
		train.addActionListener(i);
		play.addActionListener(i);	find.addActionListener(i);
		this.setVisible(true);
	}

}
