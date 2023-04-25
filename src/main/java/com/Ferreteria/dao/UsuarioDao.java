/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ferreteria.dao;

import com.Ferreteria.domain.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
