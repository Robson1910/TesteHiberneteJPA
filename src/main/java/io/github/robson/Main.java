package io.github.robson;

import io.github.robson.Model.contatos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        contatos contatos = new contatos(18,"Luana lino","3333-5555","luana@teste.com.br");

        // Cria a conexão do banco chamando persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // Salvar no banco de dados
        /*
         em.getTransaction().begin();
         em.persist(contatos);
         em.getTransaction().commit();
        */

        // Buscar do banco de dados pelo ID
        /*
          contatos con = em.find(contatos.class,1);
          System.out.println(con);
         */

        // alterar no banco de dados
        /*
           em.getTransaction().begin();
           em.merge(contatos);
           em.getTransaction().commit();
         */

        // remover no banco de dados
        /*
           contatos con = em.find(contatos.class,18);
           em.getTransaction().begin();
           em.remove(con);
           em.getTransaction().commit();
         */

        System.out.println("Terminado");
        em.close();
        emf.close();
    }
}