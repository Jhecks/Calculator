public enum OperationType {
    PLUS {
        int apply(int x, int y) {
            return x + y;
        }
    },
    MINUS {
        int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY{
        int apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE{
        int apply(int x, int y) {
            return x / y;
        }
    };

    abstract int apply(int x, int y);

}