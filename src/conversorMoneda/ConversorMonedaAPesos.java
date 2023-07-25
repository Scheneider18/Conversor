package conversorMoneda;

import javax.swing.JOptionPane;

public class ConversorMonedaAPesos {

	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 16.89;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Colombianos");
	}

	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 18.63;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Colombianos");
	}

	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 21.69;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Colombianos");
	}

	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.12;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Colombianos");
	}

	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.013;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Colombianos");
	}

}
