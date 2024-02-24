package com.example.task.reposities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ParentRepository<T, ID> extends JpaRepository<T, ID> {


    T findByIdOrThrowException(ID id);

}
