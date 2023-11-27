package ir.education.system.management.base.repository;

import ir.education.system.management.base.domin.BaseEntity;

import java.io.Serializable;
import java.util.Collection;


public interface BaseEntityRepository<ID extends Serializable, T extends BaseEntity<ID>> {

    T save(T entity);

    T update(T entity,ID id);

    void deleteById(ID id);

    Collection<T> findAll();

    void beginTransaction();

    void commitTransaction();

    void rollBack();
}