package com.artify.view.category;

import com.artify.entity.Category;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route("categories")
@ViewController(id = "Category.list")
@ViewDescriptor(path = "category-list-view.xml")
@LookupComponent("categoriesDataGrid")
@DialogMode(width = "64em")
public class CategoryListView extends StandardListView<Category> {
}
