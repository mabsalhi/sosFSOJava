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
public class Affectation implements Serializable {
    private static final long serialVersionUID = 1L;
        private Long id;
        private Date dateAffectation;
    private String poste;
        private Date dateDetachement;
    private String remarques;
    private Personne personne;
    private Service service;

    public Affectation() {
    }

    public Affectation(Date dateAffectation, String poste, Date dateDetachement, String remarques, Personne personne, Service service) {
        this.dateAffectation = dateAffectation;
        this.poste = poste;
        this.dateDetachement = dateDetachement;
        this.remarques = remarques;
        this.personne = personne;
        this.service = service;
    }

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateDetachement() {
        return dateDetachement;
    }

    public void setDateDetachement(Date dateDetachement) {
        this.dateDetachement = dateDetachement;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.dateAffectation);
        hash = 29 * hash + Objects.hashCode(this.poste);
        hash = 29 * hash + Objects.hashCode(this.dateDetachement);
        hash = 29 * hash + Objects.hashCode(this.remarques);
        hash = 29 * hash + Objects.hashCode(this.personne);
        hash = 29 * hash + Objects.hashCode(this.service);
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
        final Affectation other = (Affectation) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateAffectation, other.dateAffectation)) {
            return false;
        }
        if (!Objects.equals(this.poste, other.poste)) {
            return false;
        }
        if (!Objects.equals(this.dateDetachement, other.dateDetachement)) {
            return false;
        }
        if (!Objects.equals(this.remarques, other.remarques)) {
            return false;
        }
        if (!Objects.equals(this.personne, other.personne)) {
            return false;
        }
        if (!Objects.equals(this.service, other.service)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Affectation{" + "dateAffectation=" + dateAffectation + ", poste=" + poste + '}';
    }

    
    
}
