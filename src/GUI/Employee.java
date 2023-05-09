/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Font;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author aziz
 */
public class Employee implements AfficherList{
    private int code;
    private String nom;
    private String prenom;
    private String secteur;
    private int anciennete;
    private String specialite;

    public Employee(int code, String nom, String prenom, String secteur, int anciennete, String specialite) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.secteur = secteur;
        this.anciennete = anciennete;
        this.specialite = specialite;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
    @Override
    public JLabel creeLabelCard(Font font){
        //afficher les details de resultat dans JLabel
        JLabel label = new JLabel();
        label.setText("<html>Name: " + this.nom + " " + this.prenom
        +"<br/>Secteur: " + this.secteur
        +"<br/>Ancienneté: " + this.anciennete
        +"<br/>Specialité: " + this.specialite
        +"</html>"  );
        label.setBounds(10, 80, 120, 80);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        return label;
    
    }
    
    public static ArrayList<Employee> getAvailableEmployees(String secteur, String specialite, LocalDateTime dateRes){
        return new ArrayList<Employee>();
    }
    
    
}
