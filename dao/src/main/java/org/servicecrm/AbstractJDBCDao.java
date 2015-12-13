package org.servicecrm;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 13.12.2015.
 */
public class AbstractJDBCDao<T, PK extends Serializable> implements GenericDAO<T, PK> {

    public PK create(T newInstance) {
        return null;
    }

    public T read(PK id) {
        return null;
    }

    public void update(T transientObject) {

    }

    public void delete(T persistentObject) {

    }
}
