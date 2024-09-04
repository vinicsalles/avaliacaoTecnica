const faturamentoPorEstado = {
  SP: 67836.43,
  RJ: 36678.66,
  MG: 29229.88,
  ES: 27165.48,
  Outros: 19849.53,
};

//Desafio 4 - Calculo de Faturamento por porcentagem

const valorTotal = Object.values(faturamentoPorEstado).reduce(
  (total, valor) => total + valor,
  0
);

const percentualPorEstado = {};

for (const estado in faturamentoPorEstado) {
  const valor = faturamentoPorEstado[estado];
  percentualPorEstado[estado] = ((valor / valorTotal) * 100).toFixed(2);
}

console.log(`Valor total mensal: R$${valorTotal.toFixed(2)}`);
console.log("Percentual de representação por estado:");
for (const estado in percentualPorEstado) {
  console.log(`${estado}: ${percentualPorEstado[estado]}%`);
}
