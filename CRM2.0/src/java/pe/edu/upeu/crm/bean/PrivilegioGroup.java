/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class PrivilegioGroup implements Serializable{

    private Privilegio parent;
    private List<Privilegio> childs;

    public Privilegio getParent() {
        return parent;
    }

    public void setParent(Privilegio parent) {
        this.parent = parent;
    }

    public List<Privilegio> getChilds() {
        return childs;
    }

    public void setChilds(List<Privilegio> childs) {
        this.childs = childs;
    }
    
    public void addChild(Privilegio child){
        if(this.childs == null){
            this.childs = new ArrayList<>();
        }
        this.childs.add(child);
    }

}
