/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqute;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ASUS
 */
@Stateless
public class VeterinarioFacade extends AbstractFacade<Veterinario> {

    @PersistenceContext(unitName = "jungla3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VeterinarioFacade() {
        super(Veterinario.class);
    }
    
}