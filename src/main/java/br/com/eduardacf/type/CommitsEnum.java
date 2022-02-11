package br.com.eduardacf.type;

public enum CommitsEnum {

    FIX("fix"),
    FEAT("feat"),
    DOCS("docs"),
    STYLE("style"),
    REFACTOR("refactor"),
    BUILD("build"),
    TEST("test"),
    ENV("env"),
    CHORE("chore");


    private String code;

    CommitsEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
