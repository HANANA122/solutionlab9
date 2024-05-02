package dz.ibnrochd.master14.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dz.ibnrochd.master14.business.TraitementService;
import dz.ibnrochd.master14.model.Traitement;

import java.util.List;

@RestController
@RequestMapping("/traitement")
public class TraitementController {
	

	    @Autowired
	    TraitementService traitementService;
	    @GetMapping("/traitements")
	    public List<Traitement> getAllPatient(){
	        return traitementService.getAllTraitement();
	    }

	    @GetMapping("/{nom}")
	    public Traitement getPatientByName(@PathVariable String nom) {
	       // return traitementService.getById(nomTraitement);
	       return  traitementService.getById(nom);

	    }

	    @PostMapping("/add/Traitement")
	    public void createPatient(@RequestBody Traitement Traitement) {
	        traitementService.createTraitement(Traitement);
	        System.out.println("Traitement add successfully");
	    }
	    @PutMapping("/update/traitement")
	    public void updatePatient(@RequestBody Traitement traitement) {
	        traitementService.updateTraitement(traitement);
	        System.out.println("traitemet updated successfully");
	    }
	    @DeleteMapping("delete")
	    public void deletePatient(@RequestBody int traitement) {
	        traitementService.deletTraitement(traitement);
	        System.out.println("patient delete successfully");
	    }
	


}
