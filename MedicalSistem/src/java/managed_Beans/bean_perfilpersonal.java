package managed_Beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import jdk.nashorn.internal.objects.NativeRegExp;
import mantenimientos.perfilpersonalmantenimiento;
import org.eclipse.persistence.internal.helper.SimpleDatabaseType;
import persistencia.Pais;
import persistencia.Rol;
import persistencia.Especialidad;
import persistencia.Estado;
import persistencia.PerfilEspecialidad;
import persistencia.PerfilPersonal;

/**
 *
 * @author angel.lopezusam
 */
@ManagedBean
@RequestScoped
public class bean_perfilpersonal {

    // <editor-fold defaultstate="collapsed" desc=""> // </editor-fold>
// <editor-fold defaultstate="collapsed" desc="variables">
    private String usuario;
    public String usuario1;

    private String pass;
    private String primerNombre;
    private String segundoNombre;
    private String tercerNombre;
    private String primerApellido;
    private String segundoApellido;
    private String tercerApellido;
    private int edad;
    private String sexo;
    private int pais;
    private String paisnombre;
    private String dui;
    private String nit;
    private String pasaporte;
    private int estado;
    private int rol;
    private String rolnombre;
    private String direccion;
    private String telefono;
    private String celular;
    private String fechaDeContratacion;
    private String mail;
    private String NombreDoc;
    private int especialidad;
    private Date fecha;
    private int[] ad;
    // </editor-fold>
    
    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }
    private HtmlDataTable tabla;

    public HtmlDataTable getTabla() {
        return tabla;
    }

    public void setTabla(HtmlDataTable tabla) {
        this.tabla = tabla;
    }
    
    public int[] getAd() {
        return ad;
    }

    public void setAd(int[] ad) {
        this.ad = ad;
    }

    private PerfilEspecialidad li;

    public PerfilEspecialidad getLi() {
        return li;
    }

    public void setLi(PerfilEspecialidad li) {
        this.li = li;
    }

    public void mostrar() {
        PerfilPersonal usu = (PerfilPersonal) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("perfil");
        mostrarEspecialidades(usu.getUsuario());
        perfilpersonalmantenimiento man = new perfilpersonalmantenimiento();
        for (int i : ad) {
            Especialidad a = man.especialidadseleccionada(i);

        }

    }

    private List<PerfilEspecialidad> es;

    public List<PerfilEspecialidad> getEs() {
        return es;
    }
////

    public String getNombreDoc() {
        return NombreDoc;
    }

    public void setNombreDoc(String NombreDoc) {
        this.NombreDoc = NombreDoc;
    }

    public void setEs(List<PerfilEspecialidad> es) {
        this.es = es;
    }

