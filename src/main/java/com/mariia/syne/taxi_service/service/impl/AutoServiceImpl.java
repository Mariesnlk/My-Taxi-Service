package com.mariia.syne.taxi_service.service.impl;

import com.mariia.syne.taxi_service.dao.impl.AutoDAOImpl;
import com.mariia.syne.taxi_service.dao.interf.AutoDAO;
import com.mariia.syne.taxi_service.model.Auto;
import com.mariia.syne.taxi_service.service.interf.AutoService;

import java.util.List;

public class AutoServiceImpl implements AutoService {

    @Override
    public void create(Auto auto) {
        AutoDAO autoDAO = new AutoDAOImpl();
        autoDAO.create(auto);
    }

    @Override
    public Auto findById(Integer id) {
        AutoDAO autoDAO = new AutoDAOImpl();
        Auto auto = autoDAO.findById(id);
        return auto;
    }

    @Override
    public List<Auto> findAll() {
        AutoDAO autoDAO = new AutoDAOImpl();
        List<Auto> allAutos = autoDAO.findAll();
        return allAutos;
    }

    @Override
    public void update(Auto auto) {
        AutoDAO autoDAO = new AutoDAOImpl();
        autoDAO.update(auto);
    }

    @Override
    public boolean delete(Auto auto) {
        AutoDAO autoDAO = new AutoDAOImpl();
        boolean result = autoDAO.delete(auto);
        //System.out.println("Delete auto: " + result);
        return result;
    }
}
