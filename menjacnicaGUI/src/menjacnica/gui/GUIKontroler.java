package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIKontroler extends JFrame {
	public GUIKontroler() {
	}

	private static MenjacnicaGUI menjacnicaGui;
	private static DodajKursGUI dodajKursGui;
	private static ObrisiKursGUI obrisiKursGui;
	private static IzvrsiZamenuGUI izvrsiZamenuGui;
	
	public  static String fajl(){
		JFileChooser jfc = new javax.swing.JFileChooser();
		int izbor = jfc.showOpenDialog(menjacnicaGui.getContentPane());
		
		if(izbor == JFileChooser.APPROVE_OPTION){
			File f = jfc.getSelectedFile();
			
			return f.getAbsolutePath();
		}
		return "";
	}
	public static void upisi(String s, Object o){
		if(o instanceof JTextArea){
			((JTextArea)o).setText(((JTextArea)o).getText() + "\n" + s);
		}
		if (o instanceof JTextField) {
			((JTextField) o).setText(((JTextField) o).getText() + "\n" + s);
		}
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.menjacnicaGui = new MenjacnicaGUI();
					menjacnicaGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void izlaz(){
		int jop = JOptionPane.showConfirmDialog(menjacnicaGui.getContentPane(), 
				"Da li zelite da izadjete iz programa", "Izlaz",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
	
		if(jop == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	public static void about(){
		JOptionPane.showMessageDialog(menjacnicaGui, 
				"Autor : Matija Kojovic" + "\n" + 
		"student Fakulteta Organizacionih nauka." + "\n" + 
		"Projekat za dodatnu nastavu \"Menjacnica\"." + "\n" + 
		"Java programiranje.");
	}
	public static void otvoriDodajKurs(){
		GUIKontroler.dodajKursGui = new DodajKursGUI();
		dodajKursGui.setVisible(true);
	}
	public static void zatvoriDodajKurs(){
		dodajKursGui.dispose();
		dodajKursGui = null;
	}
	public static void textMenjacnicaGUI(String s){
		upisi(menjacnicaGui.getTextArea().getText() + "\n" + s, menjacnicaGui.getTextArea());
	}
	public static void otvoriObrisiKurs(){
		GUIKontroler.obrisiKursGui = new ObrisiKursGUI();
		obrisiKursGui.setVisible(true);
	}
	public static void zatvoriObrisiKurs(){
		obrisiKursGui.dispose();
		obrisiKursGui = null;
	}
	public static void omoguciDugme(JButton btnObrisi){
		if(btnObrisi.isEnabled() == true){
			btnObrisi.setEnabled(false);
		}else{
			btnObrisi.setEnabled(true);
		}
	}
	public static void otvoriZamenu(){
		GUIKontroler.izvrsiZamenuGui = new IzvrsiZamenuGUI();
		izvrsiZamenuGui.setVisible(true);
	}
	public static void zatvoriZamenu(){
		izvrsiZamenuGui.dispose();
		izvrsiZamenuGui = null;
	}
}
