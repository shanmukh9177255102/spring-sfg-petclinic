package org.springframewor.sfpetclinicdata.services.map;

import org.springframewor.sfpetclinicdata.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity,ID extends Long>{

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
      return map.get(id);
    }
    T save(T obj){
        if(obj != null){
            if(obj.getId() == null) {
                obj.setId(getNextId());
            } map.put(obj.getId(), obj);
        }else{
            throw new RuntimeException("Object cannot be saved..");
        }
        return obj;
    }
    void deleteById(ID id){
        map.remove(id);

    }
    void delete(T object){
        map.entrySet().removeIf(e -> e.getValue().equals(object) );
    }

    Long getNextId(){
        return map.isEmpty() ? 1L : Collections.max(map.keySet())+1;
    }
}
