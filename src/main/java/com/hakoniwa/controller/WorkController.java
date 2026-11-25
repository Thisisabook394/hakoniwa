package com.hakoniwa.controller;

import com.hakoniwa.entity.Work;
import com.hakoniwa.mapper.WorkMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkController {

    private final WorkMapper workMapper;

    public WorkController(WorkMapper workMapper) {
        this.workMapper = workMapper;
    }

    @GetMapping("/works")
    public List<Work> list() {
        return workMapper.findAll();
    }
}