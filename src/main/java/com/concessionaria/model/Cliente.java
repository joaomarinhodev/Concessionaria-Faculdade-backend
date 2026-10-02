package com.concessionaria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String nome;
    @Column(nullable = false) private String tipoPessoa;
    @Column(nullable = false, unique = true) private String cpfCnpj;
    private String telefone, cep, cidade, endereco, bairro, numero, email;

    public Cliente() {}
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getNome(){return nome;} public void setNome(String v){this.nome=v;}
    public String getTipoPessoa(){return tipoPessoa;} public void setTipoPessoa(String v){this.tipoPessoa=v;}
    public String getCpfCnpj(){return cpfCnpj;} public void setCpfCnpj(String v){this.cpfCnpj=v;}
    public String getTelefone(){return telefone;} public void setTelefone(String v){this.telefone=v;}
    public String getCep(){return cep;} public void setCep(String v){this.cep=v;}
    public String getCidade(){return cidade;} public void setCidade(String v){this.cidade=v;}
    public String getEndereco(){return endereco;} public void setEndereco(String v){this.endereco=v;}
    public String getBairro(){return bairro;} public void setBairro(String v){this.bairro=v;}
    public String getNumero(){return numero;} public void setNumero(String v){this.numero=v;}
    public String getEmail(){return email;} public void setEmail(String v){this.email=v;}
}
