function countCommonFactors(A, B) {
  const gcd = (a, b) => (b === 0 ? a : gcd(b, a % b));
  let num = gcd(A, B);
  let count = 0;

  for (let i = 1; i * i <= num; i++) {
    if (num % i === 0) {
      count++; // Counting i
      if (i !== num / i) count++; // Counting num / i if it's distinct
    }
  }

  console.log(count);
}
countCommonFactors(5, 15);
