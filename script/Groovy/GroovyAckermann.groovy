def ackermann(x, y) {
   
   if (x == 0) return y+1
   if (y == 0) return ackermann(x-1, 1)
   return ackermann(x-1, ackermann(x, y-1))
}