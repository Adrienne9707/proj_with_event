package tsi.ensg.jee.reunions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import tsi.ensg.jee.reunions.dao.ParticipantDAO;
import tsi.ensg.jee.reunions.model.Participant;



import java.util.List;
import java.util.Optional;


@Service
public class ParticipantServiceImp  {

    @Autowired
    private ParticipantDAO participantDAO;

    public void setParticipantDAO(ParticipantDAO participantDAO) {

        this.participantDAO = participantDAO;
    }

    //@Override
   // @Transactional
    public void addParticipant(Participant participant) {

        this.participantDAO.save(participant);
    }

    //@Override
    public void updateParticipant(Participant participant) {

    }


    //@Override
    //@Transactional
    public List<Participant> listAll() {
        return this.participantDAO.findAll();
    }

    public void save(Participant participant) {
        participantDAO.save(participant);
    }

    public Participant get(long id) {
        return participantDAO.findById(id).get();
    }

    public void delete(long id) {
        participantDAO.deleteById(id);
    }
}
