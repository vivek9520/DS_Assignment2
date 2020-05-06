/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MailService;

/**
 *
 * @author mac
 */
public class MailService {
    
   
    
    public void sendMail(int room,int floor){
        // TODO code application logic here
        
          // SMTP server information
            String host = "smtp.gmail.com";
            String port = "587";
            String mailFrom = "viveksliit4@gmail.com";
            String password = "19950915@gn";

            // outgoing message information
            String mailTo = "vivekjeevanarajh@gmail.com";
            String subject = "Alarm Active Alert";
            String message = "Alarm Activited in floor Number :"+floor+", Room Number: "+room;

            PlainTextEmailSender mailer = new PlainTextEmailSender();

            try {
                mailer.sendPlainTextEmail(host, port, mailFrom, password, mailTo,
                        subject, message);
                System.out.println("Email sent.");
            } catch (Exception ex) {
                System.out.println("Failed to sent email.");
                ex.printStackTrace();
            }
        }
    
    
}

