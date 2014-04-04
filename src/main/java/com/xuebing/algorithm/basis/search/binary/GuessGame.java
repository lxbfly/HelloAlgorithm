package com.xuebing.algorithm.basis.search.binary;

import java.awt.Choice;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GuessGame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	static int m = 0, k = 0;
	static int a = (int) (Math.random() * 100);
	JLabel jl2, jl3;
	JButton commit, cancel, button, jl1;
	JTextField jt, jt1, jp, jg;
	Choice jt2 = new Choice();

	public GuessGame() {
		super("Guess Number Game");
		Container c = this.getContentPane();
		jl1 = new JButton("Show Generate Number : ");
		jl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jp.setText("生成了一个0~100之間的数");
			}
		});
		jp = new JTextField("数据个数");
		jp.setEnabled(false);
		jt = new JTextField(10);
		button = new JButton("猜数");
		button.addActionListener(this);

		jl2 = new JLabel("猜过的数：");
		jt1 = new JTextField(10);
		jt1.setEditable(false);
		jl3 = new JLabel("结果判断：");

		commit = new JButton("重新開始");
		commit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				m = 0;
				a = (int) (Math.random() * 100);
				jt2.removeAll();
				jt.setText("");
				jt.setEditable(true);
				jp.setText("数据个数");
				jt1.setText("");

			}
		});
		cancel = new JButton("不跟你玩啦~~");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				JOptionPane.showMessageDialog(null, "Goodbye ~~~");
				System.exit(0);

			}
		});

		c.setLayout(new GridLayout(6, 2));
		c.add(jl1);
		c.add(jp);
		c.add(jt);
		c.add(button);
		c.add(jl2);
		c.add(jt1);
		c.add(jl3);
		c.add(jt2);
		c.add(commit);
		c.add(cancel);
		this.setSize(430, 250);
		this.setLocation(200, 200);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String comm = e.getActionCommand();
		if (comm.equals("猜数")) {

			final int i = Integer.parseInt(jt.getText());
			if (i >= 0 && i <= 100) {
				if (i == a) {
					m += 1;
					k = 1;
				} else if (i > a) {
					m += 1;
					k = 2;
				} else if (i < a) {
					m += 1;
					k = 3;
				}
				jt1.setText(jt1.getText() + " " + i + "  ");

				switch (k) {
				case 1:
					if (m <= 3)
						jt2.insert("Right, used " + m + " times, Very Good", 0);
					if (m > 3 && m <= 6)
						jt2.insert("Right, used " + m + "  times, Good", 0);
					if (m > 6 && m <= 10)
						jt2.insert("Right, You guess  " + m + " chance!", 0);
					break;
				case 2:
					if (m < 10) {
						jt2.insert("too big, there are " + (10 - m)
								+ " chance!", 0);
					} else
						jt2.insert("GameOver", 0);
					break;
				case 3:
					if (m < 10)
						jt2.insert("too small, there are  " + (10 - m)
								+ " chance !", 0);
					else
						jt2.insert("Game Over", 0);
					break;
				}
				if (m >= 10)
					jt.setEditable(false);
				else
					jt.setText("");
			} else {
				jt2.insert(i + " 不是0~100之间的数，请重新输入", 0);
				jt.setText("");
			}
		}
	}

	public static void main(String[] args)
			throws java.lang.NumberFormatException {
		new GuessGame();

	}
}
