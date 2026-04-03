class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sumOfNumbers = ((input)*(input+1))/2;
int result = (int) Math.pow(sumOfNumbers, 2);
        return result;

    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for(int i=0; i<=input;i++){
            sum+= (int) Math.pow(i, 2);
 
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
