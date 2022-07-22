package com.viacepintegration.Service;

import com.viacepintegration.DTO.ViaCepDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacepclient", url = "viacep.com.br/ws/")
public interface ViaCepClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    ViaCepDto getLocal(@PathVariable("cep") String cep);
}
