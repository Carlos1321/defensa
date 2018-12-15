/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import persistencia.Rol;
import persistencia.Pais;
import persistencia.PerfilPersonal;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import persistencia.Especialidad;
import static persistencia.Especialidad_.especialidad;
import persistencia.Estado;
import persistencia.PerfilEspecialidad;
import persistencia.PruebaVista;

/**
 *
 * @author angel.lopezusam
 */
public class perfilpersonalmantenimiento {

// <editor-fold defaultstate="collapsed" desc="Lista para rol">
    //hacemos una funcion tipo list para traer nuestos datos de la base
    public List ConsultarRol() {
        //hacemos un objeto tipo lista para que se pueda usar en nuestro select
        List<Rol> listarol = null;
        //iniciamos nuestra persistencia
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        //en nuestro try catch vamos a hacer nuestro 'pedido' del lsitado de la tabla
        try {
            //hacemos nuestra query y le ponemos el jpsql de la persistencia
            Query sentencia = em.createQuery("SELECT r FROM Rol r");
            //ejecutamos la transaccion
            em.getTransaction().commit();
            //igualamos nuestro objeto lista a nuestra query para que nuestra lista tenga la info de la tabla
            listarol = sentencia.getResultList();
        } catch (Exception e) {
            //si falla hacemos el rollback
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            //por ultimo cerramos el proceso
            em.close();
        }
        //regresamos en objeto lista que ya tiene la info de la tabla
        return listarol;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Lista para especialidad">
    public List Consultaespecialidad() {
        List<Especialidad> listaespecialidad = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT e FROM Especialidad e");
            em.getTransaction().commit();
            listaespecialidad = query.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            em.close();
        }
        return listaespecialidad;
    }
// </editor-fold>      

// <editor-fold defaultstate="collapsed" desc="Lista para Estado">
    public List Consultaestado() {
        List<Estado> listadoEstado = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT e FROM Estado e");
            em.getTransaction().commit();
            listadoEstado = query.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            em.close();
        }
        return listadoEstado;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Lista para Pais">
    public List ConsultaPais() {
        List<Pais> listadopais = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT p FROM Pais p");
            em.getTransaction().commit();
            listadopais = query.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            em.close();
        }
        return listadopais;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Insertar personal">    
    public int Insertarpersonal(PerfilPersonal personal) {
        int flag = 0;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(personal);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            System.out.println("AÑLSDKFJASLÑDKFJALÑSDJFÑLAKSJDFÑLKJASDÑLKFJALÑKSDJF" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return flag;
    }
    // </editor-fold>  

// <editor-fold defaultstate="collapsed" desc="Insertar especialidad">
    public int Insertar_perfil_especialidad(PerfilEspecialidad PE) {
        int flag = 0;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(PE);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            em.close();
        }
        return flag;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="rollseleccionado">
    public Rol rollseleccionado(int id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Rol este = new Rol();
        try {
            este = em.find(Rol.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return este;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="estadoseleccionado">
    public Estado estadoseleccionado(int id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Estado este = new Estado();
        try {
            este = em.find(Estado.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return este;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="paisseleccionado">
    public Pais paisseleccionado(int id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Pais este = new Pais();
        try {
            este = em.find(Pais.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return este;
    }
// </editor-fold>    

// <editor-fold defaultstate="collapsed" desc="especialidadseleccionada">
    public Especialidad especialidadseleccionada(int id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Especialidad este = new Especialidad();
        try {
            este = em.find(Especialidad.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return este;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="mostrar">
    public List<PerfilPersonal> mostrar() {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        List<PerfilPersonal> listapersonal = null;
        em.getTransaction().begin();
        try {
            javax.persistence.criteria.CriteriaQuery query = em.getCriteriaBuilder().createQuery();
            em.getTransaction().commit();
            query.select(query.from(PerfilPersonal.class));
            listapersonal = em.createQuery(query).getResultList();
            return listapersonal;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
        //return listapersonal;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="mostrarporusuario">
    public PerfilPersonal mostrarporusu(String usuario) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        PerfilPersonal listapersonal = null;
        em.getTransaction().begin();
        try {
            listapersonal = em.find(PerfilPersonal.class, usuario);
            //javax.persistence.criteria.CriteriaQuery query = em.getCriteriaBuilder().createQuery();
            em.getTransaction().commit();
//            query.select(query.from(PerfilPersonal.class));
//            listapersonal =em.createQuery(query).getResultList();
            return listapersonal;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
        //return listapersonal;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="actualizar personal"> 
    public int actualizar_personal(PerfilPersonal aactualizar) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        em.getTransaction().begin();
        try {
            em.merge(aactualizar);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        return flag;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="agregar una especialidad"> 
    public int vincular_especialidad_doctor(int especialidad, String usuario) {
        int flag = 0;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        Especialidad w = p.especialidadseleccionada(especialidad);
        PerfilPersonal q = p.mostrarporusu(usuario);
        PerfilEspecialidad a = new PerfilEspecialidad();
        a.setUsuario(q);
        a.setEspecialidad(w);
        try {
            em.persist(a);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("algo salio mal" + e);
        } finally {
            em.close();
        }
        return flag;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="metodo">
    public List<PerfilEspecialidad> metodo(String usuario) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        List<PerfilEspecialidad> lista = null;
        Query query = em.createNamedQuery("especialidades");
        query.setParameter("usuario", usuario);
        lista = query.getResultList();
        return lista;
    }

    public List<PerfilEspecialidad> metodo() {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        List<PerfilEspecialidad> lista = null;
        Query query = em.createNamedQuery("PerfilEspecialidad.findAll");
        lista = query.getResultList();
        return lista;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="ConsultaPruebaVista">
    public List ConsultaPruebaVista() {
        List<PruebaVista> listaConsultaPruebaVista = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT p FROM PruebaVista p");
            em.getTransaction().commit();
            listaConsultaPruebaVista = query.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            em.close();
        }
        return listaConsultaPruebaVista;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Insertar_pais_prueba">
    public int Insertar_pais_prueba(String pais) {
        int flag = 0;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("procedimientoalmacenado");
            storedProcedure.registerStoredProcedureParameter("p", String.class, ParameterMode.IN);
            storedProcedure.setParameter("p", pais);
            storedProcedure.execute();
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error" + e);
        } finally {
            em.close();
        }
        return flag;
    }
    // </editor-fold>  

// <editor-fold defaultstate="collapsed" desc="Insertar_pais_prueba">
    public boolean eliminarvinculoespecialidad(PerfilEspecialidad id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            if (!em.contains(id)) {
                id = em.merge(id);
            }
            em.remove(id);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("error en " + e);
            return false;
        } finally {
            em.close();
        }
    }

// </editor-fold>  
}


// <editor-fold defaultstate="collapsed" desc="testeos"> 

//    public static void main(String[] args) {
//       perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
//       String usuario = "AngAntLo";
//        System.out.println(p.mostrarporusu(usuario).getRol().getIdRol());
//    }
//    public static void main(String[] args) {
//        perfilpersonalmantenimiento v = new perfilpersonalmantenimiento();
//        System.out.println(v.ConsultarPais());  
//    }
//    public static void main(String[] args) throws ParseException {
//        
//        perfilpersonalmantenimiento ma = new perfilpersonalmantenimiento();
//        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
//        String estafecha = "1/1/2018";
//        Date fecha = formato.parse(estafecha);
//        
//        PerfilPersonal p = new PerfilPersonal();
//        
//        Rol esterol = new Rol();
//        esterol = ma.rollseleccionado(14);
//        
//        Estado esteestado = new Estado();
//        esteestado = ma.estadoseleccionado(7);
//        
//        p.setUsuario            ("PRUEBA");
//        p.setPass               ("PRUEBA");
//        p.setPrimerNombre       ("PRUEBA");
//        p.setSegundoNombre      ("PRUEBA");
//        p.setTercerNombre       ("PRUEBA");
//        p.setPrimerApellido     ("PRUEBA");
//        p.setSegundoApellido    ("PRUEBA");
//        p.setTercerApellido     ("PRUEBA");
//        p.setEdad               (1);
//        p.setSexo               ("PRUEBA");
//        p.setPais               ("PRUEBA");
//        p.setDui                ("PRUEBA");
//        p.setNit                ("PRUEBA");
//        p.setPasaporte          ("PRUEBA");
//        p.setDireccion          ("PRUEBA");
//        p.setTelefono           ("PRUEBA");
//        p.setCelular            ("PRUEBA");
//        p.setRol                (esterol);
//        p.setFechaDeContratacion(fecha);
//        p.setEmail              ("PRUEBA");
//        p.setEstado             (esteestado);
//        
//        if (ma.Insertarpersonal(p) == 1) {
//            System.out.println("si funciona");
//        }else{
//            System.out.println("no funciona");
//        }
//        
//        
//    }
//    
//    public static void main(String[] args) {
//        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
//        List<PerfilPersonal> lista = p.mostrar();
//        
//        for (PerfilPersonal perfilPersonal : lista) {
//            System.out.println(perfilPersonal.getUsuario());
//            System.out.println(perfilPersonal.getPass());
//            System.out.println(perfilPersonal.getPrimerNombre());
//            System.out.println(perfilPersonal.getSegundoNombre());
//            System.out.println(perfilPersonal.getTercerNombre());
//            System.out.println(perfilPersonal.getPrimerApellido());
//            System.out.println(perfilPersonal.getSegundoApellido());
//            System.out.println(perfilPersonal.getTercerApellido());
//            System.out.println(perfilPersonal.getEdad());
//            System.out.println(perfilPersonal.getSexo());
//            System.out.println(perfilPersonal.getPais());
//            System.out.println(perfilPersonal.getDui());
//            System.out.println(perfilPersonal.getNit());
//            System.out.println(perfilPersonal.getPasaporte());
//            System.out.println(perfilPersonal.getDireccion());
//            System.out.println(perfilPersonal.getTelefono());
//            System.out.println(perfilPersonal.getCelular());
//            System.out.println(perfilPersonal.getFechaDeContratacion());
//            System.out.println(perfilPersonal.getEmail());
//            System.out.println(perfilPersonal.getRol().getRol());
//            System.out.println(perfilPersonal.getEstado().getEstado());
//        }
//    }
//    public static void main(String[] args) {
////        System.out.println(UUID.randomUUID().toString().substring(0,5).toUpperCase());
//        Scanner lector = new Scanner(System.in);
//
//        System.out.println("Cual es tu nombre");
//        String a = lector.nextLine();
//        System.out.println("Cual es tu nombre-1");
//        String b = lector.nextLine();
//        System.out.println("Cual es tu apellido");
//        String c = lector.nextLine();
//        System.out.println("Cual es tu apellido-1");
//        String d = lector.nextLine();
//
//        String[] datop = {a, b, c, d};
////        datop[0]=a;
////        datop[1]=b;
////        datop[2]=c;
//        //datop[3]=d;
//
//        String uString = null;
//
//        uString = "";
//
//        for (int i = 0; i < datop.length - 1; i++) {
//            String string = datop[i];
//
//            if (string.length() > 3) {
//                if (uString.length() <= 8) {
//                    uString = uString + string.substring(0, 3);
//                }
//                if (uString.length() > 8) {
//                    uString = uString.substring(0, 8);
//                }
//            } else if (string.length() >= 2) {
//                if (uString.length() <= 8) {
//                    uString = uString + string.substring(0, 2);
//                }
//                if (uString.length() > 8) {
//                    uString = uString.substring(0, 8);
//                }
//            }
//        }
//        System.out.println(uString);
//        System.out.println(datop[1]);
//    }
//      public static void main(String[] args) {
//          perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
//          System.out.println(
//          p.Insertar_pais_prueba("prueba2")
//          );
//    }
//    
//    public static void main(String[] args) {
//        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
//        
//        System.out.println(p.ConsultaPruebaVista());
//    }
//    public static void main(String[] args) {
//        perfilpersonalmantenimiento a = new perfilpersonalmantenimiento();
//        String q = "AngAntLo";
//        System.out.println(a.metodo(q));
//    }
//    public static void main(String[] args) {
//        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
//        if(p.vincular_especialidad_doctor(59, "PRUEBA")==1){
//            System.out.println("eso prrro, si funciona");
//        }else{
//            System.out.println("creo que mejor medicina we :v");
//        }
//    }
// </editor-fold>
