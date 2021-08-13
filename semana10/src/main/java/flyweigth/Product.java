package flyweigth;

/**
 *
 * @author Weslei
 */
public class Product {
    
    private String name;
    private String description;
    private Category categoryType;

    public Product(String name, String description, Category categoryType) {
        this.name = name;
        this.description = description;
        this.categoryType = categoryType;
    }

    public String getProduct() {
        return "Produto{" +
                "nome='" + this.name + '\'' +
                ", descricao='" + this.description + '\'' +
                ", categoria='" + categoryType.getName()+ '\'' +
                ", descricao='" + categoryType.getDescription()+ '\'' +
                '}';
    }
}
