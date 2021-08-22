package com.dio.timeacesscontrol.controller;

import com.dio.timeacesscontrol.model.Workday;
import com.dio.timeacesscontrol.service.WorkdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workday")
public class WorkdayController {

    @Autowired
    WorkdayService workdayService;

    @PostMapping
    public Workday createWorkday(@RequestBody Workday workday){
        return workdayService.saveWorkday(workday);
    }

    @GetMapping
    public List<Workday> getWorkdayList(){
        return workdayService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workday> getWorkdayByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(workdayService.getById(id)
                .orElseThrow(()-> new NoSuchElementException("Workday not found")));
    }

    @PutMapping
    public Workday updateWorkday(@RequestBody Workday workday){
        return workdayService.updateWorkday(workday);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Workday>   deleteByID(@PathVariable("id") Long id) throws Exception {
        try {
            workdayService.deleteById(id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Workday>) ResponseEntity.ok();

    }
}
