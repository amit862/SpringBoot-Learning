package Module2.springbootwebturorial.controllers;

import Module2.springbootwebturorial.dto.EmployeeDTO;
import Module2.springbootwebturorial.entities.EmployeeEntity;
import Module2.springbootwebturorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage() {
//        return "Secret message: asdfg@DASAD";
//    }

    private final EmployeeRepository employeeRepository; //This is not good practic, this shoild be in service layer

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId")Long id){ //EmployeeEntity---This is not good practic it should be in service layer
        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age,
                                                @RequestParam(required = false) String sortBy) {
        return employeeRepository.findAll();
    }

    @PostMapping
    public EmployeeEntity  createNewEmployee(@RequestBody EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }

    @PutMapping String updateEmployeeById() {
        return "Hello from PUT";
    }
}
