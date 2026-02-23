package Module2.springbootwebturorial.controllers;

import Module2.springbootwebturorial.dto.EmployeeDTO;
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

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable long employeeId){
        return new EmployeeDTO(employeeId, "Amit", "amit@gmail.com",23, LocalDate.of(2024,1,2),true);
    }

    @GetMapping(path = "")
    public String getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortBy) {
        return "Hi age "+age+" "+sortBy;
    }
}
