package dao;

import model.Comment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CommentDAO {

    @PersistenceContext(unitName = "FineXSS")
    private EntityManager em;


    public List<Comment> getComments() {
        return em.createQuery("SELECT K FROM Comment K", Comment.class).getResultList();
    }

    public void add(Comment comment) {
        em.persist(comment);
    }
}
