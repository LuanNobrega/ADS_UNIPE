let form = document.querySelector('form'); ///Pegando tudo que está no form
let ul = document.querySelector('ul');
let h1 = document.querySelector('h1');

form.onsubmit = function(event){
    event.preventDefault(); //Deixa de exectar o comportamento padrão.
    console.log("Entrou no clique do botão");

    let input= form.querySelector('input'); //Pegando tudo que está no input do form;
    let valor = input.value; //Pegando o valor do input;

    let li = document.createElement('li');
    li.textContent = valor; //Adicionando uma linha com as infomções que estão dentro do input;

    let botao = document.createElement('button');
    botao.textContent = "X"; //Criando um botão na linha
    botao.setAttribute('class', 'botao'); //Colocando uma classe pra esse botão que foi adicionado. 
    
    li.appendChild(botao); //Colocando o botão na linha
    ul.appendChild(li); //Colocando a linha/
    input.value = ""; //Zerando as informações do campo;
}

ul.onclick = (evento) =>{
    if(evento.target.classList.contains('botao')){
        console.log('Apagando item');
        evento.target.parentElement.remove(); //apagando toda a linha, que o botão X é filho de li.
    }
}

h1.onmouseover = function(e) {
    h1.setAttribute('class', 'cima')
}

h1.onmouseout = () =>{
    h1.setAttribute('class', 'fora');
}