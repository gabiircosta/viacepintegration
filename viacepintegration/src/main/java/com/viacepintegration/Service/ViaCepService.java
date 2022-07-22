package com.viacepintegration.Service;

import com.viacepintegration.DTO.ViaCepDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    @Autowired
    private ViaCepClient client;

    public ViaCepDto getLocal (String cep){
        return client.getLocal(cep);
    }

}
