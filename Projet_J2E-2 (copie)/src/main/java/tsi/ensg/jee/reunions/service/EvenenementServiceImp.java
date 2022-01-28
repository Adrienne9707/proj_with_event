package tsi.ensg.jee.reunions.service;

import org.springframework.beans.factory.annotation.Autowired;
import tsi.ensg.jee.reunions.dao.EvenementDAO;
import tsi.ensg.jee.reunions.dao.ParticipantDAO;
import tsi.ensg.jee.reunions.model.Evenement;
import tsi.ensg.jee.reunions.model.Participant;

import java.util.List;

public class EvenenementServiceImp {
    @Autowired
    private EvenementDAO evenementDAO;

    public void setEvenementDAO(EvenementDAO evenementDAO) {

        this.evenementDAO = evenementDAO;
    }

    //@Override
    // @Transactional
    public void addEvenement(Evenement evenement) {

        this.evenementDAO.save(evenement);
    }

    //@Override
    public void updateParticipant(Evenement evenement) {

    }


    //@Override
    //@Transactional
    public List<Evenement> listAll() {

        return this.evenementDAO.findAll();
    }

    public void save(Evenement evenement) {

        evenementDAO.save(evenement);
    }

    public Evenement get(long id) {

        return evenementDAO.findById(id).get();
    }

    public void delete(long id) {

        evenementDAO.deleteById(id);
    }
}
