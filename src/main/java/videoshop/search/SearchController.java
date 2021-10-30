package videoshop.search;

import org.salespointframework.inventory.UniqueInventory;
import org.salespointframework.inventory.UniqueInventoryItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import videoshop.catalog.VideoCatalog;

@Controller
class SearchController {
    private final VideoCatalog catalog;
    private final UniqueInventory<UniqueInventoryItem> inventory;

    SearchController(VideoCatalog videoCatalog, UniqueInventory<UniqueInventoryItem> inventory) {
        this.catalog = videoCatalog;
        this.inventory = inventory;
    }

    @PostMapping("/search")
    String search(Model model, SearchForm form) {

        model.addAttribute("catalog", "null"); // TODO implement search
        model.addAttribute("title", "search.title");
        return "search";
    }
}