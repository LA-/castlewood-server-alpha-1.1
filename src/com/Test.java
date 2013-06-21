package com;

import java.util.BitSet;

public class Test
{

	public static void main(final String... args)
	{
		final boolean[] booleans = new boolean[10000];
		final BitSet bitset = new BitSet(10000);
		long start = System.nanoTime();
		for (int i = 0; i < 9999; i++)
		{
			booleans[i] = true;
		}
		long elapsed = System.nanoTime() - start;
		System.out.println("Using a booean array: " + elapsed);
		start = System.nanoTime();
		for (int i = 0; i < 9999; i++)
		{
			bitset.set(i, true);
		}
		elapsed = System.nanoTime() - start;
		System.out.println("Using a bitset: " + elapsed);
		start = System.nanoTime();
		for (int i = 0; i < 9999; i++)
		{
			if (booleans[i])
			{

			}
		}
		elapsed = System.nanoTime() - start;
		System.out.println("Using a booean array [if statements]: " + elapsed);
		start = System.nanoTime();
		for (int i = 0; i < 9999; i++)
		{
			if (bitset.get(i))
			{

			}
		}
		elapsed = System.nanoTime() - start;
		System.out.println("Using a bitset [if statements]: " + elapsed);
	}

}
