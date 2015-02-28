package fr.moise.moisetest.controller;

import fr.moise.moisetest.model.Moise;
import fr.moise.moisetest.repository.MoiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Moïse on 24/02/15.
 */
@RestController
@RequestMapping("/document")
public class MoiseController extends AbstractCrudController<Moise, Long> {

    @Autowired
    private MoiseRepository moiseRepository;

    public MoiseController() {
        super();

    }

    @Autowired
    public CrudRepository<Moise, Long> getCrudRepository() {
        return moiseRepository;
    }
}
