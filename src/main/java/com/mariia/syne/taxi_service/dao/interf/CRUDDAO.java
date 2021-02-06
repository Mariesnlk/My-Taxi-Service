package com.mariia.syne.taxi_service.dao.interf;

import java.util.List;

public interface CRUDDAO<E, K> {

    void create(E entity);

    E findById(K id);

    List<E> findAll();

    void update(E entity);

    void delete(E entity);

}
