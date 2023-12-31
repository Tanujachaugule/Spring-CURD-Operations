package com.xadimn.springbootcurd.service;

import com.xadimn.springbootcurd.bean.Subject;
import com.xadimn.springbootcurd.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepository subjectRepository;
    public List<Subject> getAllSubjects()
    {
        List<Subject> subjects = new ArrayList<>();
         subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updateSubject(Subject id, Subject subject) {
        subjectRepository.save(subject);
    }

    public void deleteSubject(String id) {
        subjectRepository.deleteById(id);
    }
}
