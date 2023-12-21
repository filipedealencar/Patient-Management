# Projeto de Gerenciamento de Pacientes - Luis Filipe J Alencar

Este é um projeto back-end para gerenciamento de pacientes desenvolvido em Java com Spring Boot. 
Ele utiliza um banco de dados postgres para armazenar informações sobre os pacientes, como nome, telefone, e detalhes médicos.


## Estrutura do Projeto

 **com.project.patient.management.entity.Patient**
 
Este pacote contém a classe Patient, que representa a entidade do paciente. Cada paciente possui atributos como nome, telefone, e informações médicas.

```bash
  @Entity
public class Patient {
    // ... (atributos e métodos de acesso)
}
   ```

 **com.project.patient.management.controller.PatientController**
 
O pacote controller contém a classe PatientController, responsável por manipular as requisições HTTP relacionadas aos pacientes. 
Ele realiza operações como buscar todos os pacientes, buscar um paciente por ID, inserir, atualizar e excluir pacientes.

```bash
 @RestController
@RequestMapping("/patients")
public class PatientController {
    // ... (métodos para manipular requisições relacionadas a pacientes)
  }
}
   ```

 **com.project.patient.management.repository.PatientRepository**
 
O pacote repository contém a interface PatientRepository, que estende JpaRepository. 
Essa interface fornece métodos convenientes para acessar o banco de dados relacionados aos pacientes.

```bash
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // ... (métodos de consulta personalizados, se necessário)
}
   ```

## Configuração e Uso

- **Configuração do Banco de Dados:** O projeto está configurado para usar um banco de dados embutido (H2) por padrão.
  Você pode ajustar as configurações do banco de dados no arquivo application.properties se necessário.
  
- **Execução do Projeto:**Execute a aplicação Spring Boot. A classe principal é Application.java.
  Após a execução, a aplicação estará disponível em http://localhost:8080.
  
- **Testando a API:** Utilize ferramentas como o Postman ou o cURL para testar as operações da API. Os endpoints estão definidos no PatientController.

## Endpoints Disponíveis

- **GET /patients:** Retorna todos os pacientes.
- **GET /patients/{id}:** Retorna informações de um paciente específico com base no ID.
- **GET /patients/search/{firstName}:** Retorna pacientes cujos nomes começam com o valor fornecido.
- **POST /patients:** Adiciona um novo paciente.
- **PUT /patients/{id}:**  Atualiza as informações de um paciente existente com base no ID.
- **DELETE /patients/{id}:**  Exclui um paciente com base no ID.

  Certifique-se de substituir {id} e {firstName} pelos valores desejados ao fazer chamadas para esses endpoints.

Esse é um projeto básico para ilustrar o gerenciamento de pacientes. 

## Front-end

O código-fonte do projeto front-end relacionado a este projeto está disponível [aqui](https://github.com/filipedealencar/patient_management).

## Contribuições

Contribuições são bem-vindas! Se você encontrar problemas, bugs ou melhorias potenciais, sinta-se à vontade para abrir uma issue ou enviar um pull request.

Obrigado por explorar o Weather Hub! Esperamos que tenha uma experiência agradável.
