/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.PerfilPersonal;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionPerfilPersonal")
@ApplicationScoped
public class FuncionesPerfilPersonalLocal extends AbstracFacade<PerfilPersonal> implements FuncionPerfilPersonal {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesPerfilPersonalLocal() {
        super(PerfilPersonal.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public PerfilPersonal Login(String user, String pass) {
        getEntityManager().getTransaction().begin();
        PerfilPersonal personal=null;
        try{
            Query q= getEntityManager().createNamedQuery("PerfilPersonal.login",PerfilPersonal.class);
            getEntityManager().getTransaction().commit();
            q.setParameter("usuario", user);
            q.setParameter("pass", pass);
            List<PerfilPersonal> l = q.getResultList();
            for (PerfilPersonal perfilPersonal : l) {
            personal=perfilPersonal;    
            }
            return personal;
        }catch(Exception e){
            return null;
        }
        
    }
 
    
}
