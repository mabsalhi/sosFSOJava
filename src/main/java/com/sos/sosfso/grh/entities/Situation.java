/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.sosfso.grh.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author abdel
 */
@Entity
public class Situation implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private int echelon;
    private int numeroIndicatif;
    private Date dateEffet;
    private float salaire;
    private String remarques;
    private Personne personne;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public int getNumeroIndicatif() {
        return numeroIndicatif;
    }

    public void setNumeroIndicatif(int numeroIndicatif) {
        this.numeroIndicatif = numeroIndicatif;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    @ManyToOne
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + this.echelon;
        hash = 47 * hash + this.numeroIndicatif;
        hash = 47 * hash + Objects.hashCode(this.dateEffet);
        hash = 47 * hash + Float.floatToIntBits(this.salaire);
        hash = 47 * hash + Objects.hashCode(this.remarques);
        hash = 47 * hash + Objects.hashCode(this.personne);
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
        final Situation other = (Situation) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.echelon != other.echelon) {
            return false;
        }
        if (this.numeroIndicatif != other.numeroIndicatif) {
            return false;
        }
        if (!Objects.equals(this.dateEffet, other.dateEffet)) {
            return false;
        }
        if (Float.floatToIntBits(this.salaire) != Float.floatToIntBits(other.salaire)) {
            return false;
        }
        if (!Objects.equals(this.remarques, other.remarques)) {
            return false;
        }
        if (!Objects.equals(this.personne, other.personne)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Situation{" + "echelon=" + echelon + '}';
    }
}
