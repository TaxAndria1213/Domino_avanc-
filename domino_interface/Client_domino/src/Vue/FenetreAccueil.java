package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pack_principal.ClientPrincipal;

public class FenetreAccueil {
	private JFrame fenetre_principal;
	private JButton btn_commencer;
	public String nom_joueur;
	
	public FenetreAccueil() {
		fenetre_principal = new JFrame();
		
		JPanel cont_label_domino = new JPanel();
		cont_label_domino.setPreferredSize(new Dimension(700, 100));
		JLabel label_domino = new JLabel("Domino");
		label_domino.setForeground(new Color(175, 25, 25));
		label_domino.setFont(new Font("Arial", Font.BOLD, 45));
		cont_label_domino.add(label_domino);
		
		
		JPanel panel_principal = new JPanel();
		panel_principal.setLayout(new BorderLayout());
		btn_commencer = new JButton("Commencer");
		btn_commencer.setPreferredSize(new Dimension(25, 50));
		btn_commencer.setForeground(new Color(255, 255, 255));
		btn_commencer.setFont(new Font("Arial", Font.BOLD, 20));
		btn_commencer.setBackground(new Color(50, 150, 255));
		
		panel_principal.add(cont_label_domino, BorderLayout.NORTH);
		panel_principal.add(btn_commencer, BorderLayout.SOUTH);
		
		
		JLabel label_nom = new JLabel("Choisisser votre nom de joueur : ");
		JPanel conteneur_combo_box = new JPanel();
		JComboBox<String> liste_nom = new JComboBox<String>();
		liste_nom.addItem("Bruno");
		liste_nom.addItem("Kaleba");
		liste_nom.addItem("Manjaka");
		conteneur_combo_box.add(label_nom);
		conteneur_combo_box.add(liste_nom);
		
		panel_principal.add(conteneur_combo_box, BorderLayout.CENTER);
		
		btn_commencer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nom_joueur = liste_nom.getSelectedItem().toString();
				new ClientPrincipal(new FenetreDeJeu(), nom_joueur);
				fenetre_principal.dispose();
			}
		});
		
		fenetre_principal.setSize(new Dimension(500, 350));
		fenetre_principal.setResizable(false);
		fenetre_principal.setLocationRelativeTo(null);
		fenetre_principal.setContentPane(panel_principal);
		fenetre_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre_principal.setVisible(true);
	}
}
