package io.github.robson.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *  Entities contatos
 */
@Entity
public class contatos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcon;
    private String nome;
    private String fone;
    private String email;

    /**
     *  Constructor empty
     */
    public contatos() {
        super();
    }

    /**
     * @param idcon
     * @param nome
     * @param fone
     * @param email
     */
    public contatos(Integer idcon, String nome, String fone, String email) {
        this.idcon = idcon;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    /**
     * @return idcon
     */
    public Integer getIdcon() {
        return idcon;
    }

    /**
     * @param idcon
     */
    public void setIdcon(Integer idcon) {
        this.idcon = idcon;
    }

    /**
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return idcon + " - " + nome + " - " + fone + " - " +email;
    }
}
