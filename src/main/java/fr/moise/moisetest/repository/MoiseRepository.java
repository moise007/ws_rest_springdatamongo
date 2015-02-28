package fr.moise.moisetest.repository;

import fr.moise.moisetest.model.Moise;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Moïse on 25/02/15.
 */
public interface MoiseRepository extends CrudRepository<Moise, Long> {
}
