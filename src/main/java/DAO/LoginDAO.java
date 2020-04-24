/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Usuario;
import HIBERNATEDAO.HibernateUsuarioDAO;

/**
 *
 * @author stive
 */
public class LoginDAO {

    public String authenticateUser(Usuario usuario) {
        UsuarioDAO usuarioDAO = new HibernateUsuarioDAO();
        Usuario u = usuarioDAO.selectById(usuario.getUsuario());
        if (u != null) {
            if (u.getClave().contentEquals(usuario.getClave())) {
                return "SUCCESS";
            }
        }
        return "ERROR";
    }
}
