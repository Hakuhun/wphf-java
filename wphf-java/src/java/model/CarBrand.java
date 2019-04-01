package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="brand")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarBrand implements Serializable{
    //id,név,országnév,url,alapításéve,évesforgalom
    private static int nextID;
    @XmlElement
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String countryCode;
    @XmlElement
    private String URL;
    @XmlElement
    private int foundationYear;
    @XmlElement
    private double yearlyIncome;
    @XmlElement
    private List<CarModel> models = new ArrayList<>();

    //ALT + INSERT -> Kódgenerálás
    public CarBrand() {
        this.id = nextID++;
    }

    public List<CarModel> getModels() {
        return models;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final CarBrand other = (CarBrand) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
