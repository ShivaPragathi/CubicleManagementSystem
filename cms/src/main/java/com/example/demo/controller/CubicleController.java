package com.example.demo.controller;

import com.example.demo.model.Cubicle;
import com.example.demo.service.CubicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cubicles")
@CrossOrigin(origins="*")
public class CubicleController {
    @Autowired
    CubicleService cubicleService;

    @GetMapping("")
    public List<Cubicle> list() {
        return cubicleService.listAllCubicle();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cubicle> get(@PathVariable Integer id) {
        try {
            Cubicle Cubicle = cubicleService.getCubicle(id);
            return new ResponseEntity<Cubicle>(Cubicle, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Cubicle>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Cubicle Cubicle) {
        cubicleService.saveCubicle(Cubicle);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Cubicle Cubicle, @PathVariable Integer id) {
        try {
            Cubicle existCubicle = cubicleService.getCubicle(id);
            Cubicle.setId(id);
            cubicleService.saveCubicle(Cubicle);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        cubicleService.deleteCubicle(id);
    }
}
