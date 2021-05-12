package com.avanade.dio.api.services;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.avanade.dio.api.models.Produto;

@Service
public class ProdutoService {
    public List<Produto> findAll(){
      List<Produto> listaProduto = new ArrayList<Produto>();
      Produto p1 = new Produto(1, "descricao1", new Date(), "123344", true);
      Produto p2 = new Produto(2, "descricao2", new Date(), "543210", true);
      listaProduto.add(p1);
      listaProduto.add(p2);

      return listaProduto;
    }

    public void inserir(Produto produto){
       System.out.println("Inserido com sucesso!" + produto);
    }

    public void alterar(Produto produto){
      System.out.println("Produto alterado com sucesso: " + produto);
    }

    public void excluir(Long id){
        System.out.println("Produto exclído com sucesso: " + id);
    }

    
}
