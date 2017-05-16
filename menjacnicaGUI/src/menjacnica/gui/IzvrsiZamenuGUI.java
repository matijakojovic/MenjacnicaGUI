package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblProdajni;
	private JLabel lblValuta;
	private JLabel lblKupovni;
	private JTextField textFieldProdajna;
	private JTextField textFieldKupovni;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblTransakcija;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	
	public IzvrsiZamenuGUI() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				GUIKontroler.zatvoriZamenu();
			}
		});
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/icons/1494190982_Money.png")));
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblProdajni());
		contentPane.add(getLblValuta());
		contentPane.add(getLblKupovni());
		contentPane.add(getTextFieldProdajna());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblTransakcija());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
			lblProdajni.setBounds(25, 13, 116, 16);
		}
		return lblProdajni;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta: ");
			lblValuta.setBounds(169, 13, 56, 16);
		}
		return lblValuta;
	}
	private JLabel getLblKupovni() {
		if (lblKupovni == null) {
			lblKupovni = new JLabel("Kupovni kurs");
			lblKupovni.setBounds(295, 13, 116, 16);
		}
		return lblKupovni;
	}
	private JTextField getTextFieldProdajna() {
		if (textFieldProdajna == null) {
			textFieldProdajna = new JTextField();
			textFieldProdajna.setEditable(false);
			textFieldProdajna.setBounds(25, 42, 116, 22);
			textFieldProdajna.setColumns(10);
		}
		return textFieldProdajna;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setBounds(295, 42, 116, 22);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "CHF", "RSD"}));
			comboBox.setBounds(169, 42, 56, 22);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(25, 77, 116, 16);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(25, 106, 116, 22);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblTransakcija() {
		if (lblTransakcija == null) {
			lblTransakcija = new JLabel("Vrsta transakcije: ");
			lblTransakcija.setBounds(241, 77, 127, 16);
		}
		return lblTransakcija;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setSelected(true);
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(241, 105, 127, 25);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(241, 135, 127, 25);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					int iznos = slider.getValue();
					getTextFieldIznos().setText(iznos + "");
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(25, 172, 386, 59);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.setBounds(25, 244, 116, 25);
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String trans = "";
					if(rdbtnKupovina.isSelected()){
						trans = "Kupovina";
					}else{
						trans = "Prodaja";
					}
					GUIKontroler.textMenjacnicaGUI("Izvrsena zamena \nValuta: " + comboBox.getSelectedItem().toString() +
												   ", Iznos: " + textFieldIznos.getText() +
												   ", Vrsta transakcija: " + trans);
				}
			});
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBounds(295, 244, 116, 25);
			btnOdustani.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriZamenu();
				}
			});
		}
		return btnOdustani;
	}
}
