package com.xadimn.springbootcurd.repository;

import com.xadimn.springbootcurd.bean.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,String> {

}
