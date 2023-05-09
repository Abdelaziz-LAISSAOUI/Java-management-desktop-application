/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author aziz
 */
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Reservation implements AfficherList{
    private int numero;
    private LocalDateTime dateResa;
    private LocalDate dateDePrend;
    private String typeResa;
    private String serviceResa;
    private String descRes;
    private int nssPatient;
    private int codeEmploye;

    // Constructor
    public Reservation(int numero, LocalDateTime dateResa, LocalDate dateDePrend, String typeResa,
                       String serviceResa, String descRes, int nssPatient, int codeEmploye) {
        this.numero = numero;
        this.dateResa = dateResa;
        this.dateDePrend = dateDePrend;
        this.typeResa = typeResa;
        this.serviceResa = serviceResa;
        this.descRes = descRes;
        this.nssPatient = nssPatient;
        this.codeEmploye = codeEmploye;
    }
   
    private final DateTimeFormatter HourFormatter = DateTimeFormatter.ofPattern("dd/MMM - HH:mm");;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
    // Getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getDateResa() {
        return dateResa;
    }

    public String getFormattedDateResa() {
        return dateResa.format(HourFormatter);
    }

    public void setDateResa(LocalDateTime dateResa) {
        this.dateResa = dateResa;
    }

    public LocalDate getDateDePrend() {
        return dateDePrend;
    }

    public String getFormattedDateDePrend() {
        return dateDePrend.format(formatter);
    }

    public void setDateDePrend(LocalDate dateDePrend) {
        this.dateDePrend = dateDePrend;
    }

    public String getTypeResa() {
        return typeResa;
    }

    public void setTypeResa(String typeResa) {
        this.typeResa = typeResa;
    }

    public String getServiceResa() {
        return serviceResa;
    }

    public void setServiceResa(String serviceResa) {
        this.serviceResa = serviceResa;
    }

    public String getDescRes() {
        return descRes;
    }

    public void setDescRes(String descRes) {
        this.descRes = descRes;
    }

    public int getNssPatient() {
        return nssPatient;
    }

    public void setNssPatient(int nssPatient) {
        this.nssPatient = nssPatient;
    }

    public int getCodeEmploye() {
        return codeEmploye;
    }

    public void setCodeEmploye(int codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    @Override
    public JLabel creeLabelCard(Font font) {
        JLabel label = new JLabel();
        if ("paramédicale".equals(this.typeResa))
            label.setText("<html>Date de Reservation: " + this.getFormattedDateResa()
            +"<br/>date de prendre: " + this.getFormattedDateDePrend()
            +"<br/>type de reservation : " + this.typeResa        
            +"<br/>service : " + this.serviceResa
            +"<br/>description : " + this.descRes
            +"</html>"  );
        else
            label.setText("<html>Date de Reservation: " + this.getFormattedDateResa()
            +"<br/>date de prendre: " + this.getFormattedDateDePrend()
            +"<br/>type de reservation : " + this.typeResa        
            +"<br/>description : " + this.descRes
            +"</html>"  );
        label.setBounds(10, 80, 120, 80);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
                
        return label;        
                
                
                
    }
}

