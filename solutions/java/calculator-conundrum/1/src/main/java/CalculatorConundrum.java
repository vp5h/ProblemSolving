class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int result;

        try {
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalOperationException(
                        "Operation '" + operation + "' does not exist"
                    );
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException(
                "Division by zero is not allowed",
                e
            );
        }

        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}