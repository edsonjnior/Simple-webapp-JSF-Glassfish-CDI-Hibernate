package br.com.middmoon.simple.blank.hibernate5.controllers;

import br.com.middmoon.simple.blank.hibernate5.models.Contato;
import br.com.middmoon.simple.blank.hibernate5.repositoy.ContatoDao;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class HomeController {
    
    @Inject
    private ContatoDao contatoDao;
    List<Contato> contatos;
    
    
    @PostConstruct
    void init(){
        contatos = contatoDao.findAll();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    
}
