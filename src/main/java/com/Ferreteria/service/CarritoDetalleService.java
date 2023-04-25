/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ferreteria.service;

import com.Ferreteria.domain.Articulo;
import com.Ferreteria.domain.CarritoDetalle;
import java.util.List;


public interface CarritoDetalleService {
    CarritoDetalle getCarritoDetalle(Long idCarrito, Articulo articulo);
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);
    public void save(CarritoDetalle carritoDetalle);
    public void delete(CarritoDetalle carritoDetalle);
    public void deleteAll(Long idCarrito);
}