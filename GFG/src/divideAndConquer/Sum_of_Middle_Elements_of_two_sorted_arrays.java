package divideAndConquer;


// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;

public class Sum_of_Middle_Elements_of_two_sorted_arrays {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int t = s.nextInt();

		while (t-- > 0) {
			//code
			int n = s.nextInt();
			int ar[] = new int[n];
			int ar1[] = new int[n];
			
			for (int i = 0; i < ar1.length; i++) {
				ar[i] = s.nextInt();
			}
			for (int i = 0; i < ar1.length; i++) {
				ar1[i] = s.nextInt();
			}
		int ptr=0,ptr1=0;
//			boolean rare=false;
//			for (int i = 0; i < n+1; i++) {
//				if(ptr >=n || ptr1>=n){
//					rare=true;
//					break;
//				}
//				
//				if (ar[ptr]>=ar1[ptr1]) {
//					ptr1++;
//				} else {
//					ptr++;
//				}
//			}
//			if(rare){
//				
//			}
			
			//using merging of two arrays
			int ar2[] = new int[2*n];
			int count=0;
			for (int i = 0; i < n+1; i++) {
				if(ptr == n )break;
				if(ptr1 == n)break;
				//if(count == n)break;
				
				if(ar[ptr] <= ar1[ptr1]){
					ar2[count++]=ar[ptr++];
				}else{
					ar2[count++]=ar1[ptr1++];
				}
			}
//			if(ptr >= n){
//				for (int i = ptr1; i < n-ptr1+1; i++) {
//					ar2[count++]=ar1[i];
//					
//				}
//			}
//			if(ptr1 >= n){
//				for (int i = ptr; i < n-ptr+1; i++) {
//					ar2[count++]=ar[i];
//					
//				}
//			}
			//int sum=ar2[(2*n)/2 -1]+ar2[((2*n)/2) ];
			
			int sum=ar2[count-2]+ar2[count-1 ];
			
			//System.out.println(sum +"n"+ar2[count-1]+"b"+ar2[count-2]+"jj"+Arrays.toString(ar2));
			System.out.println(sum );
			
		}

	}
}
