package password;

import java.awt.Panel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RecoveryPassword {

    public static void resetPassword(String email, String password) {

        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail-smtp.auth", "true");
        propiedad.put("mail.smtp.socketFactory.port", "587");
        propiedad.put("javax.net.ssl.SSLSocketFactory", "javax.net.ssl.SSLsocketFactory");
        propiedad.put("mail.smtp.ssl.socketFactory", "true");
        propiedad.put("mail.smtp.EnableSSL.enable","true");
        propiedad.put("mail.smtp.ssl.trust", "*");
        propiedad.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session sesion = Session.getDefaultInstance(propiedad);        
        
        String correoEnvia = "melidev97@gmail.com";
        String contrasena = "chichina97";
        String receptor = email;
        String asunto = "Recovery password - Campus simulation";
        String mensaje = "This is your password: " + password;

        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
            mail.setSubject(asunto);
            mail.setText(mensaje);

            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correoEnvia, contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transportar.close();

        } catch (AddressException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
