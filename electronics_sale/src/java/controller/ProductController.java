/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import service.impl.ProductServiceImpl;
import service.ProductService;

/**
 *
 * @author tranv
 */
@Controller
@Configuration
@ComponentScan("service.impl")

public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String product(ModelMap mm) {
        mm.put("listProduct", productService.getListProduct());
        return "product";
    }

//    @RequestMapping("/product")
//    public String ListProductByCategoryID(ModelMap mm,@RequestParam int categoryID){
//        mm.put("danhsachsanpham",sanPhamService.getListProductByCategoryID(categoryID));
//        return "product";
//    }
}
