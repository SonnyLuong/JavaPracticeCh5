/**
	This program computes the volumes of cubes
*/
public class Cubes
{
	public static void main(String[] args)
	{
		double result1 = cubeVolume(2);
		double result2 = cubeVolume(10);
		System.out.println("A cube with side length 2 has volume " + result1);
		System.out.println("A cube with side length 10 has volume " + result2);
	}
	/**
		Computes the volume of a cube.
		@param sidelength the sidelength of a cube
		@return the volume
	*/
	public static double cubeVolume(double sidelength)
	{
		double volume = sidelength * sidelength * sidelength;
		return volume;
	}
}
