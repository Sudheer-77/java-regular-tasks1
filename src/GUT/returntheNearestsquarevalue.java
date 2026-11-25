package GUT;


public class returntheNearestsquarevalue {
	public static void main(String[] args) {
		int a=mySqrt(38);
		System.out.println(a);
		
	}

	public static int mySqrt(int x) {
        if (x < 2)
         return x;

        int left = 1, right = x / 2, ans = 0;
        
        while (left <= right)
         {
            int mid =  (right + left) / 2;
            long sq = (long) mid * mid;
            if (sq == x)
             return mid;
            else if (sq < x) 
            {
                ans = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return ans;
    }
	}

