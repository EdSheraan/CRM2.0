/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service;

import java.util.List;

/**
 *
 * @author Leandro Burgos
 * @param <T>
 */
public interface CRUDService<T> {
    
    public Object add(T bean);
    public int update(T bean);
    public int delete(T bean);
    public List<T> list(Object ... param);
    public List<T> listEnabled(Object ... param);
    public List<T> listDisabled(Object ... param);
    public List<T> search(Object ... param);
    public T get(Object ... id);
    public T getByParent(Object ...parentID);
}
