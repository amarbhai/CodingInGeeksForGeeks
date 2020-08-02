package Heap;


// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;

public class medianOfrunningStream {
	static int a,b;
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
int minn=0,maxx=0;
double n,med=0,rem;
		while (t-- > 0) {
			//code
			n = s.nextInt();
			PriorityQueue<Double> min=new PriorityQueue<>();
			PriorityQueue<Double> max=new PriorityQueue<>(Collections.reverseOrder());
			if(minn == maxx){
				if (med > n) {
					min.add(n);
					minn++;
					med=min.peek();
					System.out.println(med);
				} else {
					max.add(n);
					maxx++;
					med=max.peek();
					System.out.println(med);
				}
				
			}
			else if (minn > maxx) {
				if (n < med) {
				rem=min.remove();
				min.add(n);
				max.add(rem);
				maxx++;
				} else {
					max.add(n);
					maxx++;
				}
				med=(double)((max.peek()+min.peek())/2);
				System.out.println(med);
			}
			else {
				if (n >med) {
				rem=max.remove();
				max.add(n);
				min.add(rem);
				maxx++;
				} else {
					min.add(n);
					minn++;
				}
				
				med=(double)((max.peek()+min.peek())/2);
				//System.out.println(minn+" nn"+maxx);
				System.out.println(med);
			}
			
			
		}
		//System.out.println(minn +" "+maxx);
	}
}
