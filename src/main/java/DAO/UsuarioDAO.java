/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Usuario;
import java.util.List;


/**
 *
 * @author stive
 */
public interface UsuarioDAO {

    public Usuario selectById(String Usuario);
    
    public List<Usuario> selectAll();
    
    public void insert(Usuario usuario);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);
    
}
