package ohjelmistoprojekti.ticketguru.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MyyntitapahtumaRepository extends JpaRepository<Myyntitapahtuma, Long> {

}
