package net.javaguides.peptides_backend.repository;

import net.javaguides.peptides_backend.entity.peptide_1121_r1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeptideRepository  extends JpaRepository <peptide_1121_r1  , String> {

    @Query(value = "select a from peptide_1121_r1 a where a.accession like ?1")
    public List<peptide_1121_r1> findByAccession(String param);
}
