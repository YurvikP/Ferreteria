/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ferreteria.dao;

import com.Ferreteria.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDao extends CrudRepository<Carrito, Long>  {
    Optional<Carrito> findByIdCliente(Long idCliente);
}
