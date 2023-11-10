import javax.swing.JOptionPane;

public class Projeto_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double nota_01;

			double nota_02;

			double nota_03;

			double nota_04;

			double media;

	       

	       //entrada de dados

	       nota_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1 nota"));

	       nota_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2 nota"));

	       nota_03 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3 nota"));

	       nota_04 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4 nota"));



	       //processamento

	       

	       media=((nota_01*1)+(nota_02*2)+(nota_03*3)+(nota_04*4))/10;

	       

	       //saida de dados

	       

	       JOptionPane.showMessageDialog(null, "A media ponderada é:" +media);

	}

}
