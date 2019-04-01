package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "queriedCars")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueriedBrands implements Serializable{
    
    @XmlElement(name = "brand")
    private CarBrand brand;
   
    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }
   
}
