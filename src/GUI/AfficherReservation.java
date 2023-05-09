/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author aziz
 */
public class AfficherReservation {
 
    
    

// afficher les reservation pour les employe
public static void AfficherReservatoinEmploye( JPanel reservationContainer, AfficherList [] interfaceArray){

        Font font = new Font("Arial", Font.PLAIN, 16);
        
        reservationContainer.setLayout(new GridLayout(interfaceArray.length/2+1,2,20,20));
        reservationContainer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        reservationContainer.setLayout(new FlowLayout());
    
//      loop through the state 
      for (AfficherList object : interfaceArray){
        //afficher les details de resultat dans JLabel
        JLabel label = new JLabel();
        label = object.creeLabelCard(font);
        
        //carte de reservation JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,0, 5));
        
        //Ajouter resultat Button 
        JButton addResult = new JButton("Ajouter Resultat"); 
        addResult.setFont(font);
        addResult.setBackground(Color.BLUE);
        addResult.setForeground(Color.WHITE);

        //Ajouter resultat & supprimer la carte
        addResult.addActionListener(e -> {
            JTextField resultField = new JTextField(20);
            JTextField treatmentField = new JTextField(20);

            JPanel formPanel = new JPanel();
            formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
            formPanel.add(new JLabel("Result:"));
            formPanel.add(resultField);
            formPanel.add(new JLabel("Treatment:"));
            formPanel.add(treatmentField);

            //Employee employee = null; // Replace with your employee object
            JTextField recommendationField = new JTextField(20);
            if (/*employee.isDoctor()*/ 1!=1) {
//                JTextField recommendationField = new JTextField(20);
                formPanel.add(new JLabel("Recommendation:"));
                formPanel.add(recommendationField);
            }else{
                recommendationField= null; 
            }

            int option = JOptionPane.showOptionDialog(reservationContainer, formPanel, "Add Result", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            if (option == JOptionPane.OK_OPTION) {
                String result = resultField.getText();
                String treatment = treatmentField.getText();
                String recommendation = null;
                if (/*employee.isDoctor()*/ 1!=1) {
                    recommendation = recommendationField.getText();                
                }
                  
                // #TODO: ajouter consultation a la db et supprimer la reservation
                System.out.println("Result: " + result);
                System.out.println("Treatment: " + treatment);
                System.out.println("Recommendation: " + recommendation);
                
                reservationContainer.remove(panel);
                reservationContainer.revalidate();
                reservationContainer.repaint();
            }
        });
        
        
        
        
        //Annuler reservation Button******************************************** 
        JButton removeButton = new JButton("Annuler");
        removeButton.setFont(font);
        removeButton.setBackground(Color.RED);
        removeButton.setForeground(Color.WHITE);
        //Demande d'Annulation
        removeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(reservationContainer, "Êtes-vous sûr de vouloir annuler la réservation?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String reason = JOptionPane.showInputDialog(reservationContainer, "Veuillez indiquer la raison de la demande de l'annulation :");
                if (reason != null && !reason.isEmpty()) {
                    // #TODO : remove the reservation from the db and add it to its table   
                    System.out.println("Reservation deleted. Reason: " + reason);
                } else {
                    // #in this case the reason attribute will contain null
                    System.out.println("No reason provided for cancellation.");
                }
                reservationContainer.remove(panel);
                reservationContainer.revalidate();
                reservationContainer.repaint();
                }
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(removeButton);
        buttonPanel.add(addResult);
        buttonPanel.setBackground(Color.WHITE);
        Border lineBorder = BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK);
        buttonPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0), lineBorder));

        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.setBackground(Color.WHITE);

        reservationContainer.add(panel);
        System.out.println("GUI.Main.reservationBtnActionPerformed() " );
    
    }
    
//        reinisialliser Container (Grid)
        reservationContainer.revalidate();
        reservationContainer.repaint();
        System.out.println("GUI.Main.reservationBtnActionPerformed()");
    
    }

// afficher Consultation pour le responsable
public static void AfficherConsultation(JPanel reservationContainer, AfficherList [] interfaceArray){
        Font font = new Font("Arial", Font.PLAIN, 16);
        
        reservationContainer.setLayout(new GridLayout(interfaceArray.length/2+1,2,20,20));
        reservationContainer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        reservationContainer.setLayout(new FlowLayout());
    
//      loop through the state 
      for (AfficherList object : interfaceArray){
        //afficher les details de resultat dans JLabel
        JLabel label = new JLabel();
        label = object.creeLabelCard(font);
        
        //carte de reservation JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,0, 5));
        panel.setBackground(Color.WHITE);
        reservationContainer.add(panel);
// ---------END OF THE LOOP
      }
      
//        reinisialliser Container (Grid)
    reservationContainer.revalidate();
    reservationContainer.repaint();
      
      
// ---------END OF THE FUNCTOIN     
 }


    
// ---------END OF CLASS     
}                                              
