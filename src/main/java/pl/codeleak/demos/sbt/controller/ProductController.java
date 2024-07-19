package pl.codeleak.demos.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.codeleak.demos.sbt.model.Category;
import pl.codeleak.demos.sbt.model.Product;
import pl.codeleak.demos.sbt.service.CategoryService;
import pl.codeleak.demos.sbt.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/products")
    public String products(Model model) {
        Iterable<Product> listP = productService.getAllProducts();
        Iterable<Category> listC = categoryService.getAllCategories();
        model.addAttribute("products", listP);
        model.addAttribute("categories", listC);
        return "homepage";
    }

    @GetMapping("/products/{cid}")
    public String productByCategory(@PathVariable int cid, Model model) {
        Iterable<Product> listP = productService.getProductsByCategory(cid);
        Iterable<Category> listC = categoryService.getAllCategories();
        model.addAttribute("products", listP);
        model.addAttribute("categories", listC);
        return "homepage";
    }

    @GetMapping("/homepage")
    public String homepage(Model model) {
        return "home";
    }
}
