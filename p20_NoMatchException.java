class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class p20_NoMatchException {
    public static void main(String[] args) {
        String country = "USA";
        try {
            if (!country.equals("India")) {
                throw new NoMatchException("The country is not India.");
            }
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
