function greet(name, callback) {
  const message = `Hello, ${name}!`;
  //   callback(message);
}

// function displayMessage(msg) {
//   console.log(msg);
// }

greet("Alice");
// // Output: Hello, Alice!
// hoisting;

const abc = [1, 2, 3, 4, 5];

const newarr = abc.map((e, i) => {
  if (e > 1) return e;
});
// console.log(newarr);

const sum = abc.reduce((acc, num) => {
  return acc + num;
}, 1);

console.log(sum); // Output: 15

const func = () => "hello";

// multiply using reduce with acc 9
// filter elements divisible by 3 using map and filter
