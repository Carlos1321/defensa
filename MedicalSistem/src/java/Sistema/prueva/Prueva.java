/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.prueva;

import Sistema.mantenimiento.FuncionPerfilPersonal;
import Sistema.mantenimiento.FuncionesDatosPersonalesLocal;
import Sistema.mantenimiento.FuncionesExpedienteLocal;
import Sistema.mantenimiento.FuncionesPerfilPersonalLocal;
import Sistema.persistencia.DatosPersonales;
import Sistema.persistencia.Expediente;
import Sistema.persistencia.PerfilPersonal;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/**
 *
 * @author roberto.abregoUSAM
 */
public class Prueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        TODO code application logic here
//        FuncionesDatosPersonalesLocal fdpl = new FuncionesDatosPersonalesLocal();
//        FuncionesExpedienteLocal fel = new FuncionesExpedienteLocal();
//        List<Expediente> e = fel.Consultar();
//        DatosPersonales dp = null;//fdpl.ConsultarID(1);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//       
//  String[] s = sdf.format(dp.getFechaDeNacimiento()).split("-");System.out.println("2");
//        String s1 = "";
//        String s2;
//        s2 = "";
//        int i = 000000001;
//        
//        for (Expediente expediente : e) {
//            i++;
//        }
//        System.out.println(i);
////        for (String sout : s) {
////            s1 = s1 + sout;
////        }
////        s2 = i + "-" + s1.substring(2, 4) + "-" + dp.getPrimerNombre().substring(0, 1).toUpperCase() + dp.getPrimerApellido().substring(0, 1).toUpperCase();
////        System.out.println(s2);

        FuncionPerfilPersonal fpp= new FuncionesPerfilPersonalLocal();
        Date a=new Date();
        GregorianCalendar aaa =new GregorianCalendar(TimeZone.getDefault());
       LocalDate aa= LocalDate.from(Instant.ofEpochMilli( a.getTime()).atZone(ZoneId.systemDefault()));
        PerfilPersonal pp = fpp.ConsultarID("PRUEBA");
        Month m =  Month.of(Integer.parseInt(pp.getFechaDeContratacion().toString().substring(5, 7)));
        System.out.println(pp.getFechaDeContratacion());
        System.out.println(pp.getFechaDeContratacion().toString().substring(pp.getFechaDeContratacion().toString().length()-2, pp.getFechaDeContratacion().toString().length())+"-"+m+"-"+pp.getFechaDeContratacion().toString().substring(0, 4));
        System.out.println(aa);
       aaa.setGregorianChange(a);
        System.out.println(aaa);
    }

}
