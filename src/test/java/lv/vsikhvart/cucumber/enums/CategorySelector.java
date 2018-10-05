package lv.vsikhvart.cucumber.enums;


public enum CategorySelector {

    Health("Health"),
    Life("Life");

    private String categorySelectorId;

    CategorySelector(String categorySelectorId) {
        this.categorySelectorId = categorySelectorId;
    }

    @Override
    public String toString() {
      return categorySelectorId;
    }
}
