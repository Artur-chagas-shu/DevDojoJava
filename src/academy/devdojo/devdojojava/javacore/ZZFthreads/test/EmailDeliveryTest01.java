package academy.devdojo.devdojojava.javacore.ZZFthreads.test;

import academy.devdojo.devdojojava.javacore.ZZFthreads.dominio.Members;
import academy.devdojo.devdojojava.javacore.ZZFthreads.service.EmailsDeliveryService;

import javax.swing.*;
import java.lang.reflect.Member;

public class EmailDeliveryTest01 {
    static void main(String[] args) {
        Members members = new Members();

        Thread jiraya = new Thread(new EmailsDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailsDeliveryService(members), "Kakashi");

        jiraya.start();
        kakashi.start();

        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
