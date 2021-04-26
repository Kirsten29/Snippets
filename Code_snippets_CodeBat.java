//Code snippets Codingbat
//sleepIn
public boolean sleepIn(boolean weekday, boolean vacation) {
	if (!weekday || vacation) {
	   return true;
	}
	return false;
}

//monkeyTrouble is both smiling or neither one. (2xtrue=true, 2xfalse=true, true/false=false)
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	if (aSmile || bSmile) {
		return true;
	}
	if (!aSmile && bSmile) {
		return true;
	}
	else (!aSmile || bSmile) {
		return false;
	}
}

//shorter: return ((aSmile && bSmile) || (!aSmile && !bSmile));
//or very short: return (aSmile == bSmile); 

//sumDouble Given two int values, return their sum. Unless the two values are ==, then return double their sum.
//sumDouble(1, 2) -> 3, sumDouble(3, 2) -> 5, sumDouble(2, 2) -> 8
public int sumDouble(int a, int b) {
	//Store the sum in a local variable
	int sum = a + b;
	//Double it if a and b are the same
	if (a == b) {
		sum = sum * 2;
	}
	
	return sum;
}

//diff21, given an int n, return absolute diff between n and 21, except return double the absolute diff if n is over 21
public int diff21(int n) {
	if (n <=21) {
		return 21 - n;
	} else {
		return (n-21) * 2;
	}
}

//parrotTrouble when parrot talks before 7 or after 20= true.
public boolean parrotTrouble(boolean talking, int hour) {
	return (talking && (hour < 7 || hour > 20));
}

//makes10. Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
public boolean makes10(int a, int b) {
	return (a == 10 || b == 10 || a + b == 10);
}

//NearHundred, given an int n = true if it is within 10, 100 or 200. math.abs(num) computes the absolute value of a number
public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}

//posNeg, given 2 int values, return true if one is negative and one is positive.Except if the parameter 'negative' is true, 
//then return only if both are negative.
public boolean posNeg(int a, int b, boolean negative) {
   if (negative) {
		return (a < 0 && b < 0);
   }
   else {
	   return ((a < 0 && b > 0) || (a > 0 && b < 0));
   }
}
