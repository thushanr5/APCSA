public boolean lastDigit(int a, int b) {
  if(a == b%10 || a % 10 == b) //returns if param is equal to the last digit of the other int param
    return true;
  
  return false;
}
