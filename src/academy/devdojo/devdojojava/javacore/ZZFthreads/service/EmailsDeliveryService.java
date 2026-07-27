package academy.devdojo.devdojojava.javacore.ZZFthreads.service;

import academy.devdojo.devdojojava.javacore.ZZFthreads.dominio.Members;

public class EmailsDeliveryService implements Runnable {

    private final Members members;

    public EmailsDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadhName = Thread.currentThread().getName();
        System.out.println(threadhName + ": starting to deliver emails...");
        while(members.isOpen()|| members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadhName + ": sending email para " + email );
                Thread.sleep(2000);
                System.out.println(threadhName + ": sending email sucessfuly  " + email );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("Todos os emails foram enviados com sucesso!");

    }
}
