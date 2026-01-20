package practicas.ej8;

import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ej8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldHilo1;
	private JTextField textFieldHilo2;
	List<JButton> botones = new ArrayList<JButton>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej8 frame = new ej8();
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
	public ej8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ComenzarProceso = new JButton("ComenzarProceso");
		ComenzarProceso.setBounds(142, 36, 130, 23);
		contentPane.add(ComenzarProceso);
		ComenzarProceso.setName("ComenzarProceso");
		
		JButton Reanudar1 = new JButton("Reanudar");
		Reanudar1.setEnabled(false);
		Reanudar1.setName("Reanudar1");
		Reanudar1.setBounds(62, 76, 130, 23);
		contentPane.add(Reanudar1);
		
		JButton Reanudar2 = new JButton("Reanudar");
		Reanudar2.setEnabled(false);
		Reanudar2.setName("Reanudar1");
		Reanudar2.setBounds(218, 76, 130, 23);
		contentPane.add(Reanudar2);
		
		JButton Suspender1 = new JButton("Suspender");
		Suspender1.setEnabled(false);
		Suspender1.setName("Suspender1");
		Suspender1.setBounds(62, 130, 130, 23);
		contentPane.add(Suspender1);
		
		JButton Suspender2 = new JButton("Suspender");
		Suspender2.setEnabled(false);
		Suspender2.setName("Suspender2");
		Suspender2.setBounds(218, 130, 130, 23);
		contentPane.add(Suspender2);
		
		textFieldHilo1 = new JTextField();
		textFieldHilo1.setEditable(false);
		textFieldHilo1.setBounds(85, 164, 86, 20);
		textFieldHilo1.setBackground(Color.WHITE);
		contentPane.add(textFieldHilo1);
	
		
		textFieldHilo2 = new JTextField();
		textFieldHilo2.setEditable(false);
		textFieldHilo2.setColumns(10);
		textFieldHilo2.setBounds(242, 164, 86, 20);
		textFieldHilo2.setBackground(Color.WHITE);
		contentPane.add(textFieldHilo2);
		
		JLabel lblNewLabel = new JLabel("Hilo 1");
		lblNewLabel.setBounds(110, 195, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHilo = new JLabel("Hilo 2");
		lblHilo.setBounds(265, 195, 46, 14);
		contentPane.add(lblHilo);
		
		JButton btnFinalizarProceso = new JButton("Finalizar Proceso");
		btnFinalizarProceso.setEnabled(false);
		btnFinalizarProceso.setBounds(142, 227, 130, 23);
		btnFinalizarProceso.setName("btnFinalizarProceso");
		contentPane.add(btnFinalizarProceso);
		
		botones.add(ComenzarProceso);
		botones.add(Reanudar1);
		botones.add(Reanudar2);
		botones.add(Suspender1);
		botones.add(Suspender2);
		botones.add(btnFinalizarProceso);
		MyHilo hilo1 = new MyHilo(textFieldHilo1);
		MyHilo hilo2 = new MyHilo(textFieldHilo2);
		
		
		ActionListener listener = (e ->{
			JButton boton = (JButton) e.getSource();
			if(boton == ComenzarProceso) {
				hilo1.start();
				hilo2.start();
				
				for (JButton jButton : botones) {
					jButton.setEnabled(true);
				}
				ComenzarProceso.setEnabled(false);
			}
			else if(boton == Reanudar1) {
				hilo1.Reanuda();
			}
			else if(boton == Reanudar2) {
				hilo2.Suspende();
			}
			else if(boton == Suspender1) {
				hilo1.Suspende();
			}
			else if(boton == Suspender2) {
				hilo2.Suspende();
			}
			
			});
			
		
	}
}