// <editor-fold defaultstate="collapsed" desc="getters and setters">
    public String getRolnombre() {
        return rolnombre;
    }

    public void setRolnombre(String rolnombre) {
        this.rolnombre = rolnombre;
    }

    public String getPaisnombre() {
        return paisnombre;
    }

    public void setPaisnombre(String paisnombre) {
        this.paisnombre = paisnombre;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the tercerNombre
     */
    public String getTercerNombre() {
        return tercerNombre;
    }

    /**
     * @param tercerNombre the tercerNombre to set
     */
    public void setTercerNombre(String tercerNombre) {
        this.tercerNombre = tercerNombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the tercerApellido
     */
    public String getTercerApellido() {
        return tercerApellido;
    }

    /**
     * @param tercerApellido the tercerApellido to set
     */
    public void setTercerApellido(String tercerApellido) {
        this.tercerApellido = tercerApellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the pais
     */
    public int getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(int pais) {
        this.pais = pais;
    }

    /**
     * @return the dui
     */
    public String getDui() {
        return dui;
    }

    /**
     * @param dui the dui to set
     */
    public void setDui(String dui) {
        this.dui = dui;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the pasaporte
     */
    public String getPasaporte() {
        return pasaporte;
    }

    /**
     * @param pasaporte the pasaporte to set
     */
    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the rol
     */
    public int getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(int rol) {
        this.rol = rol;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the fechaDeContratacion
     */
    public String getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    /**
     * @param fechaDeContratacion the fechaDeContratacion to set
     */
    public void setFechaDeContratacion(String fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the especialidad1
     */
    public int getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad1 the especialidad1 to set
     */
    public void setEspecialidad(int especialidad1) {
        this.especialidad = especialidad1;
    }

    public bean_perfilpersonal() {
    }

    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Lista para rol">
    //Hacemos un objeto de tipo lista
    private List<Rol> listarol;

    //Encapsulamos su get
    public List<Rol> getListarol() {
        //traemos el ojteto
        this.listarol = new ArrayList<>();
        //creamos el objeto de la clase en donde tenemos el 
        perfilpersonalmantenimiento man = new perfilpersonalmantenimiento();
        //ugualamos nuestro objeto tipo lista a la funcion de consulta de la base que hicimos antes
        listarol = man.ConsultarRol();
        //retornamos nuestro objeto
        return listarol;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Lista para Pais">
    //Hacemos un objeto de tipo lista
    private List<Pais> listaPais;

    //Encapsulamos su get
    public List<Pais> getListaPais() {
        //traemos el ojteto
        this.listaPais = new ArrayList<>();
        //creamos el objeto de la clase en donde tenemos el 
        perfilpersonalmantenimiento man = new perfilpersonalmantenimiento();
        //ugualamos nuestro objeto tipo lista a la funcion de consulta de la base que hicimos antes
        listaPais = man.ConsultaPais();
        //retornamos nuestro objeto
        return listaPais;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Lista para especialidad">
    //Hacemos un objeto de tipo lista
    private List<Estado> listaestado;

    public List<Estado> getListaestado() {
        //traemos el ojteto
        this.listaestado = new ArrayList<>();
        //creamos el objeto de la clase en donde tenemos el 
        perfilpersonalmantenimiento man = new perfilpersonalmantenimiento();
        //ugualamos nuestro objeto tipo lista a la funcion de consulta de la base que hicimos antes
        listaestado = man.Consultaestado();
        //retornamos nuestro objeto
        return listaestado;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Lista para especialidad">
    //Hacemos un objeto de tipo lista
    private List<Especialidad> listaespecialidad;

    //Encapsulamos su get
    public List<Especialidad> getListaespecialidad() {
        //traemos el ojteto
        this.listaespecialidad = new ArrayList<>();
        //creamos el objeto de la clase en donde tenemos el 
        perfilpersonalmantenimiento man = new perfilpersonalmantenimiento();
        //igualamos nuestro objeto tipo lista a la funcion de consulta de la base que hicimos antes
        listaespecialidad = man.Consultaespecialidad();
        //retornamos nuestro objeto
        return listaespecialidad;
    }
    // </editor-fold>    

// <editor-fold defaultstate="collapsed" desc="traer el rol">
    public Rol rl() {
        Rol rl = null;
        perfilpersonalmantenimiento a = new perfilpersonalmantenimiento();
        rl = a.rollseleccionado(this.getRol());
        return rl;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="estado de insertar el estado">
    public Estado etd() {
        Estado etd = null;
        perfilpersonalmantenimiento a = new perfilpersonalmantenimiento();
        etd = a.estadoseleccionado(7);
        return etd;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="traer el estado">
    public Estado etdi() {
        Estado etd = null;
        perfilpersonalmantenimiento a = new perfilpersonalmantenimiento();
        etd = a.estadoseleccionado(estado);
        return etd;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="traer el estado">
    public Pais ps() {
        Pais pa = null;
        perfilpersonalmantenimiento a = new perfilpersonalmantenimiento();
        pa = a.paisseleccionado(getPais());
        return pa;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="traer el especialidad">
    public Especialidad spcld() {
        Especialidad spcld = null;
        perfilpersonalmantenimiento a = new perfilpersonalmantenimiento();
        spcld = a.especialidadseleccionada(this.getEspecialidad());
        return spcld;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="parsear la fecha">
    public Date fecha() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String date = this.getFechaDeContratacion();
        Date fecha = formato.parse(date);
        return fecha;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Generar una contraseña">    
    public String crearcontraseña() {
        String pass = (UUID.randomUUID().toString().substring(0, 5));
        return pass;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Generarusuario"> 
    public String generarusuario() {
        String a = getPrimerNombre();
        String b = getSegundoNombre();
        String c = getPrimerApellido();
        String d = getSegundoApellido();

        String[] datop = {a, b, c, d};

        String uString = null;

        uString = "";

        for (int i = 0; i < datop.length - 1; i++) {

            String string = datop[i];

            if (string.length() > 3) {
                if (uString.length() <= 8) {
                    uString = uString + string.substring(0, 3);
                }
                if (uString.length() > 8) {
                    uString = uString.substring(0, 8);
                }
            } else if (string.length() >= 2) {
                if (uString.length() <= 8) {
                    uString = uString + string.substring(0, 2);
                }
                if (uString.length() > 8) {
                    uString = uString.substring(0, 8);
                }
            }
        }

        System.out.println(uString);
        return uString;
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Insertar_perfil_especialidad">
    public int Insertar_perfil_especialidad() throws ParseException {
        String advertencia = "";
        int flag = 0;
        perfilpersonalmantenimiento ppm = new perfilpersonalmantenimiento();
        PerfilEspecialidad ep = new PerfilEspecialidad();

        PerfilPersonal p = new PerfilPersonal();
        p.setUsuario(getUsuario());
        p.setPass(getPass());
        p.setPrimerNombre(getPrimerNombre());
        p.setSegundoNombre(getSegundoNombre());
        p.setTercerNombre(getTercerNombre());
        p.setPrimerApellido(getPrimerApellido());
        p.setSegundoApellido(getSegundoApellido());
        p.setTercerApellido(getTercerApellido());
        p.setEdad(getEdad());
        p.setSexo(getSexo());
        p.setPais(ps());
        p.setDui(getDui());
        p.setNit(getNit());
        p.setPasaporte(getPasaporte());
        p.setDireccion(getDireccion());
        p.setTelefono(getTelefono());
        p.setCelular(getCelular());
        p.setRol(rl());
        p.setFechaDeContratacion(fecha());
        p.setEmail(getMail());
        p.setEstado(etd());

        ep.setUsuario(p);
        ep.setEspecialidad(this.spcld());
        ep.setIdPerfilEspecialidad(0);

        if (ppm.Insertar_perfil_especialidad(ep) == 1) {
            flag = 1;
            advertencia = "Informacion actualizada Correctamente";
        } else {
            flag = 0;
            advertencia = "Error al ingresar informacion";
        }
        FacesMessage msg = new FacesMessage(advertencia);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return flag;
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Insertarperfil">
    public void Insertarperfil() throws ParseException {
        String advertencia = "";
        perfilpersonalmantenimiento ppm = new perfilpersonalmantenimiento();
        PerfilEspecialidad ep = new PerfilEspecialidad();

        PerfilPersonal p = new PerfilPersonal();
        p.setUsuario(generarusuario());
        p.setPass(crearcontraseña());
        p.setPrimerNombre(getPrimerNombre());
        p.setSegundoNombre(getSegundoNombre());
        p.setTercerNombre(getTercerNombre());
        p.setPrimerApellido(getPrimerApellido());
        p.setSegundoApellido(getSegundoApellido());
        p.setTercerApellido(getTercerApellido());
        p.setEdad(getEdad());
        p.setSexo(getSexo());
        p.setPais(ps());
        p.setDui(getDui());
        p.setNit(getNit());
        p.setPasaporte(getPasaporte());
        p.setDireccion(getDireccion());
        p.setTelefono(getTelefono());
        p.setCelular(getCelular());
        p.setRol(rl());
        p.setFechaDeContratacion(fecha());
        p.setEmail(getMail());
        p.setEstado(etd());

        if (ppm.Insertarpersonal(p) == 1) {
            advertencia = "Informacion actualizada Correctamente";
            System.out.println("si funciona");
        } else {
            advertencia = "Error al ingresar informacion";
            System.out.println("nelson prrro");
        }
        FacesMessage msg = new FacesMessage(advertencia);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="mostrarperfil">
    private List<PerfilPersonal> listapersonal;

    public List<PerfilPersonal> getListapersonal() {
        return listapersonal;
    }

    public void setListapersonal(List<PerfilPersonal> listapersonal) {
        this.listapersonal = listapersonal;
    }

// </editor-fold>
    
    @PostConstruct
    public void init() {
        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        this.listapersonal = p.mostrar();
       
        
    }

// <editor-fold defaultstate="collapsed" desc="mostrarporusuario"> 
    public void mostrarporusuario(String usu) {
        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        String advertencia = "";
        PerfilPersonal c = p.mostrarporusu(usu);
        if (c != null) {
            this.usuario = c.getUsuario();
            this.primerNombre = c.getPrimerNombre();
            this.segundoNombre = c.getSegundoNombre();
            this.tercerNombre = c.getTercerNombre();
            this.primerApellido = c.getPrimerApellido();
            this.segundoApellido = c.getSegundoApellido();
            this.tercerApellido = c.getTercerApellido();
            this.edad = c.getEdad();
            this.sexo = c.getSexo();
            this.pais = c.getPais().getIdPais();
            this.paisnombre = c.getPais().getNombrePais();
            this.dui = c.getDui();
            this.nit = c.getNit();
            this.pasaporte = c.getPasaporte();
            this.direccion = c.getDireccion();
            this.telefono = c.getTelefono();
            this.celular = c.getCelular();
            this.rol = c.getRol().getIdRol();
            this.rolnombre = c.getRol().getRol();
            this.estado = c.getEstado().getIdEstado();
            this.fecha = c.getFechaDeContratacion();
            this.mail = c.getEmail();
            this.pass = c.getPass();
            System.out.println("exito" + fecha);
        } else {
            advertencia = "Datos no encontrados";
            FacesMessage msg = new FacesMessage(advertencia);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="actualizar perfil"> 
    public void actualizar_personal() throws ParseException {
        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        String advertencia = "";
        PerfilPersonal a = new PerfilPersonal();

        a.setUsuario(usuario);
        a.setPrimerNombre(primerNombre);
        a.setSegundoNombre(segundoNombre);
        a.setTercerNombre(tercerNombre);
        a.setPrimerApellido(primerApellido);
        a.setSegundoApellido(segundoApellido);
        a.setTercerApellido(tercerApellido);
        a.setEdad(edad);
        a.setSexo(sexo);
        a.setPais(ps());
        a.setDui(dui);
        a.setNit(nit);
        a.setPasaporte(pasaporte);
        a.setDireccion(direccion);
        a.setTelefono(telefono);
        a.setCelular(celular);
        a.setRol(rl());
        a.setEstado(etdi());
        a.setFechaDeContratacion(fecha);
        a.setEmail(mail);
        a.setPass(pass);

        if (p.actualizar_personal(a) == 1) {
            advertencia = "Informacion actualizada Correctamente";
        } else {
            advertencia = "Error al ingresar informacion";
        }
        FacesMessage msg = new FacesMessage(advertencia);
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="mostrarespecialidad"> 
    public void mostrarEspecialidades(String datos) {
        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        PerfilPersonal usu = p.mostrarporusu(datos); //hacer una variable del la persistencia
        
        usuario = datos;
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("perfil", usu);//iniciamos el bean de seccion
        List<PerfilEspecialidad> a = new LinkedList<>();
        for (PerfilEspecialidad e : p.metodo()) {
            if (e.getUsuario().equals(usu)) {
                a.add(e);
            }
        }
        es = a;
        this.NombreDoc = "   " + usu.getPrimerNombre() + " " + usu.getSegundoNombre() + " " + usu.getPrimerApellido() + " " + usu.getSegundoApellido();
        FacesMessage msg = new FacesMessage("Buscando Datos");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="agregar una especialidad"> 
    public int vincularpersonalespecialidad() {
        int flag = 0;
        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        if (p.vincular_especialidad_doctor(especialidad, usuario) == 1) {
            flag = 1;
            System.out.println("funciona");
        } else {
            System.err.println("nelson");
        }
        return flag;
    }
// </editor-fold>

    public void nohaynecesidadperoporsiacaso(){
        PerfilPersonal pp = (PerfilPersonal) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("perfil");//hacemos una variable de la persistencia y la igualamos a un casting de la seccion 
    this.usuario = pp.getUsuario();
    this.NombreDoc = pp.getRol().getRol()+": "+pp.getPrimerNombre()+" "+pp.getSegundoNombre()+" "+pp.getPrimerApellido()+".";
    }
    
// <editor-fold defaultstate="collapsed" desc="eliminar vinculo especialidad"> 
    public void eliminarvinculo() {
        System.out.println("1");
        System.out.println(li);
        FacesMessage msg = new FacesMessage("dentro");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        //return p.eliminarvinculoespecialidad(id);
    }

    public void eliminar(int id) {
        System.out.println("Eliminar vinculo el id es " + id);
        perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
        Especialidad a = p.especialidadseleccionada(id);
        PerfilPersonal usu = (PerfilPersonal) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("perfil");
        PerfilEspecialidad ab = new PerfilEspecialidad();
        ab.setEspecialidad(a);
        ab.setUsuario(usu);
        List<PerfilEspecialidad> lista = p.metodo();
        for (PerfilEspecialidad perfilEspecialidad : lista) {
            if (ab.getUsuario().equals(perfilEspecialidad.getUsuario()) && ab.getEspecialidad().equals(perfilEspecialidad.getEspecialidad())) {
                System.out.println("1");
                if (p.eliminarvinculoespecialidad(perfilEspecialidad)) {
                    System.out.println("Exito al eliminar");
                } else {
                    System.err.println("Error al eliminar");
                }
                System.out.println("2");
            }
        }

        FacesMessage msg = new FacesMessage("funciono");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

//    public static void main(String[] args) {
//      perfilpersonalmantenimiento p = new perfilpersonalmantenimiento();
//        Especialidad a = p.especialidadseleccionada(2);
//        PerfilPersonal usu = p.mostrarporusu("AngAntLo");
//        PerfilEspecialidad ab = new PerfilEspecialidad();
//        ab.setEspecialidad(a);
//        ab.setUsuario(usu);
//
//        List<PerfilEspecialidad> lista = p.metodo();
//        for (PerfilEspecialidad perfilEspecialidad : lista) {
//            if (ab.getUsuario().equals(perfilEspecialidad.getUsuario()) && ab.getEspecialidad().equals(perfilEspecialidad.getEspecialidad())) {
//                System.out.println("1");
//                if(p.eliminarvinculoespecialidad(perfilEspecialidad)){
//                    System.out.println("Exito");
//                }else{
//                    System.err.println("Error");
//                }
//                System.out.println("2");
//            }
//        }
}

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="agregar una especialidad"> // </editor-fold>
//    public static void main(String[] args) throws ParseException {
//     bean_perfilpersonal c  = new bean_perfilpersonal();
//     
//        c.usuario = "AngAntLo";
//        c.pass = "prueva";
//        c.primerNombre = "prueva";
//        c.segundoNombre = "prueva";
//        c.tercerNombre = null;
//        c.primerApellido = "prueva";
//        c.segundoApellido = "prueva";
//        c.tercerApellido = null;
//        c.edad = "1";
//        c.sexo = "prueva";
//        c.pais = 50;
//        c.dui = "prueva";
//        c.nit = "prueva";
//        c.pasaporte = "prueva";
//        c.direccion = "prueva";
//        c.telefono = "prueva";
//        c.celular = "prueva";
//        c.rol = 18;
//        c.fechaDeContratacion = "10/10/1999";
//        c.mail = "prueva";
//        c.estado = 8;
//     
//     c.actualizar_personal();
//    }

/*
public static void main(String[] args) {
        bean_perfilpersonal p = new bean_perfilpersonal();
        p.usuario="AngAntLo";
        p.mostrarporusuario("AngAntLo");
    }
 */
//    public static void main(String[] args) throws ParseException {
//        bean_perfilpersonal c = new bean_perfilpersonal();
//        c.usuario="prueva";
//        c.pass="prueva";
//        c.primerNombre="prueva";
//        c.segundoNombre="prueva";
//        c.tercerNombre=null;
//        c.primerApellido="prueva";
//        c.segundoApellido="prueva";
//        c.tercerApellido=null;
//        c.edad="1";
//        c.sexo="prueva";
//        c.pais="prueva";
//        c.dui="prueva";
//        c.nit="prueva";
//        c.pasaporte="prueva";
//        c.direccion="prueva";
//        c.telefono="prueva";
//        c.celular="prueva";
//        c.rol=1;
//        c.fechaDeContratacion="10/10/1999";
//        c.mail="prueva";
//        c.estado=1;
//        
////        c.especialidad=1;
//        c.Insertarperfil();
//    }
/**
 * @return the fecha
 */
//    public static void main(String[] args) {
//        bean_perfilpersonal p = new bean_perfilpersonal();
//        p.setPrimerNombre("Angel");
//        p.setSegundoNombre("Antonio");
//        p.setPrimerApellido("Lopez");
//        p.setSegundoApellido("sorto");
//        p.generarusuario();
//    }
//// prueba
//    public static void main(String[] args) {
//        bean_perfilpersonal p = new bean_perfilpersonal();
//        p.setUsuario("AngAntLo");
//        p.mostrarporusuario(p.usuario);
//    }
