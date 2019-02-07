package no.hvl.dat104.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import no.hvl.dat104.jpa.*;
import no.hvl.dat104.*;

@Stateless
public class vareEAO {

	@PersistenceContext(name = "varePersistenceUnit")
	private EntityManager em; 
	
//	private EntityManager em;

//	@PersistenceContext
//	public void setEntityManager(final EntityManager entityManager){
//	    this.em = entityManager;
//	}

	public void leggTilVare(vare v) {
		em.persist(v);
	}

	public vare finnVare(String navn) {
		return em.find(vare.class, navn);
	}

	public void oppdaterVare(vare v) {
		em.merge(v);
	}

	public void slettVare(String navn) {
		em.remove(em.find(vare.class, navn));
	}

}
