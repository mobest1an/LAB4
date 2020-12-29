public class CenturyException extends IndexOutOfBoundsException {
    String message;
    String cause;
    CenturyException(String message, String cause) {
        this.message = message;
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return message + "ОШИБКА ИЗ-ЗА " + cause;
    }
}