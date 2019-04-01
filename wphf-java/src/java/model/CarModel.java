package model;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="model")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarModel implements Serializable{
    //id,márka_id,név,megjelenésnapja,motortérfogat,lóerő,alapá
    private static int nextID;
    @XmlElement
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private Date releaseDate;
    @XmlElement
    private double engVolume;
    @XmlElement
    private int horsePower;
    @XmlElement
    private double basePrice;

    public CarModel() {
        this.id = nextID++;
    }

    public int getID(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getEngVolume() {
        return engVolume;
    }

    public void setEngVolume(double engVolume) {
        this.engVolume = engVolume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarModel other = (CarModel) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
