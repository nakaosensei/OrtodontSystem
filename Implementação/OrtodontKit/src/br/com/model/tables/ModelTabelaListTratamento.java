/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.tables;

import br.com.model.TratamentoFilter;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class ModelTabelaListTratamento extends UsualTableModel<TratamentoFilter>{
    
    public ModelTabelaListTratamento(){
        super(
                "id=ID",
                "nrProtocolo=Nr Protocolo",
                "valorCombinadoTratamento=R$ Tratamento",
                "valorCombinadoPecas=R$ Produtos",
                "data=Data de inicio",
                "clienteId=Id Cli",
                "clienteNome=Cliente",
                "clienteTelefoneFixo=Fone(Fixo)",
                "clienteTelefoneFixo=Fone(Celular)"        
        );
    }
}
