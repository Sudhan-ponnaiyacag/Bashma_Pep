package net.javaguides.peptides_backend.service;

import net.javaguides.peptides_backend.dto.peptideDto;
import net.javaguides.peptides_backend.entity.peptide_1121_r1;
import net.javaguides.peptides_backend.mapper.peptideMapper;
import net.javaguides.peptides_backend.repository.PeptideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PeptideServiceImpl implements PeptideService{

    @Autowired
    PeptideRepository peptideRep;

    @Override
    public List<peptideDto> getPeptide(String category, String param){
        List<peptideDto> beanList = new ArrayList<>();

        if(category.equalsIgnoreCase("Accesssion")){
            List<peptide_1121_r1>  list;
            list = peptideRep.findByAccession(param);

            if(list != null && list.size()>0) {
                for (peptide_1121_r1 entity : list) {
                    peptideDto dto = peptideMapper.mapTopeptideDto(entity);
                    beanList.add(dto);
                }
            }
        }
        return beanList;
    }
}
