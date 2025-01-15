package java15.service;

import java.util.List;

public interface Generic<T,L> {

    // crud
    // create

    void create(T t);

    // getAll
    List<T> getAll();

    // get by id
    T getById(L l);

    // update
    void  updateById(L l,T t);

    // delete
    void  deleteById(L l);

}
