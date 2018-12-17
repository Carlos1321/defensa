/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 * @param <T>
 */
public abstract class AbstracFacade<T> {

    protected Class<T> entityClass;

    public AbstracFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public abstract EntityManager getEntityManager();

    public boolean Crear(T entity) {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().persist(entity);
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return false;
        } finally {
            getEntityManager().clear();
        }
    }

    public boolean Borrar(T entity) {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().remove(ConsultarID(entity));
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return false;
        } finally {
            getEntityManager().clear();
        }
    }

    public boolean Borrar(int entity) {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().remove(ConsultarID(entity));
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return false;
        } finally {
            getEntityManager().clear();
        }
    }

    public boolean Borrar(String entity) {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().remove(ConsultarID(entity));
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return false;
        } finally {
            getEntityManager().clear();
        }
    }

    public boolean Actualizar(T entity) {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().merge(entity);
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return false;
        } finally {
            getEntityManager().clear();
        }
    }

    public List<T> Consultar() {
        getEntityManager().getTransaction().begin();
        try {
            javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
            getEntityManager().getTransaction().commit();
            cq.select(cq.from(entityClass));
            return getEntityManager().createQuery(cq).getResultList();
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return null;
        } finally {
            getEntityManager().clear();
        }
    }

    public T ConsultarID(T enti) {
        getEntityManager().getTransaction().begin();
        try {
            T entity = getEntityManager().find(entityClass, enti);
            getEntityManager().getTransaction().commit();
            return entity;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return null;
        } finally {
            getEntityManager().clear();
        }
    }

    public T ConsultarID(int enti) {
        getEntityManager().getTransaction().begin();
        try {
            T entity = getEntityManager().find(entityClass, enti);
            getEntityManager().getTransaction().commit();
            return entity;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return null;
        } finally {
            getEntityManager().clear();
        }
    }

    public T ConsultarID(String enti) {
        getEntityManager().getTransaction().begin();
        try {
            T entity = getEntityManager().find(entityClass, enti);
            getEntityManager().getTransaction().commit();
            return entity;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            return null;
        } finally {
            getEntityManager().clear();
        }
    }

}
