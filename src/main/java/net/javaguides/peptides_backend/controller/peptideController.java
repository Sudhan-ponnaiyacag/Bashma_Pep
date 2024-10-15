package net.javaguides.peptides_backend.controller;

import net.javaguides.peptides_backend.dto.peptideDto;
import net.javaguides.peptides_backend.service.PeptideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@RestController
@RequestMapping(value = "/api/peptide")
public class peptideController {

    @Autowired(required=true)
    PeptideService peptideService;

    @RequestMapping(value = "/searchPedtide",method = RequestMethod.GET)
    public List<peptideDto> searchPedtide(@RequestParam (value = "category",required = true) String category,
                                          @RequestParam (value = "searchValue",required = true) String searchValue){
        return peptideService.getPeptide(category,searchValue);
    }
}

