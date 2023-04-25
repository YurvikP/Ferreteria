/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ferreteria.dao;

import com.Ferreteria.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
