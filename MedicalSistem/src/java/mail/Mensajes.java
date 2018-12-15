/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.UUID;

/**
 *
 * @author roberto.abregoUSAM
 */
public class Mensajes {

    private static String br = "<br>\n";
    private static String h1 = "<h1>";
    private static String h1_ = "</h1>";
    private static String h2 = "<h2>";
    private static String h2_ = "</h2>";
    private static String h3 = "<h3>";
    private static String h3_ = "</h3>";
    private static String h4 = "<h4>";
    private static String h4_ = "</h4>";
    private static String h5 = "<h5>";
    private static String h5_ = "</h5>";
    private static String h6 = "<h6>";
    private static String h6_ = "</h6>";
    private static String User = "Usuario :";
    private static String Pass = "Contraseña :";

    private String Titulo="";
    private String Enlace="";
    private String Mensaje="";
    private String Despedida="";

    public void href(String Mensaje, String Enlace) {
        this.Enlace = "<a href=\"" + Enlace + "\">" + Mensaje + "</a>";
    }

    public void h1Titulo(String Titulo) {
        this.Titulo = h1 + Titulo + h1_;
    }

    public void h2Titulo(String Titulo) {
        this.Titulo = h2 + Titulo + h2_;
    }

    public void h3Titulo(String Titulo) {
        this.Titulo = h3 + Titulo + h3_;
    }

    public void h4Titulo(String Titulo) {
        this.Titulo = h4 + Titulo + h4_;
    }

    public void h5Titulo(String Titulo) {
        this.Titulo = h5 + Titulo + h5_;
    }

    public void h6Titulo(String Titulo) {
        this.Titulo = h6 + Titulo + h6_;
    }

    public void h1Mensaje(String Mensaje) {
        this.Mensaje = h1 + Mensaje + h1_;
    }

    public void h2Mensaje(String Mensaje) {
        this.Mensaje = h2 + Mensaje + h2_;
    }

    public void h3Mensaje(String Mensaje) {
        this.Mensaje = h3 + Mensaje + h3_;
    }

    public void h4Mensaje(String Mensaje) {
        this.Mensaje = h4 + Mensaje + h4_;
    }

    public void h5Mensaje(String Mensaje) {
        this.Mensaje = h5 + Mensaje + h5_;
    }

    public void h6Mensaje(String Mensaje) {
        this.Mensaje = h6 + Mensaje + h6_;
    }

    public void brMensaje() {
        this.Mensaje += br;
    }

    public void User(String User) {
        this.User += " " + User;
    }

    public void Pass(String Pass) {
        this.Pass += " " + Pass;
    }
    
    public void Despedida(String Despedida){
        this.Despedida+=" "+Despedida;
    }
    public void Despedida(){
        this.Despedida+=" Muchas Gracias por preferirnos Esperemos ";
    }
    
    public String Mensaje(){
        this.Mensaje=Titulo+br+br+Mensaje+br+br+Despedida;
        return Mensaje;
    }
    
    public void Mensaje(String Mensaje ){
        this.Mensaje+=br+Mensaje;
    }
    
    public String getUser(){
        return br+User;
    }
    public String getPass(){
        return Pass ;
    }
    
    
}
