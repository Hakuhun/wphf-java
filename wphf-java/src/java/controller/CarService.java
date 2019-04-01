package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.CarBrand;
import model.CarModel;
import model.QueriedBrands;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CarService implements Serializable{

    private static CarService instance;

    public CarService() {
        CarBrand bmw = new CarBrand();
        bmw.setName("BMW");
        bmw.setCountryCode("DE");
        bmw.setURL("www.bmw.hu");
        bmw.setFoundationYear(1916);
        bmw.setYearlyIncome(502000000);
        
        CarModel e30 = new CarModel();
        e30.setName("E30 M3");
        e30.setEngVolume(2.5);
        e30.setHorsePower(173);
        Date re30 = new Date(355006503);
        e30.setBasePrice(2000);
        bmw.getModels().add(e30);
        
        
        brands.add(bmw);
        
        CarBrand opel = new CarBrand();
        opel.setName("Opel");
        opel.setURL("www.opel.hu");
        opel.setCountryCode("DE");
        opel.setFoundationYear(1862);
        opel.setYearlyIncome(502000000);
        
        CarModel manta = new CarModel();
        manta.setName("Manta B GTI");
        manta.setEngVolume(2.5);
        manta.setHorsePower(178);
        re30 = new Date(39387303);
        manta.setReleaseDate(re30);
        manta.setBasePrice(2000);
        
        CarModel corsa = new CarModel();
        corsa.setName("Corsa A");
        corsa.setBasePrice(2000);
        corsa.setHorsePower(120);
        corsa.setEngVolume(1.5);
        re30 = new Date(670539303);
        corsa.setReleaseDate(re30);
        opel.getModels().add(manta);
        opel.getModels().add(corsa);
        brands.add(opel);
    }
    
    public static CarService getInstance(){
        if (instance == null) {
            instance = new CarService();
        }
        return instance;
    }
    
    @XmlElement
    private List<CarBrand> brands = new ArrayList<>();

    public List<CarBrand> getBrands() {
        return brands;
    }
    
    public QueriedBrands getQueriedBrands(String brand){
        QueriedBrands local = new QueriedBrands();
        for (CarBrand b : brands) {
            if (b.getName().toLowerCase().trim().equals(brand.toLowerCase().trim())) {
                //local.setQueriedList((ArrayList<CarModel>) b.getModels());
                local.setBrand(b);
            }
        }
                
        return local;
    }
    
}
