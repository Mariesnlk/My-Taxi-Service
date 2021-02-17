package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.Auto;

import java.util.List;

public interface AutoDAO extends CRUDDAO<Auto, Integer>{

    public List<Auto> sortCapacityIncrease();

    public List<Auto> sortCapacityDecrease();

    public List<Auto> sortCategoryIncrease();

    public List<Auto> sortCategoryDecrease();

    public List<Auto> sortStatusIncrease();

    public List<Auto> sortStatusDecrease();

}
