///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package mail;
//
//import java.net.SocketException;
//import java.net.UnknownHostException;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
///**
// *
// * @author Carlos Adonay
// */
//public class Mail {
//
//    private static Properties mailServerProperties;
//    private static Session getMailSession;
//    private static MimeMessage generateMailMessage;
//
//    public Mail() {
//        System.out.println("\n 1st ===> setup Mail Server Properties..");
//        mailServerProperties = System.getProperties();
//        mailServerProperties.put("mail.smtp.port", "587");
//        mailServerProperties.put("mail.smtp.auth", "true");
//        mailServerProperties.put("mail.smtp.starttls.enable", "true");
//        System.out.println("Mail Server Properties have been setup successfully..");
//    }
//
//    public static void main(String args[]) throws MessagingException, UnknownHostException, SocketException {
//
//        Mail p = new Mail();
//        String [] correos={"abregoc777@gmail.com","acentg4595@gmail.com","jose86600@gmail.com"};
//        p.EnvioMensaje(correos, "Prueva ","Prueva multi correo");
//        
//    }
//
//    private void Mensaje(String destinatario, String Mensaje, String asunto) throws AddressException, MessagingException {
//        System.out.println("\n\n 2nd ===> get Mail Session..");
//        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
//        generateMailMessage = new MimeMessage(getMailSession);
//        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
//        generateMailMessage.setSubject(asunto);
//        generateMailMessage.setContent(Mensaje, "text/html");
//        System.out.println("Mail Session has been created successfully..");
//        System.out.println("\n\n 3rd ===> Get Session and Send mail");
//        Transport transport = getMailSession.getTransport("smtp");
//        transport.connect("smtp.gmail.com", "sistemaMedicoJpa@gmail.com", "Pa$5w0rd");
//        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
//        transport.close();
//    }
//
//    private void Mensaje(String[] destinatario, String Mensaje, String asunto) throws AddressException, MessagingException {
//        System.out.println("\n\n 2nd ===> get Mail Session..");
//        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
//        generateMailMessage = new MimeMessage(getMailSession);
//        for (String string : destinatario) {
//            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(string));
//        }
//        generateMailMessage.setSubject(asunto);
//        generateMailMessage.setContent(Mensaje, "text/html");
//        System.out.println("Mail Session has been created successfully..");
//        System.out.println("\n\n 3rd ===> Get Session and Send mail");
//        Transport transport = getMailSession.getTransport("smtp");
//        transport.connect("smtp.gmail.com", "sistemaMedicoJpa@gmail.com", "Pa$5w0rd");
//        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
//        transport.close();
//    }
//
//    public void EnvioMensaje(String Destinatario, String Mensaje) throws MessagingException {
//        Prueva();
//        Mensaje(Destinatario, Mensaje, "");
//        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
//
//    }
//
//    public void EnvioMensaje(String Destinatario, String Mensaje, String Asunto) throws MessagingException {
//        Prueva();
//        Mensaje(Destinatario, Mensaje, Asunto);
//        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
//
//    }
//
//    public void EnvioMensaje(String[] Destinatario, String Mensaje) throws MessagingException {
//        Prueva();
//
//        Mensaje(Destinatario, Mensaje, "");
//
//        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
//
//    }
//
//    public void EnvioMensaje(String[] Destinatario, String Mensaje, String Asunto) throws MessagingException {
//        Prueva();
//        Mensaje(Destinatario, Mensaje, Asunto);
//        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
//
//    }
//
//    private void Prueva() {
//        System.out.println("\n 1st ===> setup Mail Server Properties..");
//        mailServerProperties = System.getProperties();
//        mailServerProperties.put("mail.smtp.port", "587");
//        mailServerProperties.put("mail.smtp.auth", "true");
//        mailServerProperties.put("mail.smtp.starttls.enable", "true");
//        System.out.println("Mail Server Properties have been setup successfully..");
//    }
//
//}
