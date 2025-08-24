package com.uniqueId.controller;

import com.uniqueId.model.Idgenerator;
import com.uniqueId.model.NameRequest;
import com.uniqueId.model.UniqueIdResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UniqueIdController {

    @PostMapping("/generate-id")
    public UniqueIdResponse generateId(@RequestBody NameRequest request, Idgenerator idgenerator) {
        String name = request.getName();
        String IdValue = idgenerator.getId().toString();
        String uniqueId = name + "-" +IdValue;
        return new UniqueIdResponse(uniqueId, IdValue);
    }
}