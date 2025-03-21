// let a = 0,
//   b = 1,
//   c;
// console.log(a);
// console.log(b);
// for (let i = 0; i < 3; i++) {
//   c = a + b;
//   console.log(c);
//   a = b;
//   b = c;
// }

const arr = new Array(3).fill(0);
let a = 0,
  b = 1;
console.log(a);
console.log(b);
arr.reduce((acc) => {
  console.log(acc);
  a = b;
  b = acc;
  return a + b;
}, a + b);

// 0
// 1
// 1

// a = 1,b=1,c=2
// 2
// 3
