/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipproj;

/**
 *
 * @author class12
 */
import static ipproj.map.carprice;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EmailText {
    



	Properties emailProperties;
	Session mailSession;
	MimeMessage emailMessage;
        static String carPrice,start,end,bill,email;
       
       
	public static void main(String args[]) throws AddressException,
			MessagingException {
              carPrice=args[0];
               start=args[1];
               end=args[2];
               bill=args[3];
               email=args[4];
               System.out.println("email"+email);
		EmailText javaEmail = new EmailText();

		javaEmail.setMailServerProperties();
		javaEmail.createEmailMessage();
		javaEmail.sendEmail();
	}

	public void setMailServerProperties() {

		String emailPort = "587";//gmail's smtp port

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");

	}

	public void createEmailMessage() throws AddressException,
			MessagingException {
		String[] toEmails = {email};
		String emailSubject = "This is an auto-generated bill";
		String emailBody = "Your cab ride from "+ start +" to "+ end +" has been confirmed."+"\n"+"Your total bill is: "+bill+" rupees"
                        +"\n"+"\n"+"Thank you for choosing our service."+"\n"+"-Team Bumpacars";

		mailSession = Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);

		for (int i = 0; i < toEmails.length; i++) {
			emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
		}

		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");//for a html email
		//emailMessage.setText(emailBody);// for a text email

	}

	public void sendEmail() throws AddressException, MessagingException {

		String emailHost = "smtp.gmail.com";
		String fromUser = "bumpacarscabs";//just the id alone without @gmail.com
		String fromUserEmailPassword = "bumpacars123";
                

		Transport transport = mailSession.getTransport("smtp");

		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();
		System.out.println("Email sent successfully.");
	}

}

  

