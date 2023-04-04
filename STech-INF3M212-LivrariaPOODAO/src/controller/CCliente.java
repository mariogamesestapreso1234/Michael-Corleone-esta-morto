/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author jbferraz
 */
public class CCliente {

    ArrayList<Cliente> clientes = new ArrayList<>();
    int idCliente = 1;

    /**
     * geraID gerencia a geração de id's autoincrement para Cliente.
     *
     * @return
     */
    public int geraID() {
        return this.idCliente++;
    }

    /**
     * addCliente adiciona um cliente na lista de clientes.
     *
     * @param c
     */
    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    /**
     * getClientes retorna a lista de clientes.
     *
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    /**
     * removeCliente remove Cliente da lista de clientes.
     *
     * @param c
     */
    public void removeCliente(Cliente c) {
        this.clientes.remove(c);
    }

    /**
     * mockClientes inicializa aplicação com clientes.
     */
    public void mockClientes() {
        Cliente c1 = new Cliente();
        c1.setIdCliente(this.geraID());
        c1.setNomeCliente("Juvenal das Candongas");
        c1.setCpf("49820219027");
        c1.setEndereco("Rua das Oliveiras");
        c1.setTelefone("51999889988");
        this.addCliente(c1);
        Cliente c2 = new Cliente();
        c2.setIdCliente(this.geraID());
        c2.setNomeCliente("Barbara Paz");
        c2.setCpf("77631040079");
        c2.setEndereco("Rua das Flores");
        c2.setTelefone("51988998899");
        this.addCliente(c2);
    }

    /**
     * getClienteCPF pesquisa cliente pelo CPF e retorna o cliente 
     * e caso não encontre retorna nulo podendo cadastrar.
     * @param cpf
     * @return
     */
    public Cliente getClienteCPF(String cpf) {
        Cliente c = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                c = cliente;
                break;
            }
        }

        return c;
    }

}//fim classe controller
