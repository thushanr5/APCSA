public boolean posNeg(int a, int b, boolean negative) {
  if(negative && (a<0 && b<0))
      return true;
  else if(negative == false && ((a<0 && b>0) || (a>0 && b<0)))
    return true;
  else 
    return false;
}
