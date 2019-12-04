package com.example.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.ImpuestosEntity;
import com.example.Entity.UsuarioEntity;
import com.example.Repository.ImpuestosRepository;
import com.example.Repository.UsuarioRepository;



@RestController
public class Controller {

    @Autowired
    ImpuestosRepository repository;
    
    @Autowired
    UsuarioRepository usuariorepository;


    

    @GetMapping("/impuestos")
    public List<ImpuestosEntity> getAllImpuesto() {
        return repository.findAll();
    }
    

    @PostMapping("/impuesto/")
    public ImpuestosEntity createImpuesto(@RequestBody ImpuestosEntity impuesto) {
        return repository.save(impuesto);
    }
//2--
   @GetMapping("/fecha/{desde}/{hasta}")
    public List<ImpuestosEntity> getAllImpuestoDesdeHasta(
            @PathVariable Date desde,
            @PathVariable Date hasta) {
        return repository.findAllByFechaBetween(desde, hasta);
    }
   
   @PostMapping("/Usuario")
   public UsuarioEntity createUsuario(@RequestBody UsuarioEntity usuario) {
       return usuariorepository.save(usuario);
   }
   //1--
   @PutMapping("/afip/{id}/{fecha}")
   public ImpuestosEntity updateFecha(@PathVariable Long id,@PathVariable Date fecha) {
	if(repository.existsById(id)) {
    	 ImpuestosEntity imp = repository.findByIdimpuestosLike(id);
    	 imp.setFecha(fecha);
    	 return repository.save(imp);
     }else {
    	 return null;
    	 } 
     
   }
   @GetMapping("/idCuil/Impuestos")
   public UsuarioEntity Listado(@PathVariable Long idCuil,PathVariable String Impuestos) 
   
   
   
   
    }

   
     
//}