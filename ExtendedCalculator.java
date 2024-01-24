class ExtendedCalculator{
    
    /**
     * The function "square" takes a float operand and returns the square of that operand.
     * 
     * @return The square of the operand_1 value.
     */
    float square(float operand_1){
        return(operand_1*operand_1);
    }

    /**
     * The function "cube" takes a number as input and returns the cube of that number.
     * 
     * @return The cube of the operand_1 value.
     */
    float cube(float operand_1){
        return(operand_1*operand_1*operand_1);
    }

    // The `float modulo(operand_1, operand_2)` function calculates the remainder when `operand_1` is
    // divided by `operand_2`. It uses the modulus operator `%` to perform the calculation. The
    // function returns the result of the modulo operation as a float value.
    float modulo(float operand_1,float operand_2){
    return(operand_1 % operand_2);
     }
}