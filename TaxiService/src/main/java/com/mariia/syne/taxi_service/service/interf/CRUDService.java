package com.mariia.syne.taxi_service.service.interf;

import java.util.List;

public interface CRUDService<E, K> {
    void create(E entity);

    E findById(K id);

    List<E> findAll();

    void update(E entity);

    boolean delete(E entity);

}
