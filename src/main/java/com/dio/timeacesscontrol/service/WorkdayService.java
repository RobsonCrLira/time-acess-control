package com.dio.timeacesscontrol.service;

import com.dio.timeacesscontrol.model.Workday;
import com.dio.timeacesscontrol.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkdayService {

    @Autowired
    WorkdayRepository workdayRepository;

    public Workday saveWorkday(Workday workday){
        return workdayRepository.save(workday);
    }

    public List<Workday> findAll() {
        return workdayRepository.findAll();
    }

    public Optional<Workday> getById(Long id) {
        return workdayRepository.findById(id);
    }

    public Workday updateWorkday(Workday workday){
        return workdayRepository.save(workday);
    }

    public void deleteById(Long id) {
        workdayRepository.deleteById(id);
    }
}
