/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.sosfso.grh.ejb;

import com.sos.sosfso.grh.entities.Affectation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author infoFSO5
 */
@Stateless
public class AffectationFacade extends AbstractFacade<Affectation>{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    @PersistenceContext(unitName = "grhPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AffectationFacade(){
        super(Affectation.class);
    }

}
