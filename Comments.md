    Classe Funcionario: Adição de Dependentes ao funcionário Básico

    public void adicionarDependentes(Dependente dependente) {
        for(int i = 0 ; i < dependentes.length ; i++) {
            if(dependentes[i] == null) {
                dependentes[i] = dependente;
                break;
            } 
        }
    } 

    public void listarDependentes() {
        for(int i = 0 ; i < dependentes.length ; i++) { 
            System.out.println(dependentes[i].getNome());
        }
    }

    Classe TESTES: 

    Dependente d1 = new Dependente("Roberto", "12313435323", LocalDate.of(2019,1,1), Parentesco.FILHO);
    Dependente d2 = new Dependente("Juninho", "15453435323", LocalDate.of(2022,1,1), Parentesco.SOBRINHO);
    Funcionario pessoa1 = new Funcionario("Nathan", "12345678901", LocalDate.of(1989,1,1), 2000.00, new Dependente[2]);
    "Buscar usar adição com ArrayList dos Dependentes com os funcionários"

    pessoa1.adicionarDependentes(d1); 
    pessoa1.adicionarDependentes(d2); 
    pessoa1.listarDependentes();


