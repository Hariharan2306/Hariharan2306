function xorUpto(n) {
  if (n % 4 === 0) return n;
  if (n % 4 === 1) return 1;
  if (n % 4 === 2) return n + 1;
  return 0;
}

const a = [12, 4, 4, 12, 0];
const op = a.map((e) => (xorUpto(e) === e ? e : undefined));
console.log(op);
