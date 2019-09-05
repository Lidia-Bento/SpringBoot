package com.treinamento.receita.service;
import com.treinamento.receita.model.ReceitaEntity;
import com.treinamento.receita.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceitaServiceImpl implements ReceitaService {
    @Autowired
    ReceitaRepository receitaRepository;
    @Override
    public List<ReceitaEntity> findByName(String name){return receitaRepository.findByName(name);}
    @Override
    public List<ReceitaEntity> findAll(){return receitaRepository.findAll();}
    @Override
    public ReceitaEntity save(ReceitaEntity receitas){return receitaRepository.save(receitas);}
}