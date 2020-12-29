class ShoggoteLVLException extends Exception {
    String message;
    String cause;
    ShoggoteLVLException(String message, String cause) {
        this.message = message;
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return message + "ОШИБКА ИЗ-ЗА: " + cause;
    }
}