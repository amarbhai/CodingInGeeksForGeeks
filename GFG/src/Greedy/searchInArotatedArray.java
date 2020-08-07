package Greedy;


// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;

public class searchInArotatedArray {

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
			HashMap <Integer,Integer> h=new HashMap<>();
			for (int i = 0; i < ar.length; i++) {
				ar[i] = s.nextInt();

				h.put(ar[i],i);
			}
			int val = s.nextInt();
			if(h.containsKey(val))System.out.println(h.get(val));
			else {
				System.out.println(-1);
			}
		}

	}
}