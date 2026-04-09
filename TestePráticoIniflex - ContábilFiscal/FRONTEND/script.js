let funcionarios = [];

// 🔄 CARREGAR DADOS
async function carregarFuncionarios() {
    const response = await fetch("funcionarios.json");
    funcionarios = await response.json();
    renderTabela();
}

// 🖥️ RENDER TABELA
function renderTabela() {
    const tabela = document.getElementById("tabela");
    tabela.innerHTML = "";

    funcionarios.forEach(f => {
        const linha = `
            <tr>
                <td>${f.nome}</td>
                <td>${formatarData(f.dataNascimento)}</td>
                <td>${f.funcao}</td>
                <td>R$ ${f.salario.toFixed(2)}</td>
            </tr>
        `;
        tabela.innerHTML += linha;
    });
}

// 📅 FORMATAR DATA
function formatarData(data) {
    const d = new Date(data);
    return d.toLocaleDateString("pt-BR");
}

// 💰 AUMENTO 10%
function aplicarAumento() {
    funcionarios = funcionarios.map(f => ({
        ...f,
        salario: f.salario * 1.10
    }));
    renderTabela();
}

// ❌ REMOVER JOÃO
function removerJoao() {
    funcionarios = funcionarios.filter(f => f.nome !== "João");
    renderTabela();
}

// 📊 AGRUPAR POR FUNÇÃO
function mostrarAgrupados() {
    const resultado = document.getElementById("resultado");
    const grupos = {};

    funcionarios.forEach(f => {
        if (!grupos[f.funcao]) {
            grupos[f.funcao] = [];
        }
        grupos[f.funcao].push(f.nome);
    });

    let html = "";
    for (let funcao in grupos) {
        html += `<p><strong>${funcao}:</strong> ${grupos[funcao].join(", ")}</p>`;
    }

    resultado.innerHTML = html;
}

// 🎂 ANIVERSARIANTES (OUTUBRO E DEZEMBRO)
function mostrarAniversariantes() {
    const resultado = document.getElementById("resultado");

    const lista = funcionarios.filter(f => {
        const mes = new Date(f.dataNascimento).getMonth() + 1;
        return mes === 10 || mes === 12;
    });

    resultado.innerHTML = lista.map(f => f.nome).join(", ");
}

// 👴 MAIS VELHO
function mostrarMaisVelho() {
    const resultado = document.getElementById("resultado");

    const maisVelho = funcionarios.reduce((a, b) =>
        new Date(a.dataNascimento) < new Date(b.dataNascimento) ? a : b
    );

    resultado.innerHTML = `Mais velho: ${maisVelho.nome}`;
}

// 💵 TOTAL SALÁRIOS
function mostrarTotal() {
    const resultado = document.getElementById("resultado");

    const total = funcionarios.reduce((soma, f) => soma + f.salario, 0);

    resultado.innerHTML = `Total: R$ ${total.toFixed(2)}`;
}

// 📊 SALÁRIOS MÍNIMOS (considerando R$1212)
function mostrarSalariosMinimos() {
    const resultado = document.getElementById("resultado");

    let html = "";

    funcionarios.forEach(f => {
        const qtd = f.salario / 1212;
        html += `<p>${f.nome}: ${qtd.toFixed(2)} salários mínimos</p>`;
    });

    resultado.innerHTML = html;
}

// 🚀 AUTO LOAD
carregarFuncionarios();