package flyweigth;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class InventoryTest {

    @Test
    public void mustReturnProducts() {
        Inventory inventory = new Inventory();
        inventory.register("ProdutoA", "Descricao produtoA", "CategoriaA", "Descricao categoriaA");
        inventory.register("ProdutoB", "Descricao produtoB", "CategoriaB", "Descricao categoriaB");
        inventory.register("ProdutoC", "Descricao produtoC", "CategoriaA", "Descricao categoriaA");
        inventory.register("ProdutoD", "Descricao produtoD", "CategoriaB", "Descricao categoriaB");

        List<String> result = Arrays.asList(
                "Produto{nome='ProdutoA', descricao='Descricao produtoA', categoria='CategoriaA', descricao='Descricao categoriaA'}",
                "Produto{nome='ProdutoB', descricao='Descricao produtoB', categoria='CategoriaB', descricao='Descricao categoriaB'}",
                "Produto{nome='ProdutoC', descricao='Descricao produtoC', categoria='CategoriaA', descricao='Descricao categoriaA'}",
                "Produto{nome='ProdutoD', descricao='Descricao produtoD', categoria='CategoriaB', descricao='Descricao categoriaB'}");

        assertEquals(result, inventory.getProducts());
    }

    @Test
    public void mustReturnTotalCities() {
        Inventory inventory = new Inventory();
        inventory.register("ProdutoA", "Descricao produtoA", "CategoriaA", "Descricao categoriaA");
        inventory.register("ProdutoB", "Descricao produtoB", "CategoriaB", "Descricao categoriaB");
        inventory.register("ProdutoC", "Descricao produtoC", "CategoriaA", "Descricao categoriaA");
        inventory.register("ProdutoD", "Descricao produtoD", "CategoriaB", "Descricao categoriaB");
        inventory.register("ProdutoE", "Descricao produtoE", "CategoriaC", "Descricao categoriaC");

        assertEquals(3, CategoryFactory.getTotalCategories());
    }
    
}
