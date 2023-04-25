/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ferreteria.service;

import com.Ferreteria.dao.CarritoDao;
import com.Ferreteria.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarritoServiceImpl implements CarritoService {
    @Autowired
    CarritoDao carritoDao; 
    @Override
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findById(carrito.getIdCarrito()).orElse(null);
    }
    @Override
    public Carrito getCarritoCliente(long idCliente) {
        var carrito = carritoDao.findByIdCliente(idCliente).orElse(null);
        if (carrito == null) {
            Carrito nuevo = new Carrito(idCliente);
            carrito = carritoDao.save(nuevo);
        }
        return carrito;
    }
}
