package dev.langchain4j.model.googleai;

public class ThinkingConfig {

    private Integer thinkingBudget;

    public ThinkingConfig() {}
    public ThinkingConfig(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
    }

    public Integer getThinkingBudget() {
        return thinkingBudget;
    }

    public void setThinkingBudget(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
    }

}
