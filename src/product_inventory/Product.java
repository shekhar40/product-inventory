/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product_inventory;

/**
 *
 * @author MD ABDUL MANNAN
 */
public class Product {
    
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    
    public Product(int pid,String pname,float pprice,String paddDate,byte[] ppicture)
    {
        this.id=pid;
        this.name=pname;
        this.price=pprice;
        this.addDate=paddDate;
        this.picture=ppicture;
    }
    public int getId(){
    
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    public String getAddDate()
    {
    return addDate;
    }
    public byte[] getPicture()
    {
    
        return picture;
    }
}
