package br.salaoEveris.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import br.salaoEveris.app.request.ClienteRequest;
import br.salaoEveris.app.response.BaseResponse;
import br.salaoEveris.app.response.ClienteListResponse;
import br.salaoEveris.app.response.ClienteResponse;
import br.salaoEveris.app.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController{

	@Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity inserir(@RequestBody ClienteRequest request) {
        try {
            BaseResponse response = service.inserir(request);
            return ResponseEntity.status(response.statusCode).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(errorBase.statusCode).body(errorBase);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {
        try {
            ClienteResponse response = service.obter(id);
            return ResponseEntity.status(response.statusCode).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(errorBase.statusCode).body(errorBase);
        }
    }

    @GetMapping
    public ResponseEntity listar() {
        try {
            ClienteListResponse response = service.listar();
            return ResponseEntity.status(response.statusCode).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(errorBase.statusCode).body(errorBase);
        }
    }
}
