package com.example.task.reposities.impl;

import com.example.task.reposities.ParentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class ParentRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements ParentRepository<T, ID> {

    public ParentRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    public ParentRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
    }

    @Override
    public T findByIdOrThrowException(ID id) {
        return findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("Cannot find " + this.getDomainClass().getSimpleName() + "  by id: " + id);
        });
    }

}
