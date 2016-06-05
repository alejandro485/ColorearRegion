package Vista;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import Logica.Grafo;

public class VistaDatos extends JFrame implements MouseListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private HashMap<String, Component> componentMap;
	// primera fila
	private JCheckBox ch11;
	private JCheckBox ch12;
	private JCheckBox ch13;
	private JCheckBox ch14;
	private JCheckBox ch15;
	private JCheckBox ch16;
	private JCheckBox ch17;
	private JCheckBox ch18;
	private JCheckBox ch19;
	private JCheckBox ch110;
	// segunda fila
	private JCheckBox ch21;
	private JCheckBox ch22;
	private JCheckBox ch23;
	private JCheckBox ch24;
	private JCheckBox ch25;
	private JCheckBox ch26;
	private JCheckBox ch27;
	private JCheckBox ch28;
	private JCheckBox ch29;
	private JCheckBox ch210;
	// tercera fila
	private JCheckBox ch31;
	private JCheckBox ch32;
	private JCheckBox ch33;
	private JCheckBox ch34;
	private JCheckBox ch35;
	private JCheckBox ch36;
	private JCheckBox ch37;
	private JCheckBox ch38;
	private JCheckBox ch39;
	private JCheckBox ch310;
	// cuarta fila
	private JCheckBox ch41;
	private JCheckBox ch42;
	private JCheckBox ch43;
	private JCheckBox ch44;
	private JCheckBox ch45;
	private JCheckBox ch46;
	private JCheckBox ch47;
	private JCheckBox ch48;
	private JCheckBox ch49;
	private JCheckBox ch410;
	// quinta fila
	private JCheckBox ch51;
	private JCheckBox ch52;
	private JCheckBox ch53;
	private JCheckBox ch54;
	private JCheckBox ch55;
	private JCheckBox ch56;
	private JCheckBox ch57;
	private JCheckBox ch58;
	private JCheckBox ch59;
	private JCheckBox ch510;
	// sexta fila
	private JCheckBox ch61;
	private JCheckBox ch62;
	private JCheckBox ch63;
	private JCheckBox ch64;
	private JCheckBox ch65;
	private JCheckBox ch66;
	private JCheckBox ch67;
	private JCheckBox ch68;
	private JCheckBox ch69;
	private JCheckBox ch610;
	// septima fila
	private JCheckBox ch71;
	private JCheckBox ch72;
	private JCheckBox ch73;
	private JCheckBox ch74;
	private JCheckBox ch75;
	private JCheckBox ch76;
	private JCheckBox ch77;
	private JCheckBox ch78;
	private JCheckBox ch79;
	private JCheckBox ch710;
	// octava fila
	private JCheckBox ch81;
	private JCheckBox ch82;
	private JCheckBox ch83;
	private JCheckBox ch84;
	private JCheckBox ch85;
	private JCheckBox ch86;
	private JCheckBox ch87;
	private JCheckBox ch88;
	private JCheckBox ch89;
	private JCheckBox ch810;
	// novena fila
	private JCheckBox ch91;
	private JCheckBox ch92;
	private JCheckBox ch93;
	private JCheckBox ch94;
	private JCheckBox ch95;
	private JCheckBox ch96;
	private JCheckBox ch97;
	private JCheckBox ch98;
	private JCheckBox ch99;
	private JCheckBox ch910;
	// decima fila
	private JCheckBox ch101;
	private JCheckBox ch102;
	private JCheckBox ch103;
	private JCheckBox ch104;
	private JCheckBox ch105;
	private JCheckBox ch106;
	private JCheckBox ch107;
	private JCheckBox ch108;
	private JCheckBox ch109;
	private JCheckBox ch1010;

	private CanvasEntradaGrafo canvasEntrada;
	private Grafo grafo;
	private JButton btnBorrar;
	private JButton btnMatriz;
	private JButton btnRecord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaDatos frame = new VistaDatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1152, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCl = new JLabel("1");
		lblCl.setBounds(840, 12, 18, 15);
		contentPane.add(lblCl);

		JLabel label = new JLabel("2");
		label.setBounds(870, 12, 18, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("3");
		label_1.setBounds(900, 12, 18, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("4");
		label_2.setBounds(930, 12, 18, 15);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("5");
		label_3.setBounds(960, 12, 18, 15);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("6");
		label_4.setBounds(990, 12, 18, 15);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("7");
		label_5.setBounds(1020, 12, 18, 15);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("8");
		label_6.setBounds(1050, 12, 18, 15);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("9");
		label_7.setBounds(1080, 12, 18, 15);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("10");
		label_8.setBounds(1110, 12, 18, 15);
		contentPane.add(label_8);

		JLabel label_9 = new JLabel("1");
		label_9.setBounds(800, 30, 18, 15);
		contentPane.add(label_9);

		JLabel label_10 = new JLabel("2");
		label_10.setBounds(800, 60, 18, 15);
		contentPane.add(label_10);

		JLabel label_11 = new JLabel("3");
		label_11.setBounds(800, 90, 18, 15);
		contentPane.add(label_11);

		JLabel label_12 = new JLabel("4");
		label_12.setBounds(800, 120, 18, 15);
		contentPane.add(label_12);

		JLabel label_13 = new JLabel("5");
		label_13.setBounds(800, 150, 18, 15);
		contentPane.add(label_13);

		JLabel label_14 = new JLabel("6");
		label_14.setBounds(800, 180, 18, 15);
		contentPane.add(label_14);

		JLabel label_15 = new JLabel("7");
		label_15.setBounds(800, 210, 18, 15);
		contentPane.add(label_15);

		JLabel label_16 = new JLabel("8");
		label_16.setBounds(800, 240, 18, 15);
		contentPane.add(label_16);

		JLabel label_17 = new JLabel("9");
		label_17.setBounds(800, 270, 18, 15);
		contentPane.add(label_17);

		JLabel label_18 = new JLabel("10");
		label_18.setBounds(800, 300, 18, 15);
		contentPane.add(label_18);

		grafo = new Grafo();

		canvasEntrada = new CanvasEntradaGrafo();
		canvasEntrada.setBounds(10, 10, 770, 623);
		canvasEntrada.setVisible(true);
		canvasEntrada.addMouseListener(this);
		contentPane.add(canvasEntrada);

		btnBorrar = new JButton("Limpiar");
		btnBorrar.setBounds(810, 330, 100, 20);
		btnBorrar.addActionListener(this);
		btnBorrar.setActionCommand("br");
		contentPane.add(btnBorrar);

		btnMatriz = new JButton("Matriz");
		btnMatriz.setBounds(920, 330, 100, 20);
		btnMatriz.addActionListener(this);
		btnMatriz.setActionCommand("ma");
		contentPane.add(btnMatriz);

		btnRecord = new JButton("Regiones");
		btnRecord.setBounds(1030, 330, 110, 20);
		btnRecord.addActionListener(this);
		btnRecord.setActionCommand("re");
		contentPane.add(btnRecord);

		cargarCheckBox();
		createComponentMap();
		canvasEntrada.repaint();
	}

	private void limpiar() {
		grafo = new Grafo();
		canvasEntrada.setLista(grafo);
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				getComponentByName("ch" + i + j).setEnabled(false);
				((JCheckBox) getComponentByName("ch" + i + j)).setSelected(false);
			}
		}
	}

	private void habilitarMatriz() {
		int n = grafo.nodos;
		for (int i = 1; i<= n; i++) {
			for(int j=1; j<i; j++){
				getComponentByName("ch" + j + i).setEnabled(true);
			}
		}
	}

	private void AgregarAdyacentes(){
		JCheckBox ay;
		for(int i=1; i<=10; i++){
			for(int j=1; j<=10;j++){
				ay=(JCheckBox) getComponentByName("ch" + i + j);
				if(ay.isSelected() && ay.isEnabled()){
					grafo.AgregarArista(i-1, j-1);
				}
			}
		}
		grafo.generarRegiones();
		canvasEntrada.setLista(grafo);
	}
	
	private void createComponentMap() {
		componentMap = new HashMap<String, Component>();
		Component[] components = this.getContentPane().getComponents();
		for (int i = 0; i < components.length; i++) {
			componentMap.put(components[i].getName(), components[i]);
		}
	}

	public Component getComponentByName(String name) {
		if (componentMap.containsKey(name)) {
			return (Component) componentMap.get(name);
		} else
			return null;
	}

	private void cargarCheckBox() {
		// primera fila
		ch11 = new JCheckBox();
		ch11.setBounds(840, 30, 20, 20);
		ch11.setEnabled(false);
		contentPane.add(ch11);

		ch12 = new JCheckBox();
		ch12.setBounds(870, 30, 20, 20);
		ch12.setEnabled(false);
		contentPane.add(ch12);

		ch13 = new JCheckBox();
		ch13.setBounds(900, 30, 20, 20);
		ch13.setEnabled(false);
		contentPane.add(ch13);

		ch14 = new JCheckBox();
		ch14.setBounds(930, 30, 20, 20);
		ch14.setEnabled(false);
		contentPane.add(ch14);

		ch15 = new JCheckBox();
		ch15.setBounds(960, 30, 20, 20);
		ch15.setEnabled(false);
		contentPane.add(ch15);

		ch16 = new JCheckBox();
		ch16.setBounds(990, 30, 20, 20);
		ch16.setEnabled(false);
		contentPane.add(ch16);

		ch17 = new JCheckBox();
		ch17.setBounds(1020, 30, 20, 20);
		ch17.setEnabled(false);
		contentPane.add(ch17);

		ch18 = new JCheckBox();
		ch18.setBounds(1050, 30, 20, 20);
		ch18.setEnabled(false);
		contentPane.add(ch18);

		ch19 = new JCheckBox();
		ch19.setBounds(1080, 30, 20, 20);
		ch19.setEnabled(false);
		contentPane.add(ch19);

		ch110 = new JCheckBox();
		ch110.setBounds(1110, 30, 20, 20);
		ch110.setEnabled(false);
		contentPane.add(ch110);

		// segunda fila
		ch21 = new JCheckBox();
		ch21.setBounds(840, 60, 20, 20);
		ch21.setEnabled(false);
		contentPane.add(ch21);

		ch22 = new JCheckBox();
		ch22.setBounds(870, 60, 20, 20);
		ch22.setEnabled(false);
		contentPane.add(ch22);

		ch23 = new JCheckBox();
		ch23.setBounds(900, 60, 20, 20);
		ch23.setEnabled(false);
		contentPane.add(ch23);

		ch24 = new JCheckBox();
		ch24.setBounds(930, 60, 20, 20);
		ch24.setEnabled(false);
		contentPane.add(ch24);

		ch25 = new JCheckBox();
		ch25.setBounds(960, 60, 20, 20);
		ch25.setEnabled(false);
		contentPane.add(ch25);

		ch26 = new JCheckBox();
		ch26.setBounds(990, 60, 20, 20);
		ch26.setEnabled(false);
		contentPane.add(ch26);

		ch27 = new JCheckBox();
		ch27.setBounds(1020, 60, 20, 20);
		ch27.setEnabled(false);
		contentPane.add(ch27);

		ch28 = new JCheckBox();
		ch28.setBounds(1050, 60, 20, 20);
		ch28.setEnabled(false);
		contentPane.add(ch28);

		ch29 = new JCheckBox();
		ch29.setBounds(1080, 60, 20, 20);
		ch29.setEnabled(false);
		contentPane.add(ch29);

		ch210 = new JCheckBox();
		ch210.setBounds(1110, 60, 20, 20);
		ch210.setEnabled(false);
		contentPane.add(ch210);

		// tercera fila
		ch31 = new JCheckBox();
		ch31.setBounds(840, 90, 20, 20);
		ch31.setEnabled(false);
		contentPane.add(ch31);

		ch32 = new JCheckBox();
		ch32.setBounds(870, 90, 20, 20);
		ch32.setEnabled(false);
		contentPane.add(ch32);

		ch33 = new JCheckBox();
		ch33.setBounds(900, 90, 20, 20);
		ch33.setEnabled(false);
		contentPane.add(ch33);

		ch34 = new JCheckBox();
		ch34.setBounds(930, 90, 20, 20);
		ch34.setEnabled(false);
		contentPane.add(ch34);

		ch35 = new JCheckBox();
		ch35.setBounds(960, 90, 20, 20);
		ch35.setEnabled(false);
		contentPane.add(ch35);

		ch36 = new JCheckBox();
		ch36.setBounds(990, 90, 20, 20);
		ch36.setEnabled(false);
		contentPane.add(ch36);

		ch37 = new JCheckBox();
		ch37.setBounds(1020, 90, 20, 20);
		ch37.setEnabled(false);
		contentPane.add(ch37);

		ch38 = new JCheckBox();
		ch38.setBounds(1050, 90, 20, 20);
		ch38.setEnabled(false);
		contentPane.add(ch38);

		ch39 = new JCheckBox();
		ch39.setBounds(1080, 90, 20, 20);
		ch39.setEnabled(false);
		contentPane.add(ch39);

		ch310 = new JCheckBox();
		ch310.setBounds(1110, 90, 20, 20);
		ch310.setEnabled(false);
		contentPane.add(ch310);

		// cuarta fila
		ch41 = new JCheckBox();
		ch41.setBounds(840, 120, 20, 20);
		ch41.setEnabled(false);
		contentPane.add(ch41);

		ch42 = new JCheckBox();
		ch42.setBounds(870, 120, 20, 20);
		ch42.setEnabled(false);
		contentPane.add(ch42);

		ch43 = new JCheckBox();
		ch43.setBounds(900, 120, 20, 20);
		ch43.setEnabled(false);
		contentPane.add(ch43);

		ch44 = new JCheckBox();
		ch44.setBounds(930, 120, 20, 20);
		ch44.setEnabled(false);
		contentPane.add(ch44);

		ch45 = new JCheckBox();
		ch45.setBounds(960, 120, 20, 20);
		ch45.setEnabled(false);
		contentPane.add(ch45);

		ch46 = new JCheckBox();
		ch46.setBounds(990, 120, 20, 20);
		ch46.setEnabled(false);
		contentPane.add(ch46);

		ch47 = new JCheckBox();
		ch47.setBounds(1020, 120, 20, 20);
		ch47.setEnabled(false);
		contentPane.add(ch47);

		ch48 = new JCheckBox();
		ch48.setBounds(1050, 120, 20, 20);
		ch48.setEnabled(false);
		contentPane.add(ch48);

		ch49 = new JCheckBox();
		ch49.setBounds(1080, 120, 20, 20);
		ch49.setEnabled(false);
		contentPane.add(ch49);

		ch410 = new JCheckBox();
		ch410.setBounds(1110, 120, 20, 20);
		ch410.setEnabled(false);
		contentPane.add(ch410);

		// quinta fila
		ch51 = new JCheckBox();
		ch51.setBounds(840, 150, 20, 20);
		ch51.setEnabled(false);
		contentPane.add(ch51);

		ch52 = new JCheckBox();
		ch52.setBounds(870, 150, 20, 20);
		ch52.setEnabled(false);
		contentPane.add(ch52);

		ch53 = new JCheckBox();
		ch53.setBounds(900, 150, 20, 20);
		ch53.setEnabled(false);
		contentPane.add(ch53);

		ch54 = new JCheckBox();
		ch54.setBounds(930, 150, 20, 20);
		ch54.setEnabled(false);
		contentPane.add(ch54);

		ch55 = new JCheckBox();
		ch55.setBounds(960, 150, 20, 20);
		ch55.setEnabled(false);
		contentPane.add(ch55);

		ch56 = new JCheckBox();
		ch56.setBounds(990, 150, 20, 20);
		ch56.setEnabled(false);
		contentPane.add(ch56);

		ch57 = new JCheckBox();
		ch57.setBounds(1020, 150, 20, 20);
		ch57.setEnabled(false);
		contentPane.add(ch57);

		ch58 = new JCheckBox();
		ch58.setBounds(1050, 150, 20, 20);
		ch58.setEnabled(false);
		contentPane.add(ch58);

		ch59 = new JCheckBox();
		ch59.setBounds(1080, 150, 20, 20);
		ch59.setEnabled(false);
		contentPane.add(ch59);

		ch510 = new JCheckBox();
		ch510.setBounds(1110, 150, 20, 20);
		ch510.setEnabled(false);
		contentPane.add(ch510);

		// sexta fila
		ch61 = new JCheckBox();
		ch61.setBounds(840, 180, 20, 20);
		ch61.setEnabled(false);
		contentPane.add(ch61);

		ch62 = new JCheckBox();
		ch62.setBounds(870, 180, 20, 20);
		ch62.setEnabled(false);
		contentPane.add(ch62);

		ch63 = new JCheckBox();
		ch63.setBounds(900, 180, 20, 20);
		ch63.setEnabled(false);
		contentPane.add(ch63);

		ch64 = new JCheckBox();
		ch64.setBounds(930, 180, 20, 20);
		ch64.setEnabled(false);
		contentPane.add(ch64);

		ch65 = new JCheckBox();
		ch65.setBounds(960, 180, 20, 20);
		ch65.setEnabled(false);
		contentPane.add(ch65);

		ch66 = new JCheckBox();
		ch66.setBounds(990, 180, 20, 20);
		ch66.setEnabled(false);
		contentPane.add(ch66);

		ch67 = new JCheckBox();
		ch67.setBounds(1020, 180, 20, 20);
		ch67.setEnabled(false);
		contentPane.add(ch67);

		ch68 = new JCheckBox();
		ch68.setBounds(1050, 180, 20, 20);
		ch68.setEnabled(false);
		contentPane.add(ch68);

		ch69 = new JCheckBox();
		ch69.setBounds(1080, 180, 20, 20);
		ch69.setEnabled(false);
		contentPane.add(ch69);

		ch610 = new JCheckBox();
		ch610.setBounds(1110, 180, 20, 20);
		ch610.setEnabled(false);
		contentPane.add(ch610);

		// septima fila
		ch71 = new JCheckBox();
		ch71.setBounds(840, 210, 20, 20);
		ch71.setEnabled(false);
		contentPane.add(ch71);

		ch72 = new JCheckBox();
		ch72.setBounds(870, 210, 20, 20);
		ch72.setEnabled(false);
		contentPane.add(ch72);

		ch73 = new JCheckBox();
		ch73.setBounds(900, 210, 20, 20);
		ch73.setEnabled(false);
		contentPane.add(ch73);

		ch74 = new JCheckBox();
		ch74.setBounds(930, 210, 20, 20);
		ch74.setEnabled(false);
		contentPane.add(ch74);

		ch75 = new JCheckBox();
		ch75.setBounds(960, 210, 20, 20);
		ch75.setEnabled(false);
		contentPane.add(ch75);

		ch76 = new JCheckBox();
		ch76.setBounds(990, 210, 20, 20);
		ch76.setEnabled(false);
		contentPane.add(ch76);

		ch77 = new JCheckBox();
		ch77.setBounds(1020, 210, 20, 20);
		ch77.setEnabled(false);
		contentPane.add(ch77);

		ch78 = new JCheckBox();
		ch78.setBounds(1050, 210, 20, 20);
		ch78.setEnabled(false);
		contentPane.add(ch78);

		ch79 = new JCheckBox();
		ch79.setBounds(1080, 210, 20, 20);
		ch79.setEnabled(false);
		contentPane.add(ch79);

		ch710 = new JCheckBox();
		ch710.setBounds(1110, 210, 20, 20);
		ch710.setEnabled(false);
		contentPane.add(ch710);

		// octava fila
		ch81 = new JCheckBox();
		ch81.setBounds(840, 240, 20, 20);
		ch81.setEnabled(false);
		contentPane.add(ch81);

		ch82 = new JCheckBox();
		ch82.setBounds(870, 240, 20, 20);
		ch82.setEnabled(false);
		contentPane.add(ch82);

		ch83 = new JCheckBox();
		ch83.setBounds(900, 240, 20, 20);
		ch83.setEnabled(false);
		contentPane.add(ch83);

		ch84 = new JCheckBox();
		ch84.setBounds(930, 240, 20, 20);
		ch84.setEnabled(false);
		contentPane.add(ch84);

		ch85 = new JCheckBox();
		ch85.setBounds(960, 240, 20, 20);
		ch85.setEnabled(false);
		contentPane.add(ch85);

		ch86 = new JCheckBox();
		ch86.setBounds(990, 240, 20, 20);
		ch86.setEnabled(false);
		contentPane.add(ch86);

		ch87 = new JCheckBox();
		ch87.setBounds(1020, 240, 20, 20);
		ch87.setEnabled(false);
		contentPane.add(ch87);

		ch88 = new JCheckBox();
		ch88.setBounds(1050, 240, 20, 20);
		ch88.setEnabled(false);
		contentPane.add(ch88);

		ch89 = new JCheckBox();
		ch89.setBounds(1080, 240, 20, 20);
		ch89.setEnabled(false);
		contentPane.add(ch89);

		ch810 = new JCheckBox();
		ch810.setBounds(1110, 240, 20, 20);
		ch810.setEnabled(false);
		contentPane.add(ch810);

		// novena fila
		ch91 = new JCheckBox();
		ch91.setBounds(840, 270, 20, 20);
		ch91.setEnabled(false);
		contentPane.add(ch91);

		ch92 = new JCheckBox();
		ch92.setBounds(870, 270, 20, 20);
		ch92.setEnabled(false);
		contentPane.add(ch92);

		ch93 = new JCheckBox();
		ch93.setBounds(900, 270, 20, 20);
		ch93.setEnabled(false);
		contentPane.add(ch93);

		ch94 = new JCheckBox();
		ch94.setBounds(930, 270, 20, 20);
		ch94.setEnabled(false);
		contentPane.add(ch94);

		ch95 = new JCheckBox();
		ch95.setBounds(960, 270, 20, 20);
		ch95.setEnabled(false);
		contentPane.add(ch95);

		ch96 = new JCheckBox();
		ch96.setBounds(990, 270, 20, 20);
		ch96.setEnabled(false);
		contentPane.add(ch96);

		ch97 = new JCheckBox();
		ch97.setBounds(1020, 270, 20, 20);
		ch97.setEnabled(false);
		contentPane.add(ch97);

		ch98 = new JCheckBox();
		ch98.setBounds(1050, 270, 20, 20);
		ch98.setEnabled(false);
		contentPane.add(ch98);

		ch99 = new JCheckBox();
		ch99.setBounds(1080, 270, 20, 20);
		ch99.setEnabled(false);
		contentPane.add(ch99);

		ch910 = new JCheckBox();
		ch910.setBounds(1110, 270, 20, 20);
		ch910.setEnabled(false);
		contentPane.add(ch910);

		// decima fila
		ch101 = new JCheckBox();
		ch101.setBounds(840, 300, 20, 20);
		ch101.setEnabled(false);
		contentPane.add(ch101);

		ch102 = new JCheckBox();
		ch102.setBounds(870, 300, 20, 20);
		ch102.setEnabled(false);
		contentPane.add(ch102);

		ch103 = new JCheckBox();
		ch103.setBounds(900, 300, 20, 20);
		ch103.setEnabled(false);
		contentPane.add(ch103);

		ch104 = new JCheckBox();
		ch104.setBounds(930, 300, 20, 20);
		ch104.setEnabled(false);
		contentPane.add(ch104);

		ch105 = new JCheckBox();
		ch105.setBounds(960, 300, 20, 20);
		ch105.setEnabled(false);
		contentPane.add(ch105);

		ch106 = new JCheckBox();
		ch106.setBounds(990, 300, 20, 20);
		ch106.setEnabled(false);
		contentPane.add(ch106);

		ch107 = new JCheckBox();
		ch107.setBounds(1020, 300, 20, 20);
		ch107.setEnabled(false);
		contentPane.add(ch107);

		ch108 = new JCheckBox();
		ch108.setBounds(1050, 300, 20, 20);
		ch108.setEnabled(false);
		contentPane.add(ch108);

		ch109 = new JCheckBox();
		ch109.setBounds(1080, 300, 20, 20);
		ch109.setEnabled(false);
		contentPane.add(ch109);

		ch1010 = new JCheckBox();
		ch1010.setBounds(1110, 300, 20, 20);
		ch1010.setEnabled(false);
		contentPane.add(ch1010);
		
		ch11.setName("ch11");
		ch12.setName("ch12");
		ch13.setName("ch13");
		ch14.setName("ch14");
		ch15.setName("ch15");
		ch16.setName("ch16");
		ch17.setName("ch17");
		ch18.setName("ch18");
		ch19.setName("ch19");
		ch110.setName("ch110");
		ch21.setName("ch21");
		ch22.setName("ch22");
		ch23.setName("ch23");
		ch24.setName("ch24");
		ch25.setName("ch25");
		ch26.setName("ch26");
		ch27.setName("ch27");
		ch28.setName("ch28");
		ch29.setName("ch29");
		ch210.setName("ch210");
		ch31.setName("ch31");
		ch32.setName("ch32");
		ch33.setName("ch33");
		ch34.setName("ch34");
		ch35.setName("ch35");
		ch36.setName("ch36");
		ch37.setName("ch37");
		ch38.setName("ch38");
		ch39.setName("ch39");
		ch310.setName("ch310");
		ch41.setName("ch41");
		ch42.setName("ch42");
		ch43.setName("ch43");
		ch44.setName("ch44");
		ch45.setName("ch45");
		ch46.setName("ch46");
		ch47.setName("ch47");
		ch48.setName("ch48");
		ch49.setName("ch49");
		ch410.setName("ch410");
		ch51.setName("ch51");
		ch52.setName("ch52");
		ch53.setName("ch53");
		ch54.setName("ch54");
		ch55.setName("ch55");
		ch56.setName("ch56");
		ch57.setName("ch57");
		ch58.setName("ch58");
		ch59.setName("ch59");
		ch510.setName("ch510");
		ch61.setName("ch61");
		ch62.setName("ch62");
		ch63.setName("ch63");
		ch64.setName("ch64");
		ch65.setName("ch65");
		ch66.setName("ch66");
		ch67.setName("ch67");
		ch68.setName("ch68");
		ch69.setName("ch69");
		ch610.setName("ch610");
		ch71.setName("ch71");
		ch72.setName("ch72");
		ch73.setName("ch73");
		ch74.setName("ch74");
		ch75.setName("ch75");
		ch76.setName("ch76");
		ch77.setName("ch77");
		ch78.setName("ch78");
		ch79.setName("ch79");
		ch710.setName("ch710");
		ch81.setName("ch81");
		ch82.setName("ch82");
		ch83.setName("ch83");
		ch84.setName("ch84");
		ch85.setName("ch85");
		ch86.setName("ch86");
		ch87.setName("ch87");
		ch88.setName("ch88");
		ch89.setName("ch89");
		ch810.setName("ch810");
		ch91.setName("ch91");
		ch92.setName("ch92");
		ch93.setName("ch93");
		ch94.setName("ch94");
		ch95.setName("ch95");
		ch96.setName("ch96");
		ch97.setName("ch97");
		ch98.setName("ch98");
		ch99.setName("ch99");
		ch910.setName("ch910");
		ch101.setName("ch101");
		ch102.setName("ch102");
		ch103.setName("ch103");
		ch104.setName("ch104");
		ch105.setName("ch105");
		ch106.setName("ch106");
		ch107.setName("ch107");
		ch108.setName("ch108");
		ch109.setName("ch109");
		ch1010.setName("ch1010");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		grafo.AgregarNodo(e.getX(), e.getY());
		canvasEntrada.setLista(grafo);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "br":
			limpiar();
			break;
		case "ma":
			habilitarMatriz();
			break;
		case "re":
			AgregarAdyacentes();
			break;
		}
	}
}
