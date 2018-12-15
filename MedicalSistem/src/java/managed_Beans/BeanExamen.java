package managed_Beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import mantenimientos.mantenimientoExamen;
import persistencia.Examen;
import persistencia.TipoExamen;

/**
 *
 * @author alejandra.centeno
 */
@ManagedBean
@RequestScoped
public class BeanExamen {

    //VARIABLES EXAMEN
    
    private int id_examen;
    private int examen;
    private Date fecha_examen;
    private String resultado_examen;
    
    public int getId_examen() {
        return id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public Date getFecha_examen() {
        return fecha_examen;
    }

    public void setFecha_examen(Date fecha_examen) {
        this.fecha_examen = fecha_examen;
    }

    public String getResultado_examen() {
        return resultado_examen;
    }

    public void setResultado_examen(String resultado_examen) {
        this.resultado_examen = resultado_examen;
    }
    
    
    //VARIABLES TIPO EXAMEN
    private int id_tipo_examen;
    private String nombre_examen;
    private String tipo_examen;

    public int getId_tipo_examen() {
        return id_tipo_examen;
    }

    public void setId_tipo_examen(int id_tipo_examen) {
        this.id_tipo_examen = id_tipo_examen;
    }

    public String getNombre_examen() {
        return nombre_examen;
    }

    public void setNombre_examen(String nombre_examen) {
        this.nombre_examen = nombre_examen;
    }

    public String getTipo_examen() {
        return tipo_examen;
    }

    public void setTipo_examen(String tipo_examen) {
        this.tipo_examen = tipo_examen;
    }

    public List<TipoExamen> getListaTipoExamen() {
        return listaTipoExamen;
    }

    public void setListaTipoExamen(List<TipoExamen> listaTipoExamen) {
        this.listaTipoExamen = listaTipoExamen;
    }
    

    /**
     * Creates a new instance of BeanExamen
     */
    public BeanExamen()  {
    }
    
    private String[] selectedTipoExamen1;
    private String[] selectedTipoExamen2;
    private String[] selectedTipoExamen3;
    private String[] selectedTipoExamen4;
    private String[] selectedTipoExamen5;
    private String[] selectedTipoExamen6;
    private String[] selectedTipoExamen7;
    private String[] selectedTipoExamen8;
    private String[] selectedTipoExamen9;
         
    private List<TipoExamen> listaTipoExamen1;
    private List<TipoExamen> listaTipoExamen2;
    private List<TipoExamen> listaTipoExamen3;
    private List<TipoExamen> listaTipoExamen4;
    private List<TipoExamen> listaTipoExamen5;
    private List<TipoExamen> listaTipoExamen6;
    private List<TipoExamen> listaTipoExamen7;
    private List<TipoExamen> listaTipoExamen8;
    private List<TipoExamen> listaTipoExamen9;
    private List<TipoExamen> listaTipoExamen;
    
    public String[] getSelectedTipoExamen1() {
        return selectedTipoExamen1;
    }

    public void setSelectedTipoExamen1(String[] selectedTipoExamen) {
        this.selectedTipoExamen1 = selectedTipoExamen;
    }
    
     public String[] getSelectedTipoExamen2() {
        return selectedTipoExamen2;
    }

    public void setSelectedTipoExamen2(String[] selectedTipoExamen2) {
        this.selectedTipoExamen2 = selectedTipoExamen2;
    }

    public String[] getSelectedTipoExamen3() {
        return selectedTipoExamen3;
    }

    public void setSelectedTipoExamen3(String[] selectedTipoExamen3) {
        this.selectedTipoExamen3 = selectedTipoExamen3;
    }

    public String[] getSelectedTipoExamen4() {
        return selectedTipoExamen4;
    }

    public void setSelectedTipoExamen4(String[] selectedTipoExamen4) {
        this.selectedTipoExamen4 = selectedTipoExamen4;
    }

    public String[] getSelectedTipoExamen5() {
        return selectedTipoExamen5;
    }

    public void setSelectedTipoExamen5(String[] selectedTipoExamen5) {
        this.selectedTipoExamen5 = selectedTipoExamen5;
    }

    public String[] getSelectedTipoExamen6() {
        return selectedTipoExamen6;
    }

    public void setSelectedTipoExamen6(String[] selectedTipoExamen6) {
        this.selectedTipoExamen6 = selectedTipoExamen6;
    }

    public String[] getSelectedTipoExamen7() {
        return selectedTipoExamen7;
    }

    public void setSelectedTipoExamen7(String[] selectedTipoExamen7) {
        this.selectedTipoExamen7 = selectedTipoExamen7;
    }

    public String[] getSelectedTipoExamen8() {
        return selectedTipoExamen8;
    }

    public void setSelectedTipoExamen8(String[] selectedTipoExamen8) {
        this.selectedTipoExamen8 = selectedTipoExamen8;
    }

    public String[] getSelectedTipoExamen9() {
        return selectedTipoExamen9;
    }

    public void setSelectedTipoExamen9(String[] selectedTipoExamen9) {
        this.selectedTipoExamen9 = selectedTipoExamen9;
    }

//METODOS LLAMANDO A MANTENIMIENTO PARA MOSTRAR LISTADO DE EXAMENES AL MEDICO
   
    public List<TipoExamen> getListaTipoExamen1(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen1();
    }
    
    public List<TipoExamen> getListaTipoExamen2(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen2();
    }
     
    public List<TipoExamen> getListaTipoExamen3(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen3();
    }
    
    public List<TipoExamen> getListaTipoExamen4(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen4();
    }
    
    public List<TipoExamen> getListaTipoExamen5(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen5();
    }
    
    public List<TipoExamen> getListaTipoExamen6(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen6();
    }
    
    public List<TipoExamen> getListaTipoExamen7(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen7();
    }
    
    public List<TipoExamen> getListaTipoExamen8(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen8();
    }
    
    public List<TipoExamen> getListaTipoExamen9(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TipoExamen9();
    }
    
    //METODO LLAMANDO A MANTENIMIENTO PARA MOSTRAR TABLA DE TIPO EXAMENTES
    
    public List<TipoExamen> getListaTodoTipoExamen(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Mostrar_TodoTipoExamen();
    }
    
    public List<TipoExamen> getSelectTipoExamen(){
        mantenimientoExamen mh = new mantenimientoExamen();
        return mh.Select_TipoExamen();
    }
    
    //METODO LLAMANDO MANTENIMIENTO QUE INSERTA NUEVO EXAMEN EN BASE DE DATOS TABLA TIPO EXAMEN
    
    public void insertarTipoExamen() throws IOException {
        mantenimientoExamen mte =new mantenimientoExamen();
        TipoExamen tipoExamen = new TipoExamen();
        
        tipoExamen.setIdTipoExamen(getId_tipo_examen());
        tipoExamen.setNombreExamen(getNombre_examen());
        tipoExamen.setTipoExamen(getTipo_examen());
        
        if(mte.Insertar_TipoExamen(tipoExamen)==1){
            this.setNombre_examen("");
            this.setTipo_examen("");
            
        FacesContext.getCurrentInstance().getExternalContext().redirect("tabla_examenesAdmin.xhtml");
        String advertencia = "Informacion guardada correctamente";
        FacesMessage mensaje = new FacesMessage(advertencia);
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }
    }
    
    public TipoExamen estetipo(){
        TipoExamen este=null;
        int id = getExamen();
        mantenimientoExamen mte =new mantenimientoExamen();
        este = mte.estetipo(id);
        return este;
    }
    
    
     public void insertarExamen() throws IOException {
        mantenimientoExamen mte =new mantenimientoExamen();
        Examen examen = new Examen();
        
        examen.setIdExamen(getId_examen());
        examen.setExamen(estetipo());
        
        if(mte.Insertar_ExamenPaciente(examen)==1){
            this.setNombre_examen("");
            this.setTipo_examen("");
            
        }
       /* FacesContext.getCurrentInstance().getExternalContext().redirect("tabla_examenesAdmin.xhtml");
        String advertencia = "Informacion guardada correctamente";
        FacesMessage mensaje = new FacesMessage(advertencia);
        FacesContext.getCurrentInstance().addMessage(null, mensaje);*/
    }
        
    
    
    
//    public static void main(String[] args) {
//        BeanExamen c = new BeanExamen();
//        TipoExamen a = new TipoExamen();
//        c.nombre_examen="hola";
//        c.tipo_examen="hola";
//        try {
//            c.insertarTipoExamen();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}
