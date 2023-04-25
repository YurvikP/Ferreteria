/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ferreteria.service;

import com.Ferreteria.domain.Carrito;


public interface CarritoService {
    public Carrito getCarrito(Carrito carrito);
    public Carrito getCarritoCliente(long idCliente);
}
