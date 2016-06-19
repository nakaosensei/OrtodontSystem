
package br.com.model.tables;

import br.com.model.bd.Cliente;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class ModelTabelaListCliente extends UsualTableModel<Cliente>{
    
    
    public ModelTabelaListCliente(){
        super(
            "nome=Nome",
            "cpf=CPF",
            "telfixo1=Telefone(Fixo)",
            "telfixo2=Telefone(Fixo)",
            "telcelular1=Telefone(Celular)",
            "telcelular2=Telefone(Celular)"            
        );
    }
    
    
     
    
}
