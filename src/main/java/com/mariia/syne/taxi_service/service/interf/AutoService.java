package com.mariia.syne.taxi_service.service.interf;

import com.mariia.syne.taxi_service.model.Auto;

import java.util.List;

public interface AutoService extends CRUDService<Auto, Integer> {

    List<Auto> sortCapacityIncrease();

    List<Auto> sortCapacityDecrease();

    List<Auto> sortCategoryIncrease();

    List<Auto> sortCategoryDecrease();

    List<Auto> sortStatusIncrease();

    List<Auto> sortStatusDecrease();

    List<Auto> findActiveAutos();
}

