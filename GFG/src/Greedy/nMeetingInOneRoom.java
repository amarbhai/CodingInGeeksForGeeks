package Greedy;


// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;


class Pair{
	int x,y,z;
	Pair(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
}
public class nMeetingInOneRoom {

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
			Pair p[] = new Pair[n];
			int ar[] = new int[n];
			int ar1[] = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i]= s.nextInt();

			}
			for (int i = 0; i < n; i++) {
				ar1[i]= s.nextInt();
				p[i]=new Pair(ar[i],ar1[i],i);

			}

			Arrays.sort(p,new Comparator<Pair>(){
				@Override public int compare(Pair p1, Pair p2) { 
					return p1.y - p2.y; 
				} 

				//	return p1.y-p2.y;
			});

//			ArrayList<Integer> al=new ArrayList<>();
//			al.add(p[0].z);
			
		int finish=p[0].y;
		StringBuffer sb=new StringBuffer();
		sb.append(p[0].z+1);
		sb.append(" ");
			for (int i = 1; i < n; i++) {
				
				if(p[i].x >= finish){
					//al.add(p[i].z);
					//al.add(" ");
					sb.append(p[i].z+1);
					sb.append(" ");
					finish=p[i].y;
					
				}
			}
		
			System.out.println(sb);
			
		}

	}
}
