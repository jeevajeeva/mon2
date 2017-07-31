# mon2
import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int count =0;
		for(int j=2;j<=s;j++){
		int flag = 0;
	
		for (int i = 2; i <= j/2; i++) {
			if (j % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			count++;
		}
		}
		System.out.println(count);
		
	}
}
