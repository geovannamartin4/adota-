package com.adota.backend.controller;

import com.adota.backend.entity.Ong;
import com.adota.backend.service.OngService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ongs")
public class OngController {

    private final OngService ongService;

    public OngController(OngService ongService) {
        this.ongService = ongService;
    }

}
```
