package com.company.telefone.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TELEFONESAMPLE_TELEFONE")
@Entity(name = "telefonesample_Telefone")
public class Telefone extends StandardEntity {
    private static final long serialVersionUID = -568466898936283411L;

    @MetaProperty(datatype = "telefone")
    @Column(name = "NUMERO_TELEFONE", length = 11)
    protected String numeroTelefone;

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}