//package one;
//
//import java.util.Scanner; 
//
//public class Two {
//	
//	public static void main(String args[]){
//		Scanner input = new Scanner (System.in);
//		String in = "";
//		int x=1 , y=2;
//		int i=0,j=0;
//		int xy[][] = new int [x][y];
//		int xy1[][] = {0},{0};
//		do{
//			
//			System.out.print("Enter x1: ");
//			xy[i][j] = input.nextInt();
//			j++;
//			System.out.print("Enter y1: ");
//			xy[i][j] = input.nextInt();
//			i++;
//			System.out.print("(m)ore, (e)nd : ");
//			in = input.next();
//			while(in.equals("e")||in.equals("s")){
//					System.out.print("(s)how points, (q)uit : ");
//					in = input.next();
//					if(in.equals("s"))
//					{
//						for(int a=0;a<x;a++)
//						{
//							int b =0;
//							System.out.printf("Point %d = (",a+1);
//								System.out.print(xy[a][b]+",");
//								b++;
//								System.out.print(xy[a][b]+")\n");
//						}
//					}
//			}
//			if(in.equals("m"))
//			{
//				xy1[x][y] = xy[x][y];
//				x++;y++;
//			}
//				int xy[][] = new int [x][y];
//		}while(in.equals("s")||in.equals("m")||in.equals("e"));
//		System.out.print("Bye");
//	}
//}
