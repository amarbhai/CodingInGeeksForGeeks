package Hashing;

// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;

public class relativeSorting {

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
			int n1 = s.nextInt();
			int ar[] = new int[n];
			int ar1[] = new int[n1];
			TreeSet <Integer>tr = new  TreeSet<>();
			StringBuffer sb = new StringBuffer("");
			HashMap <Integer,Integer> hm= new HashMap<>();
			for (int i = 0; i < n; i++) {
				ar[i] = s.nextInt();
				tr.add(ar[i]);
				//love this one
				hm.put(ar[i], hm.getOrDefault(ar[i], 0)+1);
			}
			for (int i = 0; i < n1; i++) {
				ar1[i] = s.nextInt();
				//sb.append(ar1[i]+" ");

				if(tr.contains(ar1[i])){
					tr.remove(ar1[i]);
					//System.out.println(hm.get(ar1[i]));
					while(hm.get(ar1[i]) > 0){
						sb.append(ar1[i]);
						sb.append(" ");

						hm.put(ar1[i], hm.get(ar1[i])-1);
					}
				}
			}

			for (Integer value : tr){ 
				//	System.out.println(hm.get(value));
				//int i=2;
				while(hm.get(value) > 0){
					sb.append(value);
					sb.append(" ");
					hm.put(value, hm.get(value)-1);
					//System.out.println(hm.get(value)+"ch");
				}
			}
			//	sb.append(value+" ");

			System.out.println(sb);
		}

	}
}