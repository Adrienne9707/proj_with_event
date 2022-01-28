package tsi.ensg.jee.reunions.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import tsi.ensg.jee.reunions.model.Evenement;

public interface EvenementDAO extends JpaRepository<Evenement, Long>{
}
