function main(n, numbers) {
  // const [nStr,a] = input.split("\n");
  // const n = Number(nStr);
  // const numbers = a.split(" ").map(Number);

  const arraySum = numbers.reduce((acc, e) => acc + e, 0);
  const op = Math.ceil(arraySum / n);
  console.log(op);
}

main(5, [1, 2, 3, 4, 5]);
