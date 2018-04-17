/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qbacteria;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luk
 */
@XmlRootElement(name = "examinedEntity")
public class ExaminedEntity {

    public ExaminedEntity() {
    }
    int genotype;
    String clasS;

    public ExaminedEntity(int genotype, String clasS) {
        this.genotype = genotype;
        this.clasS = clasS;
    }

    @XmlAttribute(name = "genotype")
    public int getGenotype() {
        return genotype;
    }

    public void setGenotype(int genotype) {
        this.genotype = genotype;
    }

    @XmlAttribute(name = "class")
    public String getClasS() {
        return clasS;
    }

    public void setClasS(String clasS) {
        this.clasS = clasS;
    }

}
