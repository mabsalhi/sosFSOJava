/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.sosfso.grh.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author abdel
 */
@Entity
public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String cin;
    private int som;
    private int posteBudgetaire;
    
    private String nom;
    private String prenom;
    private String nomAr;
    private String prenomAr;
    
    private Date dateNaissance;
    private String lieuNaissance;
    private String etatMatrimonial;
    
    private int nbEnfants;
    
    private String adresse;
    
    private String telephonne;
    
    private Byte[] photo;
    
    private List<Diplome> diplomes;
    
    private List<Situation> situations;
    
    private List<Affectation> affectations;
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public int getSom() {
        return som;
    }

    public void setSom(int som) {
        this.som = som;
    }

    public int getPosteBudgetaire() {
        return posteBudgetaire;
    }

    public void setPosteBudgetaire(int posteBudgetaire) {
        this.posteBudgetaire = posteBudgetaire;
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

    public String getNomAr() {
        return nomAr;
    }

    public void setNomAr(String nomAr) {
        this.nomAr = nomAr;
    }

    public String getPrenomAr() {
        return prenomAr;
    }

    public void setPrenomAr(String prenomAr) {
        this.prenomAr = prenomAr;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getEtatMatrimonial() {
        return etatMatrimonial;
    }

    public void setEtatMatrimonial(String etatMatrimonial) {
        this.etatMatrimonial = etatMatrimonial;
    }

    public int getNbEnfants() {
        return nbEnfants;
    }

    public void setNbEnfants(int nbEnfants) {
        this.nbEnfants = nbEnfants;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephonne() {
        return telephonne;
    }

    public void setTelephonne(String telephonne) {
        this.telephonne = telephonne;
    }

    @Lob
    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    @OneToMany
    public List<Diplome> getDiplomes() {
        return diplomes;
    }
    
    public void setDiplomes(List<Diplome> diplomes) {
        this.diplomes = diplomes;
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personne")
    public List<Situation> getSituations() {
        return situations;
    }
    
    public void setSituations(List<Situation> situations) {
        this.situations = situations;
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personne")
    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.cin);
        hash = 41 * hash + this.som;
        hash = 41 * hash + this.posteBudgetaire;
        hash = 41 * hash + Objects.hashCode(this.nom);
        hash = 41 * hash + Objects.hashCode(this.prenom);
        hash = 41 * hash + Objects.hashCode(this.nomAr);
        hash = 41 * hash + Objects.hashCode(this.prenomAr);
        hash = 41 * hash + Objects.hashCode(this.dateNaissance);
        hash = 41 * hash + Objects.hashCode(this.lieuNaissance);
        hash = 41 * hash + Objects.hashCode(this.etatMatrimonial);
        hash = 41 * hash + this.nbEnfants;
        hash = 41 * hash + Objects.hashCode(this.adresse);
        hash = 41 * hash + Objects.hashCode(this.telephonne);
        hash = 41 * hash + Arrays.deepHashCode(this.photo);
        hash = 41 * hash + Objects.hashCode(this.diplomes);
        hash = 41 * hash + Objects.hashCode(this.situations);
        hash = 41 * hash + Objects.hashCode(this.affectations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        if (this.som != other.som) {
            return false;
        }
        if (this.posteBudgetaire != other.posteBudgetaire) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.nomAr, other.nomAr)) {
            return false;
        }
        if (!Objects.equals(this.prenomAr, other.prenomAr)) {
            return false;
        }
        if (!Objects.equals(this.dateNaissance, other.dateNaissance)) {
            return false;
        }
        if (!Objects.equals(this.lieuNaissance, other.lieuNaissance)) {
            return false;
        }
        if (!Objects.equals(this.etatMatrimonial, other.etatMatrimonial)) {
            return false;
        }
        if (this.nbEnfants != other.nbEnfants) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        if (!Objects.equals(this.telephonne, other.telephonne)) {
            return false;
        }
        if (!Arrays.deepEquals(this.photo, other.photo)) {
            return false;
        }
        if (!Objects.equals(this.diplomes, other.diplomes)) {
            return false;
        }
        if (!Objects.equals(this.situations, other.situations)) {
            return false;
        }
        if (!Objects.equals(this.affectations, other.affectations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personne{" + ", cin=" + cin +  ", nom=" + nom + ", prenom=" + prenom  + '}';
    }
    
    
}
