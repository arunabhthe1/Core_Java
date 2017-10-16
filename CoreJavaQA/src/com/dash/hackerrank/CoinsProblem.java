package com.dash.hackerrank;

import java.util.Scanner;

public class CoinsProblem {

	public static void arrangeCoins(long[] _coins){
		int count=0;
		int rowCount=0;
		for(Long coin:_coins){
			count=0;
			
			//for(count=0;count<=coin;)
			
		}
		
		
	}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _coins_size = 0;
        _coins_size = Integer.parseInt(in.nextLine().trim());
        long[] _coins = new long[_coins_size];
        long _coins_item;
        for(int _coins_i = 0; _coins_i < _coins_size; _coins_i++) {
            _coins_item = Long.parseLong(in.nextLine().trim());
            _coins[_coins_i] = _coins_item;
        }
        
        arrangeCoins(_coins);
        
    }
}
