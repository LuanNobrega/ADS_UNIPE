class Aluno {
    nome;
    matricula;
    nota1;
    nota2;
    nota3;
    constructor (nome, matricula, n1, n2, n3){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    exibirInfo(){
        return `Aluno: ${this.nome} - mat: ${this.matricula} - Nota: N1: ${this.nota1} - N2: ${this.nota2} - N3: ${this.nota3}
        Media: ${this.calculaMedia()}`
    }

    calculaMedia(){
        return ((this.nota1 + this.nota2 + this.nota3)/3).toFixed(2);
    }
}

const a1 = new Aluno('Luan', 202020, 10, 9, 8);
console.log(a1);