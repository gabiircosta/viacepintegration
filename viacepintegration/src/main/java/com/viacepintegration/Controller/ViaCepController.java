package com.viacepintegration.Controller;

import com.viacepintegration.DTO.ViaCepDto;
import com.viacepintegration.Service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/api")
public class ViaCepController {

    @Autowired
    private ViaCepService service;

    @GetMapping("/{cep}")
    public ResponseEntity<ViaCepDto> getLocal (@PathVariable ("cep") String cep){
        return ResponseEntity.ok(service.getLocal(cep));
    }
}
