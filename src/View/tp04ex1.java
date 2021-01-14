package View;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tp04ex1 extends JFrame implements ActionListener{
	
	// Atributos
	private String nome;
	private double salario;
	private String cargo;
	private JButton anterior;
	private JButton proximo;
	private JButton pesquisar;
	
	// Construtores
	
	public tp04ex1 (String titulo, int largura, int altura, int colinic, int lininic) {
		
		super(titulo);
		setSize(largura, altura);
		setLocation(colinic, lininic);

		JLabel lbNomePesq = new JLabel ("Nome: ");
		JTextField campoNomePesq = new JTextField(30);
		proximo = new JButton("Próximo");
		pesquisar = new JButton("Pesquisar");
		anterior = new JButton("Anterior");
		JLabel lbNome = new JLabel("Nome: ");
		JTextField campoNome = new JTextField(30);
		JLabel lbSalario = new JLabel("Salário: ");
		JTextField campoSalario = new JTextField();
		JLabel lbCargo = new JLabel("Cargo: ");
		JTextField campoCargo = new JTextField();
		
		JPanel Dados1 = new JPanel();
		Dados1.setLayout(new FlowLayout());
		JPanel Dados0 = new JPanel();
		Dados0.setLayout(new FlowLayout());
		JPanel Dados2 = new JPanel();
		Dados2.setLayout(new GridLayout(4,2));
		
		
		Dados1.add(lbNomePesq);
		Dados1.add(campoNomePesq);
		Dados0.add(pesquisar);
		Dados2.add(lbNome);
		Dados2.add(campoNome);
		Dados2.add(lbSalario);
		Dados2.add(campoSalario);
		Dados2.add(lbCargo);
		Dados2.add(campoCargo);
		Dados2.add(anterior);
		Dados2.add(proximo);
		
		add(Dados1);
		add(Dados0);
		add(Dados2);
		
		pesquisar.addActionListener(this);
		anterior.addActionListener(this);
		proximo.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pesquisar ) {
			
		}
		if(e.getSource() == anterior ) {
			
		}
		if(e.getSource() == proximo ) {
			
		}
	}
	// Getters & Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public JButton getAnterior() {
		return anterior;
	}

	public void setAnterior(JButton anterior) {
		this.anterior = anterior;
	}

	public JButton getProximo() {
		return proximo;
	}

	public void setProximo(JButton proximo) {
		this.proximo = proximo;
	}

	public JButton getPesquisar() {
		return pesquisar;
	}

	public void setPesquisar(JButton pesquisar) {
		this.pesquisar = pesquisar;
	}
	
	
}
