package simplecalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class CalcApp {

	private JFrame frame;
	private JTextField displayScreen;
	double first_operand,second_operand,result;
	String operation, final_answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp window = new CalcApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 449, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		displayScreen = new JTextField();
		displayScreen.setBounds(10, 10, 413, 81);
		frame.getContentPane().add(displayScreen);
		displayScreen.setColumns(10);
		
		JButton zero = new JButton("0");
		zero.setFocusable(false);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + zero.getText();
				displayScreen.setText(number);
				
			}
		});
		zero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		zero.setBounds(10, 119, 73, 57);
		frame.getContentPane().add(zero);
		
		JButton one = new JButton("1");
		one.setFocusable(false);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + one.getText();
				displayScreen.setText(number);
			}
		});
		one.setFont(new Font("Tahoma", Font.PLAIN, 16));
		one.setBounds(98, 120, 73, 57);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.setFocusable(false);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + two.getText();
				displayScreen.setText(number);
			}
		});
		two.setFont(new Font("Tahoma", Font.PLAIN, 16));
		two.setBounds(181, 120, 73, 57);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.setFocusable(false);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + three.getText();
				displayScreen.setText(number);
			}
		});
		three.setFont(new Font("Tahoma", Font.PLAIN, 14));
		three.setBounds(264, 120, 73, 57);
		frame.getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.setFocusable(false);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + four.getText();
				displayScreen.setText(number);
			}
		});
		four.setFont(new Font("Tahoma", Font.PLAIN, 14));
		four.setBounds(350, 120, 73, 57);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.setFocusable(false);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + five.getText();
				displayScreen.setText(number);
			}
		});
		five.setFont(new Font("Tahoma", Font.PLAIN, 14));
		five.setBounds(10, 186, 73, 57);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.setFocusable(false);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + six.getText();
				displayScreen.setText(number);
			}
		});
		six.setFont(new Font("Tahoma", Font.PLAIN, 14));
		six.setBounds(98, 186, 73, 57);
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.setFocusable(false);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + seven.getText();
				displayScreen.setText(number);
			}
		});
		seven.setFont(new Font("Tahoma", Font.PLAIN, 14));
		seven.setBounds(181, 186, 73, 57);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.setFocusable(false);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + eight.getText();
				displayScreen.setText(number);
			}
		});
		eight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		eight.setBounds(264, 187, 73, 57);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.setFocusable(false);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + nine.getText();
				displayScreen.setText(number);
			}
		});
		nine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nine.setBounds(350, 187, 73, 57);
		frame.getContentPane().add(nine);
		
		JButton division = new JButton("÷");
		division.setFocusable(false);
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "÷";
			}
		});
		division.setFont(new Font("Tahoma", Font.PLAIN, 16));
		division.setBounds(10, 258, 73, 57);
		frame.getContentPane().add(division);
		
		JButton multiply = new JButton("x");
		multiply.setFocusable(false);
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "x";
				
			}
		});
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 16));
		multiply.setBounds(98, 258, 73, 57);
		frame.getContentPane().add(multiply);
		
		JButton minus = new JButton("-");
		minus.setFocusable(false);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "-";
			}
		});
		minus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		minus.setBounds(181, 258, 73, 57);
		frame.getContentPane().add(minus);
		
		JButton sum = new JButton("+");
		sum.setFocusable(false);
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "+";
			}
		});
		sum.setFocusable(false);
		sum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sum.setBounds(264, 258, 73, 57);
		frame.getContentPane().add(sum);
		
		JButton equal = new JButton("=");
		equal.setFocusable(false);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Code to be written
			}
		});
		equal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		equal.setBounds(349, 258, 73, 57);
		frame.getContentPane().add(equal);
		
		JButton squareRoot = new JButton("√");
		squareRoot.setFocusable(false);
		squareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "√";
			}
		});
		squareRoot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		squareRoot.setBounds(10, 325, 73, 57);
		frame.getContentPane().add(squareRoot);
		
		JButton modulus = new JButton("%");
		modulus.setFocusable(false);
		modulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "%";
			}
		});
		modulus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		modulus.setBounds(98, 325, 73, 57);
		frame.getContentPane().add(modulus);
		
		JButton carret = new JButton("^");
		carret.setFocusable(false);
		carret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_operand = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operation = "^";
			}
		});
		carret.setFont(new Font("Tahoma", Font.PLAIN, 16));
		carret.setBounds(181, 325, 73, 57);
		frame.getContentPane().add(carret);
		
		JButton clear = new JButton("clr");
		clear.setFocusable(false);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String number = displayScreen.getText() + zero.getText();
				displayScreen.setText(null);
			}
		});
		clear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		clear.setBounds(263, 325, 73, 57);
		frame.getContentPane().add(clear);
		
		JButton point = new JButton(".");
		point.setFocusable(false);
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = displayScreen.getText() + point.getText();
				displayScreen.setText(number);
			}
		});
		point.setFont(new Font("Tahoma", Font.PLAIN, 16));
		point.setBounds(348, 325, 73, 57);
		frame.getContentPane().add(point);
		
		JButton backspace = new JButton("\uF0E7");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (displayScreen.getText().length()>0)
				{
					StringBuilder strBuildObj = new StringBuilder(displayScreen.getText());
					strBuildObj.deleteCharAt(displayScreen.getText().length()-1);
					backspace = strBuildObj.toString();
					displayScreen.setText(backspace);
				}
				
			}
		});
		backspace.setFont(new Font("wingdings", Font.PLAIN, 16));
		backspace.setFocusable(false);
		backspace.setBounds(10, 392, 158, 57);
		frame.getContentPane().add(backspace);
		
		JButton squareRoot_2 = new JButton("");
		squareRoot_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		squareRoot_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		squareRoot_2.setFocusable(false);
		squareRoot_2.setBounds(181, 392, 73, 57);
		frame.getContentPane().add(squareRoot_2);
		
//		JSeparator separator = new JSeparator();
//		separator.setBounds(20, 107, 401, -16);
//		frame.getContentPane().add(separator);
	}
}
