package ee.taltech.tarkvaratehnika.prax1.Info;

public class Info {

    private String message;
    private String name;

    public String getMessage() {
        return message;
    }

    public Info(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
