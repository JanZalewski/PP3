
/**
 11. The Product class describes food products using two attributes:
 the product name and whether the product is vegetarian.
 Define the class, its attributes, and getter and setter methods for all attributes.
 Then create a product, set attributes' values and display product information
 */
public class Product
{
    private String productName;
    private boolean isVege;
    
    public void setProductName(String name){
        this.productName = name;
    };
    public void setIsVege(boolean isVege){
        this.isVege = isVege;
    };
    
    public String getProductName(){
        return productName;
    };
    public String getIsVege(){
        return "The product is vegetarian " + isVege;
    };
    
    void displayData(){
        System.out.println(getProductName());
        System.out.println(getIsVege());
    };
}
