/**
 * 
 */

/**
 * @author AMARGURU
 *
 */

// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;

public class maximizeTheCutSegments {

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
int count =0;
count=1;
		while (t-- > 0) {
			//code
			
			int n = s.nextInt();
			int ar[]=new int[3];
			for(int i=0;i<3;++i)ar[i] = s.nextInt();
			
			int m[][]=new int[3][n+1];
			Arrays.sort(ar);
			for(int i=0;i<3;++i){
				for(int j=0;j<n+1;++j){
					if(j==0)m[i][j]=0;
					else if (i==0) {
						if(j%ar[i] == 0)m[i][j]=j/ar[i];
						else m[i][j]=0;
					}
					else{
						if(ar[i]>j)m[i][j]=m[i-1][j];
						else if (m[i-1][j]==0 && m[i][j-ar[i]]==0 && j-ar[i]!=0) {
							m[i][j]=0;
						}
						else{
							m[i][j]=m[i-1][j]>1+m[i][j-ar[i]]?m[i-1][j]:1+m[i][j-ar[i]];
						}
					}
				}
			}
			System.out.println(m[2][n]);
		}

	}
}