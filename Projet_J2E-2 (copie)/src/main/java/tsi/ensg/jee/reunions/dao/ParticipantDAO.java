package tsi.ensg.jee.reunions.dao;

import tsi.ensg.jee.reunions.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipantDAO extends JpaRepository<Participant, Long> {
 /*   public void addParticipant(Participant participant);
    public void updateParticipant(Participant participant);
    public Participant getParticipantById(int id);
    public List<Participant> findAll();
    public void deleteById(int id);*/
}
