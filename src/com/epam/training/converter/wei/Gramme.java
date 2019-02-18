package com.epam.training.converter.wei;

import com.epam.training.converter.Converter;

public class Gramme implements Converter {
	//-----------------------------------------------------------------------------
	private static final double GRAMSINKILO = 1000.0;
	private static final double GRAMSINCENTNER = 100_000.0;
	private static final double GRAMSINTONNE = 1_000_000.0;
	//-----------------------------------------------------------------------------

	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static double toKilo(double g)
	{
		return (g / Gramme.GRAMSINKILO);
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static double toCentner(double g)
	{
		return (g / Gramme.GRAMSINCENTNER);
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static double toTonne(double g)
	{
		return (g / Gramme.GRAMSINTONNE);
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
}
