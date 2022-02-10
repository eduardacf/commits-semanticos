package br.com.eduardacf.type;

public enum CommitsEnum {

    FIX,
    FEAT,
    DOCS,
    STYLE,
    REFACTOR,
    BUILD,
    TEST,
    ENV,
    CHORE;


    CommitsEnum() {
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
