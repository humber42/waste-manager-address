package cu.humberto.wastemanageraddress.api.v1;

import cu.humberto.wastemanageraddress.dto.WasteManagerAddressDTO;
import cu.humberto.wastemanageraddress.service.WasteManagerAddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class WasteManagerAddressController {
    private final WasteManagerAddressService service;

    @GetMapping("/all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") long id){
        service.deleteById(id);
        return ResponseEntity.ok("Eliminacion exitosa");
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody WasteManagerAddressDTO wasteManagerAddressDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().body("Error en los datos");
        }else{
            return ResponseEntity.ok(service.create(wasteManagerAddressDTO));
        }
    }

    @PutMapping
    public ResponseEntity update(@Valid @RequestBody WasteManagerAddressDTO wasteManagerAddressDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().body("Error en los datos");
        }else{
            return ResponseEntity.ok(service.update(wasteManagerAddressDTO));
        }
    }
}
