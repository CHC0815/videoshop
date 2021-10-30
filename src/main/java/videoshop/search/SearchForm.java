package videoshop.search;

import javax.validation.constraints.NotEmpty;

class SearchForm {

    @NotEmpty(message = "{SearchForm.search.NotEmpty}")
    private final String search;

    public SearchForm(String search) {
        this.search = search;
    }

    public String getSearch() {
        return this.search;
    }
}
