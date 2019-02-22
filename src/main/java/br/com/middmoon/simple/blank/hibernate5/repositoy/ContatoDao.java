/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.middmoon.simple.blank.hibernate5.repositoy;

import br.com.middmoon.simple.blank.hibernate5.models.Contato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author junior
 */
@Stateless
public class ContatoDao extends AbstractDao<Contato> {

    @PersistenceContext(unitName = "agendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContatoDao() {
        super(Contato.class);
    }
    
}
