package com.treinamento.receita.repository;
import com.treinamento.receita.model.ReceitaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReceitaRepository extends CrudRepository<ReceitaEntity, Long> {
    List<ReceitaEntity> findByName (String id_receita);
    List<ReceitaEntity> findAll();
    @Query(value = "SELECT U FROM Receitas AS R WHERE R.ID = :id AND R.name =:name")
    ReceitaEntity findAllField (@Param("id_receita") long id, @Param("name")String name);
}