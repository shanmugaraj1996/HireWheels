package com.upgrad.hirewheels.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
public class VehicleCategory {

    @Id
    @GeneratedValue
    @Column(name = "vehicle_category_id")
    private  int vehicleCategoryId;

    @Column(name = "vehicle_category_name", length = 50, nullable = false, unique = true)
    private String vehicleCategoryName;

    @OneToMany (mappedBy = "vehicleCategory", fetch = FetchType.EAGER, cascade =  {CascadeType.ALL})
    private Set<VehicleSubcategory> vehicleSubcategories;

    public VehicleCategory() {
    }

    public VehicleCategory(int vehicleCategoryId, String vehicleCategoryName) {
        this.vehicleCategoryId = vehicleCategoryId;
        this.vehicleCategoryName = vehicleCategoryName;
    }

    public Set<VehicleSubcategory> getVehicleSubcategories() {
        return vehicleSubcategories;
    }

    public void setVehicleSubcategories(Set<VehicleSubcategory> vehicleSubcategories) {
        this.vehicleSubcategories = vehicleSubcategories;
    }

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    @Override
    public String toString() {
        return "VehicleCategory{vehicleCategoryId="+vehicleCategoryId
                +", vehicleCategoryName="+vehicleCategoryName
                +"}";
    }
}
