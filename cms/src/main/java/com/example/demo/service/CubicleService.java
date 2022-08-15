package com.example.demo.service;

import com.example.demo.model.Cubicle;
import com.example.demo.repository.CubicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class CubicleService {
    @Autowired
    private CubicleRepository cubicleRepository;
    public List<Cubicle> listAllCubicle() {
        List<Cubicle> returnList =  new ArrayList<>();
        Iterator<Cubicle> iterator = cubicleRepository.findAll().iterator();
        while(iterator.hasNext()) {
            returnList.add(iterator.next());
        }
        return returnList;
    }

    public void saveCubicle(Cubicle Cubicle) {
        cubicleRepository.save(Cubicle);
    }

    public Cubicle getCubicle(Integer id) {
        return cubicleRepository.findById(id).get();
    }

    public void deleteCubicle(Integer id) {
        cubicleRepository.deleteById(id);
    }
}
