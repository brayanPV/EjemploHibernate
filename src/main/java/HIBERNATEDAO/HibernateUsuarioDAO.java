/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HIBERNATEDAO;

import DAO.UsuarioDAO;
import DTO.Usuario;
import HUTILS.HibernateSession;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author stive
 */
public class HibernateUsuarioDAO implements UsuarioDAO {

    @Override
    public Usuario selectById(String usuarioId) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        Session session = sessionFactory.openSession();
        Usuario usuario = (Usuario) session.get(Usuario.class, usuarioId);
        session.close();
        return usuario;
    }

    @Override
    public List<Usuario> selectAll() {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        session.close();
        return usuarios;
    }

    @Override
    public void insert(Usuario usuario) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String id = (String) session.save(usuario);
        usuario.setUsuario(id);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void update(Usuario usuario) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(usuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Usuario usuario) {
        //To change body of generated methods, choose Tools | Templates.
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(usuario);
        session.getTransaction().commit();
        session.close();
    }

}
