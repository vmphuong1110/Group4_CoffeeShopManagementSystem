package pl.codeleak.demos.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.codeleak.demos.sbt.model.Product;
import pl.codeleak.demos.sbt.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products(Model model) {
        Iterable<Product> listP = productService.getAllProducts();
        model.addAttribute("products", listP);
        return "homepage";
    }
}
