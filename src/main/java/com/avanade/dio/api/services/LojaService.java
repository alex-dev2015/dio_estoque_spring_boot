package com.avanade.dio.api.services;

import java.util.ArrayList;
import java.util.List;

import com.avanade.dio.api.models.Loja;

import org.springframework.stereotype.Service;

@Service
public class LojaService {
    public List<Loja> findAll(){
      List<Loja> listaLoja = new ArrayList<Loja>();

      Loja l1 = new Loja(1, "Avanade Store Matriz", true);
      Loja l2 = new Loja(2, "Avanade Store Filial Centro", true);
      Loja l3 = new Loja(3, "Avanade Store Filial Grande Ilha", true);
      listaLoja.add(l1);
      listaLoja.add(l2);
      listaLoja.add(l3);

      return listaLoja;
    }

    public void inserir(Loja loja){
      System.out.println("Inserido com sucesso!" + loja);
    }

    public void alterar(Loja loja){
      System.out.println("Loja alterada com sucesso: " + loja);
    }

    public void excluir(Long id){
        System.out.println("Loja exclída com sucesso: " + id);
    }
}
