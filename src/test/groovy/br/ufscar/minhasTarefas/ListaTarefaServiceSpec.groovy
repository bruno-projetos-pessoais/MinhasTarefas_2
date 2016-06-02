package br.ufscar.minhasTarefas

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ListaTarefaService)
class ListaTarefaServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Listar listas de tarefas quando não existe nenhuma cadastrada no banco"() {
        expect: "Lista vazia"
        service.listar().empty
    }
}
