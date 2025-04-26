package com.example.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jpaCityService")
@Repository
@Transactional
public class JPACityDAO implements CityDAO{
    private static final Log LOG= LogFactory.getLog(JPACityDAO.class);

    @PersistenceContext
    private EntityManager em;
    @Transactional(readOnly = true)
    public City findById(int id_city) {

        TypedQuery<City> query =em.createQuery("select c from City c where c.id_city=:id_city", City.class);
        query.setParameter("id_city",id_city);
        return query.getSingleResult();
    }

    @Transactional(readOnly = true)
    public List<City> findAll() {
        return em.createQuery("select c from City c", City.class).getResultList();
    }

    @Override
    public List<City> findByTitle(String name_city) {
        TypedQuery<City> query=em.createQuery("select c from City c where c.name_city LIKE :name_city", City.class);
        query.setParameter("name_city", "%"+name_city+"%");
        return query.getResultList();
    }

    @Override
    public void insert(City city) {
em.persist(city);
LOG.info("City saved with id:"+city.getId_city());

    }

    @Override
    public void update(City city) {
        if (city.getId_city()!=0 && em.find(City.class, city.getId_city())!=null)em.merge(city);
        LOG.info("City updated with id:"+city.getId_city());
    }

    @Override
    public void delete(int id_city) {
            em.remove(em.find(City.class, id_city));
        LOG.info("City deleted with id:"+id_city);
    }


}
