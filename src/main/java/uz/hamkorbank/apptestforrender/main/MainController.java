package uz.hamkorbank.apptestforrender.main;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping
    public ResponseEntity<?> getData(){
        return ResponseEntity.ok("Hello Java");
    }
}
