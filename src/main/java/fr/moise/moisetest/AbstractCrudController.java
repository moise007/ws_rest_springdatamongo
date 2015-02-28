package fr.moise.moisetest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

/**
 * Created by Moïse on 25/02/15.
 */
@Slf4j
public abstract class AbstractCrudController<T, ID extends Serializable> {

    protected abstract CrudRepository<T, ID> getCrudRepository();

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public T findOne(@RequestParam("objectId") ID var1) {
        T o = getCrudRepository().findOne(var1);
        log.info("findOne id({}): {}", var1, o);
        return o;
    }

    @RequestMapping(value = "/exists", method = RequestMethod.GET)
    public boolean exists(@RequestParam("objectId") ID var1) {
        return getCrudRepository().exists(var1);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<T> findAll() {
        return getCrudRepository().findAll();
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long count() {
        return getCrudRepository().count();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam("objectId") ID var1) {
        getCrudRepository().delete(var1);
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public void deleteAll() {
        getCrudRepository().deleteAll();
    }


}
