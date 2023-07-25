package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + farenheit + " Grados Farenheit ");
	}
	
	public double RetornoCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit * 100d) / 100;
		return farenheit;
	}

	public void ConvertirCelciusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + kelvin + " Kelvin");
	}
	
	public double RetornoCelciusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		return kelvin;
	}

	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
		celcius = (double) Math.round(celcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Farenheit son " + celcius + " Celcius");
	}
	
	public double RetornoFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
		celcius = (double) Math.round(celcius * 100d) / 100;
		return celcius;
	}

	public void ConvertirKelvinACelcius(double valor) {
		double kelvinCelcius = valor - 273.15;
		kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Kelvin son " + kelvinCelcius + " Celcius");
	}
	
	public double RetornoKelvinACelcius(double valor) {
		double kelvinCelcius = valor - 273.15;
		kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
		return kelvinCelcius;
	}

	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = RetornoKelvinACelcius(valor);
		kelvinFarenheit = RetornoCelciusAFarenheit(kelvinFarenheit);
		kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Kelvin son " + kelvinFarenheit + " Celcius");
	}
	
	public void ConvertirFarenheitAKelvin(double valor) {
		double farenheitKelvin = RetornoFarenheitACelcius(valor);
		farenheitKelvin = RetornoCelciusAKelvin(farenheitKelvin);
		farenheitKelvin = (double) Math.round(farenheitKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Farenheit son " + farenheitKelvin + " Kelvin");
	}

}
