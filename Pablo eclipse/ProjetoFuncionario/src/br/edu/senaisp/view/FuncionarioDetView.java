package br.edu.senaisp.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.senaisp.model.Funcionario;

public class FuncionarioDetView extends JDialog{

	JLabel lblId = new JLabel("Id:");
	JTextField txtId = new JTextField(null, 20);	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField(null, 20);
	JLabel lblCpf = new JLabel("Cpf:");
	JTextField txtCpf = new JTextField(null, 20);
	JButton btnGravar = new JButton("Gravar"); //declare os objetos no in�cio da classe
	JButton btnFechar = new JButton("Fechar"); 
	
	private Funcionario funcionario = new Funcionario();
	
	public FuncionarioDetView() {
		this.setLayout(new FlowLayout()); // *posiciona os componentes um ap�s o outro
		this.getContentPane().add(lblId);
		this.getContentPane().add(txtId);
		
		this.getContentPane().add(lblNome);
		this.getContentPane().add(txtNome);
		
		this.getContentPane().add(lblCpf);
		this.getContentPane().add(txtCpf);		
		
		this.getContentPane().add(btnGravar); // adiciona o primeiro bot�o
		this.getContentPane().add(btnFechar);


	
	btnGravar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			funcionario.setId(Long.parseLong(txtId.getText()));
			funcionario.setNome(txtNome.getText());
			funcionario.setCpf(txtCpf.getText());
			
			hide();
		}
	});
	
	this.setModal(true); //Deixa a tela como mais importante e não deixa mexer na tela principal
	this.setSize(600, 480);
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	

	public Funcionario setFuncionario() {
		return funcionario;
	}
	
}
