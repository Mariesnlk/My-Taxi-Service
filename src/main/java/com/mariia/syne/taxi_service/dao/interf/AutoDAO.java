package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.Auto;

import java.util.List;

public interface AutoDAO extends CRUDDAO<Auto, Integer>{

    static final String STATUS_ACTIVE = "ACTIVE";

    List<Auto> sortCapacityIncrease();

    List<Auto> sortCapacityDecrease();

    List<Auto> sortCategoryIncrease();

    List<Auto> sortCategoryDecrease();

    List<Auto> sortStatusIncrease();

    List<Auto> sortStatusDecrease();

}
