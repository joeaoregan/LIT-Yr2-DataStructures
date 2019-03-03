// Immutability: implementing in Java

public final class Vector{			// can't override instance methods
	private final int N; 			// all instance variables private and final
	private final double[] data;

	public Vector(double[] data)
	{	this.N = data.length;
		this.data - new double[N];
		for(int i = 0; i < N; i++)	// defensive copy of mutable instance variables
			this.data[i] = data[i];
			}
			...						// instance methods don't change instance variables
}

/* Classes should be immutable unless there's a very good reason
to make them mutable... If a class cannot be made immutable,
you should still limit its mutability as much as possible."
-- Joshua Bloch (Java architect) */