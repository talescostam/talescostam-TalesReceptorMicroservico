package com.senac.TalesReceptorMicroservico.repository;

import com.senac.TalesReceptorMicroservico.entity.Cheer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CheerRepository extends JpaRepository<Cheer, Integer> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cheer (id, name) VALUES (:id, :name)", nativeQuery = true)
    void createCheer(@Param("user_id") int userId);

}
