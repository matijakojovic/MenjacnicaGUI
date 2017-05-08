package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JTextField textSifra;
	private JTextField textNaziv;
	private JTextField textProdajni;
	private JTextField textSrednji;
	private JTextField textKupovni;
	private JTextField textSkraceniNaziv;
	private JCheckBox chckbxZaistaObrisi;

	
	public ObrisiKursGUI() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				GUIKontroler.zatvoriObrisiKurs();
			}
		});
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/icons/1494190982_Money.png")));
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 375, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getTextSifra());
		contentPane.add(getTextNaziv());
		contentPane.add(getTextProdajni());
		contentPane.add(getTextSrednji());
		contentPane.add(getTextKupovni());
		contentPane.add(getTextSkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisi());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(30, 24, 116, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Prodajni kurs");
			lblNewLabel_1.setBounds(30, 88, 116, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Srednji kurs");
			lblNewLabel_2.setBounds(30, 154, 116, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Naziv");
			lblNewLabel_3.setBounds(212, 24, 116, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Kupovni kurs");
			lblNewLabel_4.setBounds(212, 88, 116, 16);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skraceni naziv");
			lblNewLabel_5.setBounds(212, 154, 116, 16);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setBounds(30, 248, 116, 25);
			btnObrisi.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.textMenjacnicaGUI("Obrisan kurs : \n Sifra: " + getTextSifra().getText() + ", Naziv: " + getTextNaziv().getText() + 
													", Prodajni kurs: " + getTextProdajni().getText() + 
							 						", Kupovni kurs: " + getTextKupovni().getText() + 
							 						", Srednji kurs: " + getTextSrednji().getText() + 
							 						", Skraceni Naziv: "	+ getTextSkraceniNaziv().getText());
				}
			});
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriObrisiKurs();
				}
			});
			btnOdustani.setBounds(212, 248, 116, 25);
		}
		return btnOdustani;
	}
	private JTextField getTextSifra() {
		if (textSifra == null) {
			textSifra = new JTextField();
			textSifra.setBounds(30, 53, 116, 22);
			textSifra.setColumns(10);
		}
		return textSifra;
	}
	private JTextField getTextNaziv() {
		if (textNaziv == null) {
			textNaziv = new JTextField();
			textNaziv.setBounds(212, 53, 116, 22);
			textNaziv.setColumns(10);
		}
		return textNaziv;
	}
	private JTextField getTextProdajni() {
		if (textProdajni == null) {
			textProdajni = new JTextField();
			textProdajni.setBounds(30, 119, 116, 22);
			textProdajni.setColumns(10);
		}
		return textProdajni;
	}
	private JTextField getTextSrednji() {
		if (textSrednji == null) {
			textSrednji = new JTextField();
			textSrednji.setBounds(30, 183, 116, 22);
			textSrednji.setColumns(10);
		}
		return textSrednji;
	}
	private JTextField getTextKupovni() {
		if (textKupovni == null) {
			textKupovni = new JTextField();
			textKupovni.setBounds(212, 119, 116, 22);
			textKupovni.setColumns(10);
		}
		return textKupovni;
	}
	private JTextField getTextSkraceniNaziv() {
		if (textSkraceniNaziv == null) {
			textSkraceniNaziv = new JTextField();
			textSkraceniNaziv.setBounds(212, 183, 116, 22);
			textSkraceniNaziv.setColumns(10);
		}
		return textSkraceniNaziv;
	}
	private JCheckBox getChckbxZaistaObrisi() {
		if (chckbxZaistaObrisi == null) {
			chckbxZaistaObrisi = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisi.setBounds(30, 214, 136, 25);
			chckbxZaistaObrisi.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.omoguciDugme(btnObrisi);
				}
			});
		}
		return chckbxZaistaObrisi;
	}
}
