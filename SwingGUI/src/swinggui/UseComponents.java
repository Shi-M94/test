package swinggui;

//import java.awt.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UseComponents extends JFrame {
	private static final long serialVersionUID=1L;

	JPanel panel =new JPanel();
	JButton button1=new JButton("BUTTON");
	JCheckBox checkbox1=new JCheckBox();
	JTextArea textarea1=new JTextArea();
	JComboBox<String> combobox1=new JComboBox<String>();

	public UseComponents(){
		this.setBounds(50,100,400,250);
		button1.setText("ボタン");
		panel.add(button1);

		checkbox1.setText("チェックボックス");
		panel.add(checkbox1);

		textarea1.setText("テキストエリア\nTextArea");
		panel.add(textarea1);

		combobox1.addItem("りんご");
		this.combobox1.addItem("みかん");
		this.combobox1.addItem("なし");
		this.panel.add( this.combobox1 );
		panel.add(this.combobox1);


		this.setContentPane(panel);
		this.setVisible(true);
	}






}
