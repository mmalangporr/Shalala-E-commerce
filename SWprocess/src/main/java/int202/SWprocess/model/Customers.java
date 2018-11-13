/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWProcess.model;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author Kittisak
 */
@Entity
@Table(name = "customers")
public class Customers extends SerializableSerializer{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
    
    @NotBlank
    private String creditCard;
    
    @NotBlank
    private String shoppingInfo;
        
    @NotBlank
    private long userId;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getShoppingInfo() {
        return shoppingInfo;
    }

    public void setShoppingInfo(String shoppingInfo) {
        this.shoppingInfo = shoppingInfo;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerId=" + customerId + ", creditCard=" + creditCard + ", shoppingInfo=" + shoppingInfo + ", userId=" + userId + '}';
    }
   
}
