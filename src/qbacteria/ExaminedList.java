/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qbacteria;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luk
 */
@XmlRootElement(name = "examinedList")
public class ExaminedList {

    public ExaminedList() {
    }
    private ArrayList<ExaminedEntity> examinedEntityList = new ArrayList();

    @XmlElements(
            @XmlElement(name = "examinedEntity"))
    public ArrayList<ExaminedEntity> getExaminedEntityList() {
        return examinedEntityList;
    }

    public void setExaminedEntityList(ArrayList<ExaminedEntity> examinedEntityList) {
        this.examinedEntityList = examinedEntityList;
    }

    public void add(ExaminedEntity item) {
        this.examinedEntityList.add(item);
    }

    public void remove(ExaminedEntity item) {
        this.examinedEntityList.remove(item);
    }
}
