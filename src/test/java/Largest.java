class Largest {
    Largest(){
    };
    public Double FindLar_3(Double n1, Double n2, Double n3) {
        Double largest;
        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }
            else {
                largest = n3;
            }
        } 
        else {
        // checks if n2 is greater than or equal to n3
            if (n2 >= n3) {
                largest = n2;
            }
            else {
                largest = n3;
            }
        }
        return largest;
  }
}





