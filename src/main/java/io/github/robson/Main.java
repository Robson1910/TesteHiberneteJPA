package io.github.robson;

import io.github.robson.Model.contatos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *  Class Main
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        contatos create = new contatos(null,"Jose lino","9999-9999","teste@teste.com.br");
        contatos update = new contatos(1,"Luana lino","3333-5555","luana@teste.com.br");

        // Cria a conexão do banco chamando persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // Create
        /*
         em.getTransaction().begin();
         em.persist(create);
         em.getTransaction().commit();
        */

        // Get
        /*
          contatos con = em.find(contatos.class,1);
          System.out.println(con);
         */

        // Update
        /*
           em.getTransaction().begin();
           em.merge(update);
           em.getTransaction().commit();
         */

        // Delete
        /*
           contatos con = em.find(contatos.class,1);
           em.getTransaction().begin();
           em.remove(con);
           em.getTransaction().commit();
         */

        System.out.println("Terminado");
        em.close();
        emf.close();
    }
}