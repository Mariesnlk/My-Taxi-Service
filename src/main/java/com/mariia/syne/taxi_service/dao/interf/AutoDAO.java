package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.Auto;

public interface AutoDAO extends CRUDDAO<Auto, Integer>{

    Auto findById(Integer idAuto);

    Auto updateAutoById(Integer idAuto, Auto newAuto);

    boolean deleteAutoById(Integer idAuto);
}
